package c.enums;

/**
 * @author hazel
 */
public class OverTimeManager3 {
    public static void main(String[] args) {
        OverTimeValues2[] values = OverTimeValues2.values(); //enum 클래스에 선언되어있는 모든 상수를 배열로 리턴
        for (OverTimeValues2 data : values) {
            System.out.println(data);
        }

    }
}
