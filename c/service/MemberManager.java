package c.service;

import c.inheritance.MemberDTO;

/**
 * @author hazel
 */
public interface MemberManager {
    public boolean addMember(MemberDTO memberDTO);

    public boolean removeMember(MemberDTO memberDTO);

    public boolean updateMember(MemberDTO memberDTO);


}
