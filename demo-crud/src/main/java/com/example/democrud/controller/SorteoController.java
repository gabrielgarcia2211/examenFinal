package com.example.democrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.democrud.model.Sorteo;
import com.example.democrud.service.api.SorteoServiceAPI;

@Controller
@RequestMapping("/sorteo")
public class SorteoController {
	
	
	@Autowired
	private SorteoServiceAPI sorteoServiceAPI;
	
	
	@PostMapping("/save")
	public String save(Sorteo sorteo, Model model) {
		System.out.print(sorteo.getMaximo());
		sorteoServiceAPI.save(sorteo);
		return "redirect:/";
	}
	
	

}
