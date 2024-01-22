package e.thread;

/**
 * @author hazel
 */
public class ThreadSample extends Thread {
    //클래스는 다중 상속이 불가능 이렇게 Thread 클래스를 구현하려면 Thread를 상속해야하는데
    // 동시에 다른 클래스를 상속해야할때 Runnable 인터페이스를 구현하면 된다.
    public void run() {
        System.out.println("This is ThreadSample's run() mehod");

    }
}
