package com.practice.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.practice.springboot.model.User;
import com.practice.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto reistrationDto);

}
