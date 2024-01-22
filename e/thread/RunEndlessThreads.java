package e.thread;

/**
 * @author hazel
 */
public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads runEndlessThreads = new RunEndlessThreads();
        runEndlessThreads.endless();


    }

    public void endless() {
        EndlessThread thread = new EndlessThread();
        thread.run();//쓰레드 클래스 실행


    }
}
