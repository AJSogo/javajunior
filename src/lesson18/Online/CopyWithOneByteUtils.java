package lesson18.Online;

import java.io.*;

public class CopyWithOneByteUtils implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

        File destFile = new File(destination); //джава просто встала на этот файл
        if(destFile.exists()){

            throw new FileAlreadyExistsException("Файл назначения уже сущесвтует " +destFile);
        }
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1) //это не конец файла
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
