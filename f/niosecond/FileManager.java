package f.niosecond;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hazel
 */
public class FileManager {

    public static void main(String[] args) {
        FileManager sample = new FileManager();
        String fileName = "AboutThisBook.txt";
        Path fromPath = sample.writeAndRead(fileName);

        sample.copyMoveDelete(fromPath, fileName);

    }

    public List<String> getContents() {
        ArrayList<String> contents = new ArrayList<>();
        contents.add("이 책은 어쩌구 저쩌구");
        contents.add("이 책은 어쩌구 저쩌구22");
        contents.add("이 책은 어쩌구 저쩌구33");
        contents.add("이 책은 어쩌구 저쩌구44");
        return contents;
    }

    /**
     * 파일 쓰기
     */
    public Path writeFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        List<String> contents = getContents();

        StandardOpenOption openOption = StandardOpenOption.CREATE; //CREATE 옵션은 파일이 존재하지 않으면 새로 생성할 때 사용
        return Files.write(path, contents, charset, openOption); //파일에 쓰기
    }

    /**
     * 파일 읽기
     */
    public void readFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        System.out.println("Path=" + path);
        List<String> fileContents = Files.readAllLines(path, charset);
        for (String tmpContents : fileContents) { //파일 읽기
            System.out.println(tmpContents);
        }
        System.out.println();
    }

    public Path writeAndRead(String fileName) {
        Path returnPath = null;
        try {
            Path path = Paths.get(fileName); //지정된 url 을 Path 객체로 변환

            //write a text file
            returnPath = writeFile(path);

            //read written file
            System.out.println("Created file contents");
            readFile(returnPath);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return returnPath;
    }


    /**
     * 디렉토리 생성 -> 복사 -> 이동 -> 삭제
     */
    public void copyMoveDelete(Path fromPath, String fileName) {
        try {

            Path toPath = fromPath.toAbsolutePath().getParent(); //이전 메소드에서 만든 Path객체를 받아 상대경로니까 절대경로로 변환한다.
            System.out.println(toPath);

            //Make a directory if it is not exist;
            Path copyPath = toPath.resolve("coplied"); //부모 경로에서 새로운 경로 객체 생성
            if (!Files.exists(copyPath)) {//해당 경로가 존재하지않을 때 디렉토리 생성
                Files.createDirectories(copyPath);
            }

            //Copy file
            Path copiedFilePath = copyPath.resolve(fileName); //복사 작업을 하기 위한 세로운 파일 경로 객체 생성
            StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING; //옵션은 기존파일이 있으면 새 파일로 변경
            Files.copy(fromPath, copiedFilePath, copyOption); //파일 복사

            //Read copied file
            System.out.println("**** Copied file contents ***");
            readFile(copiedFilePath); //복사한 파일 읽기

            //move file
            Path movedFilePath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"), copyOption); //옮긴 파일의 이름 변경


            System.out.println("movedFilePath = " + movedFilePath);
            System.out.println("copyPath = " + copyPath);
            //delete files
            Files.delete(movedFilePath); //
            Files.delete(copyPath);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
