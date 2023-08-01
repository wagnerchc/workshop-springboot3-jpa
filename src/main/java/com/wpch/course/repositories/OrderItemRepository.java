package com.wpch.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wpch.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}