package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.Email;

public interface EmailDAO extends JpaRepository<Email, Integer> {

}
