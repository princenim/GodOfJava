package e.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hazel
 */
public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample socketServerSample = new SocketServerSample();
        //socketServerSample.startServer();
        socketServerSample.startReplyServer();

    }

    //데이터를 받는 서버
    public void startServer() {

        ServerSocket server = null;
        Socket client = null;

        try {
            server = new ServerSocket(9999); //포트가 9999인 ServerSocket객체 생성 즉 다른 프로그램에서 이 프로그램으로 접근하려면 9999 포트로 접근해야함.
            while (true) {
                System.out.println("Server : Waiting for request");
                client = server.accept(); //다른 호출을 대기하는 상태! 연결이 완료되었을 떄 Socket 객체 리턴해 clinet 변수에 할당
                System.out.println("Sever : Accepted");

                //데이터를 받고
                InputStream stream = client.getInputStream();//getInputStream을 이용해 데이터를 받음.
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));


                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while ((data = in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Recived data : " + receivedData); //받은 데이터

                in.close(); // Socket 사용 종료
                stream.close();

                if (receivedData != null && "EXIT".equals(receivedData.toString())) { //넘어오는 데이터가 EXIT 이라면 끝
                    System.out.println("Stop SocketServer");
                    break;
                }

                System.out.println("=====================");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close(); //소켓 수신할 필요가 없을 때 대기상태 close 로 종료
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }


    public void startReplyServer() {

        ServerSocket server = null;
        Socket client = null;

        try {
            server = new ServerSocket(9998); //포트가 9999인 ServerSocket객체 생성 즉 다른 프로그램에서 이 프로그램으로 접근하려면 9999 포트로 접근해야함.
            while (true) {
                System.out.println("Server : Waiting for request");
                client = server.accept(); //다른 호출을 대기하는 상태! 연결이 완료되었을 떄 Socket 객체 리턴해 clinet 변수에 할당
                System.out.println("Sever : Accepted");

                // 서버에서 데이터를 전송
                OutputStream stream = client.getOutputStream();
                BufferedOutputStream out = new BufferedOutputStream(stream); //byte단위
                out.write("OK".getBytes()); //ok라는 메세지를 전송
                out.close();
                stream.close();
                client.close();
                System.out.println("=====================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close(); //소켓 수신할 필요가 없을 때 대기상태 close 로 종료
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
