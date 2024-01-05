package c.service;

import c.inheritance.MemberDTO;

/**
 * @author hazel
 */
public class MemberManagerImpl implements MemberManager {
    //자바에서 implementt 를 사용하면 상속하다가 아닌 구현하다라고 표현한다.
    //반드시 오버라이드해야 컴파일이 된다.
    public static void main(String[] args) {

    }

    @Override
    public boolean addMember(MemberDTO memberDTO) {
        return false;
    }

    @Override
    public boolean removeMember(MemberDTO memberDTO) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO memberDTO) {
        return false;
    }
}
