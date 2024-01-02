/**
 * @author hazel
 */
public class OperatorCasting {
    public static void main(String[] args) {
        OperatorCasting oc = new OperatorCasting();
        oc.casting2();


    }


    public void casting2(){
        short shortValue = 256; //2byte = 16bit
        byte byteValue = (byte)shortValue;
        System.out.println(byteValue); //0 -> 예측할수 없는 값 출력

        shortValue = 255;
        byteValue = (byte)shortValue; //-1
        System.out.println(byteValue);
    }
}
