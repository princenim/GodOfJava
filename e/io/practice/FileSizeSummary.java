package e.io.practice;

import java.io.File;
import java.text.DecimalFormat;

/**
 * @author hazel
 */
public class FileSizeSummary {

    private final long KB = 1024;
    private final long MB = 1024 * 1024;
    private final long GB = 1024 * 1024 * 1024;
    DecimalFormat formatter = null;

    public FileSizeSummary() {
        String pattern = "#,##0.0#";
        formatter = new DecimalFormat(pattern);
    }

    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "/Users/hyeonjungchoi/Desktop/dev/godofjava/text";
        long sum = sample.printFileSize(path);

        System.out.println(path + "'s total size= " + sum);
    }

    //파일의 크기 출력
    public long printFileSize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;
        if (dir.isDirectory()) {//디렉토리일때
            File[] fileList = dir.listFiles();
            for (File file : fileList) {
                if (file.isFile()) { //디렉토리안의 파일일때
                    String tmpFileName = file.getAbsolutePath(); //파일의 절대경로
                    long length = file.length(); //파일의 길이
                    System.out.println(tmpFileName + "=" + length);
                    sum += length;
                } else { //디렉토리안에 디렉토리 일때
                    System.out.println("=================");
                    String tmpDirName = file.getAbsolutePath();
                    System.out.println(tmpDirName);
                    long fileLength = printFileSize(tmpDirName);
                    printInfo(tmpDirName, fileLength, true);
                    sum += fileLength;
                }
            }
        }
        return sum;
    }

    public void printInfo(String path, long fileLength, boolean dirFlag) {
        if (dirFlag) {
            path = "[" + path + "] TOTAL";
        }
        System.out.println(path + "= " + convertFileLength(fileLength) + "(" + fileLength + ")");

    }

    public String convertFileLength(long fileLength) {
        if (fileLength < KB) {
            return fileLength + "b";
        } else if (fileLength < MB) {
            return formatter.format(1.0 * fileLength / KB) + " kb";
        } else if (fileLength < GB) {
            return formatter.format(1.0 * fileLength / MB) + " mb";
        } else {
            return formatter.format(1.0 * fileLength / GB) + " gb";
        }
    }
}
