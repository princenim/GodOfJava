package e.thread;

/**
 * @author hazel
 */
public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads runDaemonThreads = new RunDaemonThreads();
        runDaemonThreads.runCommonThread();


    }

    public void runCommonThread() {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); //데몬으로 설정
        daemonThread.start();


    }


}
