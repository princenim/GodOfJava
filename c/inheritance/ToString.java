package c.inheritance;

/**
 * @author hazel
 */
public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        //thisObject.toStringMethod(thisObject);
        thisObject.toStringMethod2(thisObject);

    }

    public void toStringMethod(Object obj) {
        System.out.println(obj); //객체 그대로 출력
        System.out.println(obj.toString()); //toString은 Object에 선언되어있어서 자동으로 상속받아서 사용가능.
        System.out.println("plus " + obj); //객체의 더하기 연산
    }

    /*
    결과
    c.inheritance.ToString@4617c264   -> 객체를 그냥 출력하는 것과 toString을 그냥 출력하는 것은 동일
    c.inheritance.ToString@4617c264
    plus c.inheritance.ToString@4617c264 -> String을 제외한 참조 자료형에 더하기 연산을 수행하면 자동으로 toString()메소드가 호출된것과 같다.
     */
    public void toStringMethod2(Object obj) {
        System.out.println(this); // this는 자기자신을 의미함. 참고로 this()는 다른 생성자를 호출할 때 사용함.
        System.out.println(toString());
        System.out.println("plus " + this);

    }

    //Object 클래스의 toString 오버라이딩한것.
    //오버라이딩을 하면 위의 메소드 결과값이 달라짐.
    public String toString() {
        return "ToString class";
    }


}
