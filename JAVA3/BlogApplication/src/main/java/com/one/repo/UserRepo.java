package com.one.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
