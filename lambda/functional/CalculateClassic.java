package lambda.functional;

/**
 * @author hazel
 */
public class CalculateClassic {


    private void calculateClassic() {
        Calculate calculateAdd = new Calculate() {// 인터페이스를 익명클래스로 구현

            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(calculateAdd.operation(1, 2));

    }

    //위의 익명클래스를 람다식으로 변경 ->가독성이 높아짐
    private void calculateLambda() {
        Calculate calculateAdd = (a, b) -> a + b; //람다
        System.out.println(calculateAdd.operation(1, 2));

        Calculate calculateSubtract = (a, b) -> a - b; //람다
        System.out.println(calculateSubtract.operation(1, 2));

    }


}
