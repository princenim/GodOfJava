package e.thread;

/**
 * @author hazel
 */
public class DaemonThread extends Thread {
    public void run() { //구현해햐할, 시작점
        try {
            Thread.sleep(Long.MAX_VALUE);

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
