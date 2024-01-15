package d.lang;

/**
 * @author hazel
 */
public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber javaLangNumber = new JavaLangNumber();
        javaLangNumber.numberTypeCheck();


    }

    public void numberTypeCheck() {
        String value1 = "3";
        String value2 = "5";

        byte b1 = Byte.parseByte(value1);
        byte b2 = Byte.parseByte(value2);
        System.out.println(b1 + b2); //8

        int i1 = Integer.valueOf(value1);
        int i2 = Integer.valueOf(value2);
        System.out.println(i1 + i2 + "7"); //87 -> 참조자료형 리턴 따라서 7이 붙음

    }

    public void numberMinMaxCheck() {
        System.out.println("hi");
    }
}
