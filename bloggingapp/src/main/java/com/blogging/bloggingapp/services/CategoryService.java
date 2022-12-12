package com.blogging.bloggingapp.services;

import java.util.List;

import com.blogging.bloggingapp.payloads.CategoryDto;

public interface CategoryService {
	
	// Create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	// Update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// Delete
	void deleteCategory(Integer categoryId);
	
	// Get
	CategoryDto getCategory(Integer categoryId);
	
	// GetAll
	List<CategoryDto> getCategories();
}
