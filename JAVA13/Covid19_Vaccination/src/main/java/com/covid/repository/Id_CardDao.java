package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.covid.model.Id_Card;

@Repository
public interface Id_CardDao extends JpaRepository<Id_Card, Integer>{
	 @Query("SELECT i from Id_Card i join AdhaarCard a where a.adhaarNumber = ?1")
	 public Id_Card findByTheAdhaarNumber(Long adhaarNumber );
	 
}
