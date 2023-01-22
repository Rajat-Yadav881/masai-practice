package com.mock.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
