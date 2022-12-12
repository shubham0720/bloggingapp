package com.blogging.bloggingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.bloggingapp.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
