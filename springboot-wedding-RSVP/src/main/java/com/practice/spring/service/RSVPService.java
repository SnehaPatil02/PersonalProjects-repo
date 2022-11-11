package com.practice.spring.service;

import java.util.List;

import com.practice.spring.model.Guests;


public interface RSVPService {
	
	List<Guests> getAllGuests();
	
	public void saveGuest(Guests guests);
	
	Guests getGuestsById(int id);
	
	void deleteGuest(int id);

}
