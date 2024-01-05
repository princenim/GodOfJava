package c.enums;

/**
 * @author hazel
 */
public class OverTimeManager {
    public static void main(String[] args) {
        OverTimeManager overTimeManager = new OverTimeManager();
        int res = overTimeManager.getOverTimeAmount(OverTimesValue.FIVE_HOUR); //enum클래스이름.상수이름으로 클래스의 객체 생성이 완료
        System.out.println(res);

    }

    public int getOverTimeAmount(OverTimesValue value) { //enum
        //swich문이 있다고 가정
        return 1;
    }


}
