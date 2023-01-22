package com.mock.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.model.Email;

public interface EmailRepo extends JpaRepository<Email, Integer>{

}
