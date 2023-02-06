package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.dtos.AdhaarCard;

@Repository
public interface AdhaarDao extends JpaRepository<AdhaarCard, Long> {
	AdhaarCard findByAdhaarNumber(Long adhaarNumber);
}