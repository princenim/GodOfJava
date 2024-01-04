package c.inheritance;

import java.util.Objects;

/**
 * @author hazel
 */
public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    MemberDTO(String name) { //생성자
        this.name = name;
    }

    public String toString() {
        return "Name = " + name;

    }


    /*
        equals()는 최상위 클래스인 Object 클래스의 메소드로 참조 값을 기반으로 두 객체를 비교한다.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // 주소값이 같으므로 당연히 true. o는 obj2
        //this는 인스턴스 자신을 가리키는 참조변수 (클래스를통해 인스턴스가 된 내 자신..?)
        // -> 즉 클래스가 메모리에 올라간 상태를 가리키는 참조변수
        // -> 그럼다면 MemeberDto의 객체인 obj1과 obj2

        if (o == null || getClass() != o.getClass()) return false;
        //객체가 null이거나 클래스의 종류가 다르면 false

        MemberDTO memberDTO = (MemberDTO) o; //같은 클래스이므로 형변환 실행

        //각 인스턴스 변수가 같은지 비교하는 작업 수행
        //인스턴스 변수 name과 객체로 넘어온 obj2의 name을 비교
        //equals()는 참조자료형일떄 값을 비교, 기본자료형도 값을 비교한다.
        return Objects.equals(name, memberDTO.name)
                && Objects.equals(phone, memberDTO.phone)
                && Objects.equals(email, memberDTO.email);

    }


    /*
    객체의 메모리 주소를 16진수로 리턴
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}


