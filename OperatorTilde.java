/**
 * @author hazel
 */
public class OperatorTilde {

    /*
    비트 값의 0을 1로 , 1을 0으로 바꿈
     */
    public static void main(String[] args) {
        OperatorTilde ot = new OperatorTilde();
        byte b = 127; //01111111 -> 10000000
        ot.printTildeResult(b);

        b = 1;
        ot.printTildeResult(b);
    }

    public void printTildeResult(byte b) {
        System.out.println("Original value = " + b);
        System.out.println("Tilde value = " + +~b);

    }

}
