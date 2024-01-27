package e.io;

import java.io.File;

/**
 * @author hazel
 */
public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        String pathName = "/Users/hi/Desktop/dev/godofjava/text";
        System.out.println(pathName);
        sample.checkList(pathName);
    }

    public void checkList(String pathName) {
        File file;

        try {
            file = new File(pathName);
            File[] mainFileList = file.listFiles();
            //file.listFiles(new JPGFilenameFIlter());
            for (File tmpFile : mainFileList) {
                System.out.println(tmpFile.getName());

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//박강훈 바보


