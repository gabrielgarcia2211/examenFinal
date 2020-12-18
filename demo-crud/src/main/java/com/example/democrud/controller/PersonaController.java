package com.example.democrud.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.democrud.model.Persona;
import com.example.democrud.service.api.PersonaServiceAPI;

@Controller
@RequestMapping("/persona")
public class PersonaController {
	
	
	@Autowired
	private PersonaServiceAPI personaServiceAPI;
	

	
	@PostMapping("/save")
	public String save(Persona persona, Model model) {
		personaServiceAPI.save(persona);
		return "redirect:/";
	}
	
	
	
	
	
	
	

}
