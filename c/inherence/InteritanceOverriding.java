package c.inherence;

/**
 * @author hazel
 */
public class InteritanceOverriding {
    public static void main(String[] args) {
        ChildOverriding childOverriding = new ChildOverriding();
        childOverriding.printName();
        /*
        자식클래스 호출 시 만약 부모 클래스의 메소드돠 동일하게 선언 되어있는 자식 클래스의 메소드만 호출한다면
        자식클래스의 메소드만 호출  이것이 메소드 오버라이딩!
         */

    }
}
