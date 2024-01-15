package d.string.practice.lang;

/**
 * @author hazel
 */
public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint javaLangSystemPrint = new JavaLangSystemPrint();
        javaLangSystemPrint.printNull();


    }

    public void printNull() {
        Object obj = null;
        System.out.println(obj); //컴파일, 실행 가능
        System.out.println(obj + "is object's null");

    }
}
