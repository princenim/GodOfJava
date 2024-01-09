package c.exception.practice;

/**
 * @author hazel
 */
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.printDivide(1, 2); //처음 메소드에서는 예외 발생 X
            calculator.printDivide(1, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printDivide(double d1, double d2) throws Exception {
        if (d2 == 0) {
            throw new Exception("Second value can't be zero"); //예외발생
        }
        double res = d1 / d2;
        System.out.println(res);

    }
}
