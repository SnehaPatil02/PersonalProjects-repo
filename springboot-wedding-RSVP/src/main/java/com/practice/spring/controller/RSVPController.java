package com.practice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.spring.model.Guests;
import com.practice.spring.service.RSVPService;

@Controller
public class RSVPController {
	
	@Autowired
	private RSVPService rsvpService;
	
	@GetMapping("/rsvp")
	public String viewAllGuests(Model model) {
		model.addAttribute("listGuests", rsvpService.getAllGuests());
		return "home.html";
	}
	
	@GetMapping("/showGuestForm")
	public String showGuestForm(Model model) {
		//create model attribute to bind form data
		Guests guests = new Guests();
		model.addAttribute("guests", guests);
		return "new_guest";
	}
	
	@PostMapping("/saveEmployee")
	public String saveGuest(@ModelAttribute("guests") Guests guests) {
	
		//save employee to database
		rsvpService.saveGuest(guests);
		return "redirect:/"; 	
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
	
		//get guest from the service
		Guests guests = rsvpService.getGuestsById(id);
		
		//set guest as a model attribute to pre-populate the form
		model.addAttribute("guests", guests);
		return "update_guest";
	}
	
	
	@GetMapping("/deleteGuest/{id}")
	public String deleteGuest(@PathVariable int id) {
		
		//call delete guest method
		
		this.rsvpService.deleteGuest(id);
		return "redirect:/";
	}
}
