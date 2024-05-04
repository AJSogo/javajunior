package lesson18.Online;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyWithNioUtils implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

        File destFile = new File(destination); //джава просто встала на этот файл
        if(destFile.exists()){

            throw new FileAlreadyExistsException("Файл назначения уже сущесвтует " +destFile);
        }

        Path copied = Paths.get(destination);
        Path originalPath = Paths.get(source);

        try {
            Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);
        }
        catch ( IOException e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
