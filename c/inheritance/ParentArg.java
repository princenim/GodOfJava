package c.inheritance;

/**
 * @author hazel
 */
public class ParentArg {

    public ParentArg(String name) { //매개변수가 있는 생성자
        System.out.println("ParentArg(" + name + ") Constructor");

    }

    public ParentArg(int age) { //매개변수가 있는 생성자
        System.out.println("ParentArg(" + age + ") Constructor");

    }

    public void printName() {
        System.out.println("printName() - ParnetArg");


    }

}
