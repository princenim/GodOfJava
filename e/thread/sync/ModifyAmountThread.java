package e.thread.sync;

/**
 * @author hazel
 */
public class ModifyAmountThread extends Thread {
    public CommonCalculate calc;
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate calc, boolean addFlag) { //생성자
        this.calc = calc;
        this.addFlag = addFlag;
    }

    public void run() { //쓰레드 시작점
        for (int loop = 0; loop < 10000; loop++) {
            if (addFlag) { //true면 1더하고 아니면 1 마이너스
                calc.plus(1);
            } else {
                calc.minus(1);
            }

        }
    }//run이 끝나면 쓰레드 종료

}
