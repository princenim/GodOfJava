/**
 * @author hazel
 */
public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement oi = new OperatorIncrement();
        oi.increment();

    }

    /*
    증감연산자, 감소 연산자
     */
    public void increment() {
        int intValue = 1;
        System.out.println(intValue++); //1 -> 결과를 출력한 뒤 1을 더함!
        System.out.println(intValue); //2
        System.out.println(++intValue); //3 -> 출력하기 전에 1을 더함.
    }
}
