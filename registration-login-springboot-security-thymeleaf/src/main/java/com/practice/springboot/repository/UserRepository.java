package com.practice.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);

}
