package com.covid.service;

import com.covid.exception.MemberException;
import com.covid.model.Member;

public interface MemberService {
	public Member getMemberById(Integer member_Id)throws MemberException;
	public Member getMemberByAdhaarNo(Long adhaarNumber);
	public Member getMemberByPanNo(String panNumber);
	public Member addMember(Member member)throws MemberException;
	public Member updateMember(Member member)throws MemberException;
	public Boolean deleteMember(Member member)throws MemberException;
}
