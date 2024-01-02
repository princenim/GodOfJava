package c.javapackage.sub;

import c.javapackage.AccessModifier;

/**
 * @author hazel
 */
public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        //accessModifier.protectedMethod(); //같은 클래스 or 상속 가능
        //accessModifier.packagePrivateMethod(); //같은 클래스 가능
        //accessModifier.privateMethod();//같은 클래스 아니라 불가능

    }
}
