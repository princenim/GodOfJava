package e.network;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author hazel
 */
public class NioSample { //NIO는 스트림을 사용하지 않고 채널과 버퍼를 사용함. 채널을 물건을 중간에서 처리하는 도매상, 버퍼는 도매상에게 물건을 사고 소비자에게 물건을 파는 소매상

    public static void main(String[] args) {
        NioSample nioSample = new NioSample();
        nioSample.basicWriteAndRead();


    }

    public void basicWriteAndRead() {
        String fileName = "/Users/hyeonjungchoi/Desktop/dev/godofjava/text/nio.txt";
        try {
            writeFile(fileName, "My first NIO sample");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //파일 만들기
    public void writeFile(String fileName, String data) throws Exception { //해당경로의 파일을 생성
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] byteData = data.getBytes();

        ByteBuffer buffer = ByteBuffer.wrap(byteData); //ByteBuffer 객체 사용 그리고 생성할 바이트 배열을 넘겨주기

        channel.write(buffer); //파일에 버퍼를 쓴다.
        channel.close();


    }

    //파일 읽기
    public void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024); //매개변수는 기본적으로 저장되는 크기

        channel.read(buffer); //데이터를 해당 버퍼에 담으라고 알려즘
        buffer.flip();//버퍼에 담겨있는 데이터의 가장 앞으로 이동한다 .
        while (buffer.hasRemaining()) {  //데이터가 더 남아있는지 확인하면서
            System.out.print((char) buffer.get()); //한 바이트씩 데이터를 읽음.
        }
        channel.close();

    }
}
