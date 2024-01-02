/**
 * @author hazel
 */
public class OperatorComparision {
    public static void main(String[] args) {

        OperatorComparision operatorComparision = new OperatorComparision();
        operatorComparision.comparision2();
        operatorComparision.comparision3();

    }
    public void comparision(){

    }
    public void comparision2(){
        char charValue = 'a';
        System.out.println(97 == charValue); //true
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue); //true
    }
    public void comparision3(){
        boolean flag = true;
        boolean flag2 = true;

        System.out.println(flag ==flag2 );

    }
}
