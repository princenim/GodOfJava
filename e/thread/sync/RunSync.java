package e.thread.sync;

/**
 * @author hazel
 */
public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        runSync.runCommonCalculate();
    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start(); //쓰레드 실행
        thread2.start(); //쓰레드 실행

        try {
            thread1.join(); //join()은 쓰레드가 종료될때까지 기다리는 메소드
            thread2.join();
            System.out.println("Final value is " + calc.getAmount());// join 메소드가 끝나면 실행
            //System.out.println("Final value is " + calc.getAmount());// join 메소드가 끝나면 실행
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
