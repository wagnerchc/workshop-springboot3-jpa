package com.wpch.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpch.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}