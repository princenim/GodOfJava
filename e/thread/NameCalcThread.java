package e.thread;

/**
 * @author hazel
 */
public class NameCalcThread extends Thread {
    //이렇게 동적으로 값을 지정할수도 있음.
    private int calcNumber;

    public NameCalcThread(String name, int calcNumber) {
        super(name);
        this.calcNumber = calcNumber;
    }

    public void run() {
        calcNumber++;
    }
}
