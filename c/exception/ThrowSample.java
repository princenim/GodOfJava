package c.exception;

/**
 * @author hazel
 */
public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample throwableSample = new ThrowSample();
        try {
            throwableSample.throwException(13); //헤당 메솓,가 throws Exception으로 선언했기때문에 try-catch로 다시 묶음 , 참고로 throw한것을 다시 throw하는 것은 좋지않음.
        } catch (Exception e) {

            System.out.println(e);

        }

    }

    //에러를 발생시키기
    // throw Exception 을 통해 예외를 호출한 메소드로 전달 가능. 이렇게 선언하면 try-catch로 묶지 않아도 되지만이 메소드를 호출한 메소드에서도 예외 처리를 해줘야한다.
    public void throwException(int number) throws Exception {

//        try {
//            throw new Exception("Number is over than 12!!!!!!!!!"); //예외를 강제로 발생시키는 것.
//
//        } catch (Exception e) {
//            System.out.println(e); //발생 시킨 에러 출력
//            e.printStackTrace();/
//        }

        //throws Exception 를 추가하고 try-catch문에서 수정
        if (number > 12) {
            throw new Exception("Number is over than 12!!!!!!!!!"); //예외를 강제로 발생시키는 것.
        }

    }

}
