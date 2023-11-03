package com.adrianoms.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianoms.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
