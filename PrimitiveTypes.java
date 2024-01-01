/**
 * @author hazel
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes type = new PrimitiveTypes();
        //type.checkByte();
        type.checkChar();

        int intValue = 'a'; //char의 범위가 int형 보다 작기 때문에 이렇게 표현 가능
        System.out.println(intValue); //'a'의 아스키 코드 값이 출력

        char castValue = 44032;
        System.out.println(castValue); //가 출력. 유니코드 44032에 해당하는 문자 출력

    }

    int intDefault1;


    public void defaultValues(){
        int indDefault2;
        System.out.println(intDefault1);
        //System.out.println(indDefault2);
        /*
        컴파일시 indDefault2만 에러. 이유는 메서드안에서 사용하는 지역변수는 무조건 초기화해야함.
         */

    }

    public void checkByte() {
        byte byteMin = -128; //byte의 최소값
        byte byteMax = 127; //byte의 최대값

        System.out.println("byteMin= " + byteMin);
        System.out.println("byteMax= " + byteMax);

        byteMin = (byte) (byteMin - 1);
        byteMax = (byte) (byteMax + 1);



     /*
      byte형의 최소값에 1을 빼면 최대값이 최대값이 +1을 하면 최소값이 나온다.
      */
        System.out.println("byteMin-11 = " + byteMin); //127
        System.out.println("byteMax+1= " + byteMax); //-128
    }

    public void checkOtherTypes() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L; //long 타입은 L을 붙여야함 아니면 int 로 인식.

    }


    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = [" + charMin + "]");
        System.out.println("charMax = [" + charMax + "]");
    }
}
