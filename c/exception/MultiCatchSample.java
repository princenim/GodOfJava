package c.exception;

/**
 * @author hazel
 */
public class MultiCatchSample {
    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        sample.multiCatch();

    }

    public void multiCatch() {
        int[] intArray = new int[5];

        try {
            System.out.println(intArray[5]); //에러 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred"); //예외의 순서는 매우 중요함
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
        /*
        만약이 두 catch 순서를 바꾸면 Exception 클래스가 모든 클래스의 부모 클래스이고,
        배열의 ArrayIndexOutOfBoundsException는 Exception는 자식클래스 이기 때문에 절대로 밑의 ArrayIndexOutOfBoundsException는 처리할 일이없다.
        따라서 컴파일 에러가 뜬다.

         */

    }
}
