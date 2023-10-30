package com.adrianoms.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianoms.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
