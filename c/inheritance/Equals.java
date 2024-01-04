package c.inheritance;

import java.util.Objects;

/**
 * @author hazel
 */
public class Equals {
    public static void main(String[] args) {
        Equals equals = new Equals();
        //equals.equalMethod();
        equals.equalMethod2();
        //equals.myTest();

    }

    public void equalMethod() {
        MemberDTO obj1 = new MemberDTO("홍"); //참조자료형
        MemberDTO obj2 = new MemberDTO("홍");

        if (obj1 == obj2) { //결과는 두 객체의 주소값이 다르기 때문에 different
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }

    }

    public void equalMethod2() {
        MemberDTO obj1 = new MemberDTO("홍"); //참조자료형
        MemberDTO obj2 = new MemberDTO("홍");
        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
            //결과는 다르다 왜냐하면 MemberDto 클래스에서 오버라이딩 하지 않았기 때문
            //오버라이딩을 하지 않으면 equals()메소드는 hashCode()값을 비교한다.
            // 해시코드는 16진수로 제공되는 객체의 메모리 주소
        }


        //그렇다면 객체의 변수는를 비교한다면?
        if (obj1.name.equals(obj2.name)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
            //결과는 다르다 왜냐하면 MemberDto 클래스에서 오버라이딩 하지 않았기 때문
            //오버라이딩을 하지 않으면 equals()메소드는 hashCode()값을 비교한다.
            // 해시코드는 16진수로 제공되는 객체의 메모리 주소
        }

    }

    //equals() 확인
    public void myTest() {
        int a = 1;
        int b = 1;
        if (Objects.equals(a, b)) {
            System.out.println("같음 ->즉 기본자료형이어도 값 비교한다");
        } else {
            System.out.println("아님 -> 주소값 비교");
        }

    }
}
