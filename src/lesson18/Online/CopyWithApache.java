package lesson18.Online;

/*
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class CopyWithApache implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {

        File copied = new File(destination);
        File original = new File(source);

        try {
            FileUtils.copyFile(original, copied);
        }
        catch (IOException e){
            throw new FileCopyFailedException(e.getMessage());
        }

        /*assertThat(copied).exists();
        assertThat(Files.readAllLines(original.toPath())
                .equals(Files.readAllLines(copied.toPath())));*/

        /*File copied = new File(source);
        File original = new File(destination);
        try {
            com.google.common.io.Files.copy(original, copied);
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
*/