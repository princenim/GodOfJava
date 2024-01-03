package c.inherence;

/**
 * @author hazel
 */
public class ChildArg extends ParentArg {

    public ChildArg() {
        /*
        ParentArg에 기본 생성자가 없고 매개변수가 존재하는 생성자만 존재할때 컴파일 에러
        1. 매개변수가 없는 기본 생성자를 만든다
        2. 자식 클래스에서 부모 클래스의 생성자를 명시적으로 지정하는 super()를 사용
            - super()을 사용해 부모클래스의 생성자호출
         */

        //super("hi");
        super(1); //안에 값은 호출하고자 하는 생성자의 기본 타입을 넘겨야한다.
        //이렇게 하면 ParentArg 클래스 생성자 중 String 타입을 매개변수로 받을 수 있는 생성자를 찾는다.
        System.out.println("Child Constrictor");

        /*
        자바는 부모의 매개변수가 없는 기본 생성자를 찾는 것이 기본이다.
        따라서 부모 클래스에 매개 변수가 있는 생성자가 있을 경우 super()을 통해 반드시 부모 클래스의 생성자를 호출해야한다.
         */

    }
}
