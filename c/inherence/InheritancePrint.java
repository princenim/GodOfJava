package c.inherence;

/**
 * @author hazel
 */
public class InheritancePrint {
    public static void main(String[] args) {
        Child child = new Child(); //parent를 상속
        System.out.println("==========");
        child.printName(); //parent 클래스에 존재
    }
}
