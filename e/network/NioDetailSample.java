package e.network;

import java.nio.IntBuffer;

/**
 * @author hazel
 */
public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample nioDetailSample = new NioDetailSample();
        nioDetailSample.checkBuffer();

    }

    public void checkBuffer() {

        try {
            IntBuffer buffer = IntBuffer.allocate(1024);//버퍼 용량을 1024로 설정
            for (int i = 0; i < 100; i++) {
                buffer.put(i);
            }

            System.out.println("Buffer capacity=" + buffer.capacity());
            System.out.println("Buffer limit=" + buffer.limit()); //1024
            System.out.println("Buffer position=" + buffer.position()); //100

            buffer.flip(); //limit값을 현재 position으로 지정한후 position을 가장 앞(0)으로 이동

            System.out.println("Buffer flipped!");
            System.out.println("Buffer limit=" + buffer.limit()); //100
            System.out.println("Buffer position=" + buffer.position());//0
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
