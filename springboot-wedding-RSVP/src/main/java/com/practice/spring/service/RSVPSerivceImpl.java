package com.practice.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.model.Guests;
import com.practice.spring.repository.RSVPRepository;

@Service
public class RSVPSerivceImpl implements RSVPService{
	
	@Autowired
	private RSVPRepository rsvpRepository;

	@Override
	public List<Guests> getAllGuests() {
		return rsvpRepository.findAll();
	}

	@Override
	public void saveGuest(Guests guests) {
		this.rsvpRepository.save(guests);
		
	}

	@Override
	public Guests getGuestsById(int id) {
		Optional<Guests> optional = rsvpRepository.findById(id);
		Guests guests = null;
		if(optional.isPresent()) {
			guests = optional.get();
		}else {
			throw new RuntimeException("Guests not found for id :: "+id);
		}
			return guests;
		}

	@Override
	public void deleteGuest(int id) {
		this.rsvpRepository.deleteById(id);
		
	}
	

}
