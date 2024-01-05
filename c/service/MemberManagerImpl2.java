package c.service;

import c.inheritance.MemberDTO;

/**
 * @author hazel
 */
public class MemberManagerImpl2 extends MemberManagerAbstract {//추상클래스를 상속-> 구현해야함.

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
    } //추상클래스 상속
}
