package com.wpch.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpch.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}