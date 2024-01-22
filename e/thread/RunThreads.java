package e.thread;

/**
 * @author hazel
 */
public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();


    }

    public void runBasic() {
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start(); //시작

        ThreadSample thread = new ThreadSample();
        thread.start(); //시작

        System.out.println("RunThreads.runBasic() method is ended");
    }
}
