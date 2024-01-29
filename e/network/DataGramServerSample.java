package e.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author hazel
 */

public class DataGramServerSample {
    //UDP 통신- 서버
    public static void main(String[] args) {
        DataGramServerSample dataGramServerSample = new DataGramServerSample();
        dataGramServerSample.startServer();

    }

    public void startServer() {
        DatagramSocket server = null;

        try {
            server = new DatagramSocket(9999); // port번호 지정해서 객체 생성
            int bufferLength = 256;
            byte[] buffer = new byte[bufferLength];
            DatagramPacket packet = new DatagramPacket(buffer, bufferLength); //데이터를 받기위한 객체 생성

            while (true) {
                System.out.println("Server :Waiting for request");
                server.receive(packet); //데이터가 넘어오면 packet객체에 데이터를 담는다.
                int dataLength = packet.getLength();
                System.out.println("Server :  reveived. Data length= " + dataLength);
                String data = new String(packet.getData(), 0, dataLength);//byte배열을 String문자열로 변경
                System.out.println("Server : received:" + data);
                if (data.equals("EXIT")) {
                    System.out.println("Stop DatagramServer");
                    break;
                }
                System.out.println("===============");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //모든 처리가 끝나면 객체를 닫는다.
            if (server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
