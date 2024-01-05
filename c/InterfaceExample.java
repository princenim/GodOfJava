package c;

import c.service.MemberManager;
import c.service.MemberManagerImpl;

/**
 * @author hazel
 */
public class InterfaceExample {
    public static void main(String[] args) {
        //MemberManager memberManager = new MemberManager(); //MemberManager는 인터페이스이다.
        //memberManager가 abstract이기 때문에 에러

        MemberManager member = new MemberManagerImpl();
        /*
        member의 타입은 인터페이스 MemberManager인데 MemberManagerImpl에 MemberManager의
        모든 메소드들이 구현되어있어 실제로 MemberManagerImpl에 있는 메소드들이 실행된다.
          */


    }
}
