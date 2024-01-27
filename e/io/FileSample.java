package e.io;

import java.io.File;

/**
 * @author hazel
 */
public class FileSample {
    public static void main(String[] args) {
        FileSample fileSample = new FileSample();
        String pathname = "/Users/hi/Desktop/dev/god";
        //fileSample.checkPath(pathname);
        fileSample.makeDir(pathname);
        fileSample.checkFileMethods(pathname);
    }

    //해당 경로에 파일이 있는지 체크
    public void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists?=" + file.exists());
    }

    //디렉토리 만들기
    public void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make " + pathName + " result =" + file.mkdir());

    }

    public void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(file.isDirectory()); //디렉토리인지 확인
        System.out.println(file.isFile()); //파일인지 확인
        System.out.println(file.isHidden()); //숨김파일인지 확인


    }

}
