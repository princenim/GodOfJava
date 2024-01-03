package c.inherence;

/**
 * @author hazel
 */
public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        System.out.println("Child Overriding Constructor");

    }

    public void printName() {
        System.out.println("ChildOverriding printName()");
    }

}
