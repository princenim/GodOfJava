package d.generic;

/**
 * @author hazel
 */
public class Bus extends Car {


    public Bus(String name) { //부모 클래스의 생성자를 명시적으로
        super(name);
    }

    public String toString() {
        return "Bus name = " + name;
    }
}
