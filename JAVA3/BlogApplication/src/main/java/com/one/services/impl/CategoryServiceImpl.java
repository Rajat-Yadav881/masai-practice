package com.one.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.one.entity.Category;
import com.one.payload.CategoryDto;
import com.one.repo.CategoryRepo;
import com.one.services.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper mapper;
	
//	public CategoryDto createToCategory(CategoryDto category) {
//		Category cat = this.mapper.map(category, Category.class);
//		
//		Category addedCat = this.categoryRepo.save(cat);
//		
//		return this.mapper.map(addedCat, CategoryDto.class);
//		
//	}
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category cat = this.mapper.map(categoryDto, Category.class);
		
		Category addedCat = this.categoryRepo.save(cat);
		
		return this.mapper.map(addedCat, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		
		Category cat = this.
		return null;
	}

	@Override
	public void deleteCategory(CategoryDto categoryDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDto> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
