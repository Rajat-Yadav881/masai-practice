package com.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.Id_Card;
import com.covid.model.Member;

public interface MemberDao extends JpaRepository<Member, Integer>{
	public Member findByCard(Optional<Id_Card> card);
}
