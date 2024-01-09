package c.exception;

/**
 * @author hazel
 */
public class FinallySample {
    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        sample.finallySample();
    }

    public void finallySample() {
        int[] intArray = new int[5];

        try {
            System.out.println(intArray[5]); //에러 발생

        } catch (Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("he is finally"); //예외 여부와 상관없이 실행
        }
        System.out.println("This code must run.");

    }
}
