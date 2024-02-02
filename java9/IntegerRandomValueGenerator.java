package java9;

/**
 * @author hazel
 */
public class IntegerRandomValueGenerator implements RandomValueGenerator {

    @Override
    public int getRandomNumber() { //메소드 오버라이딩

        return generateIntegerRandomNumber(100);
        //디폴트 메소드는 접근 가능하지만 private 메소드는 접근 불가능하다.
        
    }
}
