package stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author hazel
 */
public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] stringArray = {"요다", "만두", "호떡"}; //배열
        //sample.staticReference(stringArray);
        sample.objectReference(stringArray);

    }

    public static void printResult(String value) {
        System.out.println("----");
        System.out.println(value);
    }

    private void staticReference(String[] stringArray) {
        //static 메소드 참조
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }

    private void objectReference(String[] stringArray) {
        Arrays.sort(stringArray, String::compareToIgnoreCase); //임의객체 참조 -

        //asList는 배열을 List로 리턴
        Arrays.asList(stringArray).stream().forEach(System.out::println); //인스턴스 메소드 참조
        //List<String> list = Arrays.asList(stringArray);
        //System.out.println(list.get(0));

    }
}
