package c.inheritance;

/**
 * @author hazel
 */
public class ChildPrint extends Parent {//다중 상속 불가

    public ChildPrint() {
        System.out.println("ChildPrint Constructor");
    }

    //확장한 클래스는 추가적인 메소드를 만들어도 문제가 없음.
    public void printAge() {
        System.out.println("printAge() - 18month");
    }

}
