package f.generic;

/**
 * @author hazel
 */

/*
X와 T라는 제네릭한 타입이 선언되어 있는 클래스 .
 */
public class GenericClass<X> {
    private X x; //X라는 자료형의 변수 x //Integer
    private Object o;//String

    public <T> GenericClass(T t) { //생성자
        this.o = t;
        System.out.println("T type =" + t.getClass().getName());
    }

    public void setValue(X x) {
        this.x = x;
        System.out.println("X type+" + x.getClass().getName());
    }


}
