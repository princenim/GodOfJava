package java9;

import java.util.Random;

/**
 * @author hazel
 */
public interface RandomValueGenerator {
    int getRandomNumber();

    default int generateIntegerRandomNumber(int bound) { //디폴트 메소드 - 인터페이스 구현시 오버라이딩 하지 않아도 ㄱㅊ
        return generateRandomNumber(bound);
    }

    private int generateRandomNumber(int bound) { //자바 9부터 private 메소드 추가 -> 인터페이스를 구현한 개발자에게는 노출되지 않음.
        Random random = new Random();
        return random.nextInt(bound);
    }

}
