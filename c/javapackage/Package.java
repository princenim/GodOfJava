package c.javapackage;
import c.javapackage.sub.Sub; //패키지에 있는 클래스를 사용하겠다고 명시

/**
 * @author hazel
 */
public class Package {
    public static void main(String[] args) {
        //System.out.println("Package class");

        Sub sub = new Sub();
        sub.subClassMethod();;


    }
}
