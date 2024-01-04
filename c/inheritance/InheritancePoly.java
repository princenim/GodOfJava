package c.inheritance;

/**
 * @author hazel
 */
public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritancePoly = new InheritancePoly();
        inheritancePoly.call();
    }

    public void call() {
        Parent parent = new Parent();
        Parent child = new Child();
        Parent childOther = new ChildOther();

        System.out.println("================");

        parent.printName();
        child.printName();
        childOther.printName();
        /*
        밑의 메소드 결과가 모두 다름. 이는 선언 시 모두 Parent타입이었지만 호출되는 것은 원래 겍체에 있는 메서드가 호출된다.
        이것을 다형성이라고 한다.
         */


    }
}
