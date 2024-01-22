package e.thread.object;

/**
 * @author hazel
 */
public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        //sample.checkThreadState2();
        sample.checkThreadState3();


    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);

        try {
            System.out.println("thread state=" + thread.getState());
            thread.start();//thread와 Thread 주의 **
            System.out.println("thread state(after start)=" + thread.getState());

            Thread.sleep(100);//이 클래스의 thread를 1초동안 정지
            System.out.println("thread state(after 0.1sec)=" + thread.getState());

            synchronized (monitor) {
                monitor.notify(); //wait 메소드를 깨워주는 역할 예외없이
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify)=" + thread.getState());

            thread.join();
            System.out.println("thread state(after join)=" + thread.getState());


        } catch (InterruptedException ie) {
            ie.printStackTrace();

        }


    }

    public void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        //지금

        try {
            System.out.println("thread state=" + thread.getState());
            thread.start(); //쓰레드 실행
            System.out.println("==============");
            System.out.println("thread state(after start)=" + thread.getState());

            thread.sleep(100);
            System.out.println("thread state(after 0.1sec)=" + thread.getState());

            synchronized (monitor) {
                monitor.notify(); //wait 메소드를 깨워주는 역할 예외없이
            }
            thread.sleep(100);//대기하고
            System.out.println("thread state(after notify)=" + thread.getState());

            thread.join();//쓰레드가 중지할때까지 대기
            System.out.println("thread state(after join)=" + thread.getState());


        } catch (InterruptedException ie) {
            ie.printStackTrace();

        }


    }
}
