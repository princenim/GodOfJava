package lambda.functional;

import java.util.Arrays;
import java.util.List;

/**
 * @author hazel
 */
public class StreamTest {
    public static void main(String[] args) {
        Integer[] values = {1, 3, 5};
        //List<Integer> list = Arrays.asList(values); //배열을 asList로 LIst로 변경가능

        //Arrays의 stream() 이라는 메소드를 사용해서 매개변수로 배열을 넘겨주기
        List<Integer> list = Arrays.stream(values).toList();


    }
}
