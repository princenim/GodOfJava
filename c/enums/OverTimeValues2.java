package c.enums;

/**
 * @author hazel
 */
public enum OverTimeValues2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000);

    private final int amount;//변수 선언

    OverTimeValues2(int amount) {//생성자, enum 클래스는 생성자를 만들수 있지만 생성자를 통해 객체를 만들수는 없음.
        this.amount = amount;//또한 생성자가 없다면 자동으로기본 생성자를 만들어줌.
    }

    public int getAmount() { //enum클래스도 보통 클래스와 마찬가지로 메소드를 선언해 사용가능하다.
        return amount;
    }
}
