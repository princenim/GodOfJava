package c.util;

/**
 * @author hazel
 */
public class FinalReferenceType {


    final MemberDTO dto = new MemberDTO();//참조 자료형에 final , 인스턴스 변수이기 때문에 변수선언과 동시에 초기화해야함.


    public static void main(String[] args) {
        FinalReferenceType finalReferenceType = new FinalReferenceType();
        finalReferenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println("dto");
        //dto = new MemberDTO(); //기본 자료형처럼 참조자료형도 두번이상 값을 할당하거나 생성자를 활용해 초기화할 수 없다.

        dto.name = "hi";
        System.out.println(dto.name);
        //그러나 dto 객체 안에있는 객체들은 final로 선언된 것이 아니므로 제약이 없다.
        //따라서 해당 클래스가 final이라고 해서 안에 있는 변수가 final이라는 의미는 아니다.


    }


}
