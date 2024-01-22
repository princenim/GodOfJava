package e.thread.object;

/**
 * @author hazel
 */
public class StateThread extends Thread {
    //쓰레드 클래스

    private Object monitor;

    public StateThread(Object monitor) { //생성자
        this.monitor = monitor;
    }

    public void run() {
        //쓰레드 실행
        try {
            for (int loop = 0; loop < 10000; loop++) {
                String a = "A"; //쓰레드를 실행중인 상태로 만들기 위해
            }
            synchronized (monitor) { //synchronized block은 해당 블록만 쓰레드 세이프 하게 만들어줌.
                monitor.wait(); //현재 쓰레드를 대기하고 있도록 한다.
            }
            System.out.println(getName() + " is notifed");
            Thread.sleep(1000); //wait 상황이 끝나면 1초간 대기했다가 이 쓰레드는 종료
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
