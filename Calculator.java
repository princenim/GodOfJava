/**
 * @author hazel
 */
public class Calculator {
    public static void main(String[] args) {

        System.out.println("계산기");
        Calculator cal1 = new Calculator();
        int a = 1;
        int b =2;

        int res = cal1.add(a,b);
        System.out.println(res);

    }

    public  int add(int num1, int num2) {

        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 -num2;
    }

}
