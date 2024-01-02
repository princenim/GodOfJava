/**
 * @author hazel
 */
public class ArrayInitValue {
    public static void main(String[] args){
        ArrayInitValue arrayInitValue = new ArrayInitValue();
        arrayInitValue.primitiveTypes();
        arrayInitValue.referenceTypes();


    }
    public void primitiveTypes(){
        /*
        지역변수는 초기화하지 않으면 사용이 불가능한데
        지역변수 배열은 초기화하지않아도 배열의 크기만 정해져도 상관없다.
         */

        int a;
        //System.out.println(a);//초기화하지않아서 컴파일 에러

        int[] intArray= new int[1];
        System.out.println(intArray);
        long[] longArray = new long[1];
    }

    public void referenceTypes(){
        //참조 자료형
        String[] strings = new String[2];
        ArrayInitValue[] arrayInitValues = new ArrayInitValue[2];
        System.out.println(strings[0]); //null
        System.out.println(arrayInitValues[0]); //null

    }
}
