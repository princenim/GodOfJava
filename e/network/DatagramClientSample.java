package e.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/**
 * @author hazel
 */
public class DatagramClientSample {
    //UDP 통신 - 클라이언트 (데이터 전송)
    public static void main(String[] args) {
        DatagramClientSample datagramClientSample = new DatagramClientSample();
        datagramClientSample.sendDatagramSample();
    }

    public void sendDatagramSample() {
        for (int i = 0; i < 3; i++) {
            sendDatagramData("I liked UDP +" + new Date());
        }
        sendDatagramData("EXIT");
    }

    public void sendDatagramData(String data) {
        try {
            DatagramSocket client = new DatagramSocket(); //객체 생성
            InetAddress address = InetAddress.getByName("127.0.0.1"); //데이터를 받을 서버의 ip 설정
            byte[] buffer = data.getBytes(); //data를 바이트 배열로 바꿈
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length, address, 9999);//데이터를 전송하기 위한 생성자
            client.send(packet); //데이터 전송
            System.out.println("Client: Sent data");
            client.close(); //소켓 연결 종료
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
