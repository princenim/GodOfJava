package c.inheritance;

/**
 * @author hazel
 */
public class Child extends Parent { //상속
    public Child() {//생성자
        System.out.println("Child Constuctor");
    }

    public void printName() {
        System.out.println("Child - printName()");
    }

}
