/**
 * @author hazel
 */
public class OperatorUnary {
    public static void main(String[] args) {

        OperatorUnary ou = new OperatorUnary();
        ou.unary();;
    }

    /*
    단항 연사자 : 피연산자가 하나인 것
     */
    public void unary() {
        int intValue = -10;
        int res = +intValue; // x1 -> 숫자가 양수라는 것을 명시적으로 보여주기 위해 사용
        System.out.println(res); //-10
        res = -intValue; //x(-1)
        System.out.println(res); //10
    }

}
