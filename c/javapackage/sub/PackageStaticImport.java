package c.javapackage.sub;

/**
 * @author hazel
 */

import static c.javapackage.sub.SubStatic.CLASS_NAME;
import static c.javapackage.sub.SubStatic.subStaticMethod;
public class PackageStaticImport {

    /*
    SubStatic 클래스의 두 클래스 변수와 클래스 메소드를 사용하기 위해서는
    클래스.메소드, 클래스.변수 이런형태지만 이렇게 import static으로 사용가능하다.
     */
    public static void main(String[] args) {

        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}
