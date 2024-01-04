import java.util.Objects;

/**
 * @author hazel
 */
public class Student {
    String name;
    String address;
    String phone;
    String email;

    Student(String name) { //생성자
        this.name = name;
    }

    Student(String name, String address, String phone, String email) { ////생성자
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


    public String toString() { //Object 클래스 상속
        return name + " " + address + " " + phone + " " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name)   //인스턴스 변수 name과 객체로 넘어온 o의 객체 name을 비교, 위에서 형변환 했음.
                && Objects.equals(address, student.address)
                && Objects.equals(phone, student.phone)
                && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone, email);
    }
}
