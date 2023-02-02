package com.one.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
