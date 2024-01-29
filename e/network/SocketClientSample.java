package e.network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * @author hazel
 */
//데이터 전송하는 클라이언트 소스
public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    public void sendSocketSample() {
        for (int i = 0; i < 3; i++) {
            sendSocketData("i like java at" + new Date());
        }
        sendSocketData("EXIT"); //종료

    }

    public void sendSocketData(String data) {

        Socket socket = null;

        try {
            System.out.println("Clinet: Connecting");
            socket = new Socket("127.0.0.1", 9999); // socket 객체 생성 후 접속
            System.out.println("Client: Connect status=" + socket.isConnected());
            Thread.sleep(1000);

            OutputStream stream = socket.getOutputStream(); //OutputStream으로 데이터 송신
            BufferedOutputStream out = new BufferedOutputStream(stream); //byte단위
            byte[] bytes = data.getBytes();

            out.write(bytes);

            System.out.println("Client: sent data");
            out.close();//닫기
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close(); //서버와 연결 종료
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
