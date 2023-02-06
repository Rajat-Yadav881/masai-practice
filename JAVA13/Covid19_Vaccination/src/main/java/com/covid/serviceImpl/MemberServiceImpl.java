package com.covid.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.dtos.AdhaarCard;
import com.covid.exception.MemberException;
import com.covid.model.Id_Card;
import com.covid.model.Member;
import com.covid.repository.Id_CardDao;
import com.covid.repository.MemberDao;
import com.covid.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberDao;
	
	@SuppressWarnings("unused")
	@Autowired
	private AdhaarCard adhaarCard; 
	
	@Autowired
	private Id_CardDao id_CardDao;
	
	@Override
	public Member getMemberById(Integer member_Id) throws MemberException {
		Optional<Member> member = memberDao.findById(member_Id);
		if(member.isPresent()) {
			Member member1= member.get();
			memberDao.save(member1);
			return member1;
		}else {
			throw new MemberException("member Not Found...");
		}
	}

	@Override
	public Member getMemberByAdhaarNo(Long adhaarNumber){
		Optional<Id_Card> card = Optional.ofNullable(id_CardDao.findByTheAdhaarNumber(adhaarNumber));
		
		if(card.isPresent()) {
			Optional<Member> member = Optional.ofNullable(memberDao.findByCard(card));
		}
		
		
		return null;
	}

	@Override
	public Member getMemberByPanNo(String panNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member addMember(Member member) throws MemberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(Member member) throws MemberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteMember(Member member) throws MemberException {
		// TODO Auto-generated method stub
		return null;
	}

}
