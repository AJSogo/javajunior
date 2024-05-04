package lesson18.Online;

import java.io.IOException;

public class TestCopy {
    public static void main(String[] args) {
        CopyWithOneByteUtils copyWithOneByteUtils = new CopyWithOneByteUtils();
        CopyWithNioUtils copyWithNioUtils = new CopyWithNioUtils();
        CopyWithGuava copyWithGuava = new CopyWithGuava();
        CopyWithApache copyWithApache = new CopyWithApache();



        long time1 = System.currentTimeMillis();
        try {
            copyWithOneByteUtils.copyFile("C:\\Users\\alina\\Downloads\\Telegram Desktop\\Lection_FiltersListenersMVC.ppt",
                    "src\\lesson18\\Online\\copy1");
        }
        catch (FileCopyFailedException e){
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Copy with one byte " + (time2 - time1));



        long time3 = System.currentTimeMillis();
        try {
            copyWithNioUtils.copyFile("C:\\Users\\alina\\Downloads\\Telegram Desktop\\Lection_FiltersListenersMVC.ppt",
                    "src\\lesson18\\Online\\copy2");
        }
        catch (FileCopyFailedException e){
            e.printStackTrace();
        }
        long time4 = System.currentTimeMillis();
        System.out.println("Copy with NIO " + (time4 - time3));



        long time5 = System.currentTimeMillis();
        try {
            copyWithGuava.copyFile("C:\\Users\\alina\\Downloads\\Telegram Desktop\\Lection_FiltersListenersMVC.ppt",
                    "src\\lesson18\\Online\\copy3");
        }
        catch (FileCopyFailedException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long time6 = System.currentTimeMillis();
        System.out.println("Copy with Guava " + (time6 - time5));



        long time7 = System.currentTimeMillis();
        try {
            copyWithApache.copyFile("C:\\Users\\alina\\Downloads\\Telegram Desktop\\Lection_FiltersListenersMVC.ppt",
                    "src\\lesson18\\Online\\copy4");
        }
        catch (FileCopyFailedException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long time8 = System.currentTimeMillis();
        System.out.println("Copy with Apache " + (time8 - time7));




        }
}
