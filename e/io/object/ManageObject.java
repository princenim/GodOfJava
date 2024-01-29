package e.io.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author hazel
 */


/*
  ObjectOutputStream을 통해서 객체를 저장하기
 */
public class ManageObject {
    public static void main(String[] args) {
        ManageObject manageObject = new ManageObject();
        String fullPath = "/Users/hyeonjungchoi/Desktop/dev/godofjava/text/" + "serial.obj"; //저장할 파일의 위치와 이름 -> 바이너리로 저장
        System.out.println(fullPath);

        SerialDTO dto = new SerialDTO("godofjavabook", 1, true, 100);
        manageObject.saveObject(fullPath, dto); //객체 저장

        manageObject.loadObject(fullPath); //객체 읽기. 객체를 만들고나서 읽을떄 객체안의 변화가 있으면 에러가 뜸! (UID가 존재하지 않으면)


    }

    //객체를 저장하기
    public void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fullPath); //FileOutputStream 객체 생성
            oos = new ObjectOutputStream(fos); //객체를 저장하기 위한 ObjectOutputStream 객체 생성. 즉 fos객체는 파일에 저장된다.
            oos.writeObject(dto);   //매개변수로 넘어온 객체를 저장
            System.out.println("Write success");
        } catch (Exception e) { //try에서 예외가 발생하면 출력
            e.printStackTrace();
        } finally { //무조건 실행
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) { //닫을 떄 에러
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject(); //객체를 읽기
            SerialDTO dto = (SerialDTO) obj;
            System.out.println(dto);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
