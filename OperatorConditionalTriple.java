/**
 * @author hazel
 */
public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple oct = new OperatorConditionalTriple();
        oct.doBlindDate(30);
        oct.doBlindDate(80);
    }

    public boolean doBlindDate(int point){
        boolean doBlindDate = false;
        doBlindDate  = (point >= 80) ? true : false;
        System.out.println(doBlindDate);
        return doBlindDate;
    }
}
