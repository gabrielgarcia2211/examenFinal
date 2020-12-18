package com.example.democrud.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.democrud.model.Boleta;
import com.example.democrud.model.Sorteo;
import com.example.democrud.service.api.SorteoServiceAPI;
import com.example.democrud.service.api.BoletaServiceAPI;

@Controller
@RequestMapping("/sorteo")
public class SorteoController {
	
	
	@Autowired
	private SorteoServiceAPI sorteoServiceAPI;
	
	@Autowired
	private BoletaServiceAPI boletoServiceAPI;
	
	
	@PostMapping("/save")
	public String save(Sorteo sorteo, Model model) {
		System.out.print(sorteo.getMaximo());
		sorteoServiceAPI.save(sorteo);
		return "redirect:/";
	}
	
	@GetMapping("/list")
	public String index(Model model) {
		model.addAttribute("list", sorteoServiceAPI.getAll());
		return "sorteo/index";
	}
	
	
	@GetMapping("/generar/{id}")
	public String index(@PathVariable("id") Integer id , Model model) {
		
		Sorteo nu =  sorteoServiceAPI.get(id);
		int numero = nu.getNumeros();
		int maximo = nu.getMaximo();
		int rango = 0;
		
		for(int k=1; k<= numero;k++) {
			rango = rango*10;
		}
		
		ArrayList boleta = new ArrayList();
		
		for (int i = 0; i < rango; i++) {
			Boleta h = new Boleta();
		    numero = (int) (Math.random() * 50 + 1);
		    boleta.add(numero);
			h.setId(0);
			h.setBoleta(numero);
			//h.setFecha(new Date());
			h.setGanadora(0);
		}
		
		
		
	
		
		return "sorteo/index";
	}
	
	
	
	
	

}
