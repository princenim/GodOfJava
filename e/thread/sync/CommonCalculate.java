package e.thread.sync;

/**
 * @author hazel
 */
public class CommonCalculate {
    Object lock = new Object();
    private int amount; //인스턴스 변수 -> heap 영역에 생성

    public CommonCalculate() {
        amount = 0;
    }

    public void plus(int value) {
        synchronized (lock) { //보통 별고의 객체를 선언해 사용한다.
            amount += value;
            // 이 이후에 있는 중괄호 내에 있는 연산만 동시에 여러 쓰레드에서 처리하지 않겠다는 의미
            //q
        }

    }

    public synchronized void minus(int value) {
        amount -= value;

    }

    public int getAmount() {
        return amount;
    }

}
