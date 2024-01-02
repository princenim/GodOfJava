package c.javapackage;

/**
 * @author hazel
 */
public class AccessModifier {

    //누구자 접근가능
    public void publicMethod(){

    }
    //같은 패키지 또는 상속만 접근가능
    protected void protectedMethod(){

    }
    //같은 패키지만 접근 가능
    void packagePrivateMethod(){

    }

    //같은 클래스만 접근 가능
    private void privateMethod(){

    }

}
