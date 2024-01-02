/**
 * @author hazel
 */
public class StaticBlock {
    static int data= 1; //클래스 변수
    public StaticBlock(){
        System.out.println("StaticBlock Constructor");
    }

    static { //static block은 생성자보다 먼저 실행
        System.out.println("***first static block");
        data =3;
    }
    static{
        System.out.println("***second static block");
        data = 5;
    }

    public static int getData(){
        return data;
    }
}
