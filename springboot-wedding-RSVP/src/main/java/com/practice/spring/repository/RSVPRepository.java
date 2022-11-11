package com.practice.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.spring.model.Guests;

@Repository
public interface RSVPRepository extends JpaRepository<Guests, Integer> {

}
