package c.util;

import java.util.Objects;

/**
 * @author hazel
 */
public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    MemberDTO() {

    }

    MemberDTO(String name) { //생성자
        this.name = name;
    }

    public String toString() { //객체를 문자열로 표현
        return "Name = " + name;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return Objects.equals(name, memberDTO.name) && Objects.equals(phone, memberDTO.phone) && Objects.equals(email, memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }
}


