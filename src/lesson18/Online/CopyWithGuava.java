package lesson18.Online;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {
        File copied = new File(destination);
        File original = new File(source);
        try {
            com.google.common.io.Files.copy(original, copied);
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
