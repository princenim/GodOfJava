package c.util;

/**
 * @author hazel
 */
public abstract class FinalMethodClass {//추상클래스

    public final void printLog(String data) { //final 메소드는 오버라이딩 할 수 없다.
        System.out.println("DATA= " + data);

    }
}
