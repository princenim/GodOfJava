package c.service;

import c.inheritance.MemberDTO;

/**
 * @author hazel
 */
public abstract class MemberManagerAbstract { //추상클래스

    /*
    추상클래스는 클래스앞에 abstact가 붙으며 클래스 안에 abstract로 선언된 메소드가 하나 이상이어야한다.
    또한  몸통이 있는 메소드가 0개 이상 있어어도 상관없다.
     */
    public abstract boolean addMember(MemberDTO memberDTO);

    public abstract boolean removeMember(MemberDTO memberDTO);

    public abstract boolean updateMember(MemberDTO memberDTO);

}
