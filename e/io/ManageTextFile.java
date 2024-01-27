package e.io;

/**
 * @author hazel
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manager = new ManageTextFile();
        int numberCnt = 10;
        //String fullPath = separator + "godofjava" + separator + "text" + separator + "numbers.txt";
        String fullPath = "/Users/hyeonjungchoi/Desktop/dev/godofjava/text/numbers.txt"; //해당 경로에 해당이름의 파일을 만들고
        manager.writeFile(fullPath, numberCnt); //만든 파일안에 값을 입력

    }

    public void writeFile(String fileName, int numberCnt) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(fileName); //파일에 쓰는 작업을 하기 위해서 FileWriter 객체 생성
            bufferedWriter = new BufferedWriter(fileWriter); // 버퍼를 사용하기 위해서 bufferWriter 객체 생성
            for (int i = 0; i < numberCnt; i++) {
                bufferedWriter.write(Integer.toString(i)); //write 메소드를 이용해서 데이터를 입력
                bufferedWriter.newLine(); //줄바꿈
            }
            System.out.println("write access !!");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

        } finally { //무조건실행되는 구문 ! 위에 catch에서 return이 실행되도 무조건 실행
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close(); // filewriter 객체 사용이 끝나면 닫기
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }


            }
        }


    }
}
