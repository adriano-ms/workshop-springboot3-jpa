package com.adrianoms.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianoms.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
