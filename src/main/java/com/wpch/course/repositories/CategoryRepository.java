package com.wpch.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpch.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}