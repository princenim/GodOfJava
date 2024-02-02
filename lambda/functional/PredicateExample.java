package lambda.functional;

import java.util.function.Predicate;

/**
 * @author hazel
 */
public class PredicateExample {

    //함수형 인터페이스는 추상 메서드가 한 있는 인터페이스를 말한다. 디폴트 메소드와 static 메소드는 포함X
    //predicate 는 함수형 인터페이스로
    public static void main(String[] args) {

        //리턴값은 boolean
        Predicate<Integer> predicate = (num) -> num > 10; // 함수형 인터페이스니까 test라는 메소드를 생략한것 즉 매겨변수 num은 test 메소드의 매개변수
        Predicate<Integer> predicate1 = (num) -> num < 50;

//        Predicate<Integer> predicate = new Predicate<>() {
//            @Override
//            public boolean test(Integer num) {
//                return num > 10;
//            }
//        };

        //test 예제
        boolean res = predicate.test(100); //매개변수 num에 100 대입
        System.out.println(res);

        //and 예제
        boolean res2 = predicate.and(predicate1).test(30);
        System.out.println(res2); //true

        //and를 직관적으로 바꾼것.
        Predicate<Integer> test = (num) -> num > 10 && num < 50;
        System.out.println(test.test(30)); //false
    }
}

