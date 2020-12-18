package com.example.democrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.democrud.commons.GenericServiceImpl;
import com.example.democrud.dao.api.BoletaDaoAPI;
import com.example.democrud.model.Boleta;
import com.example.democrud.service.api.BoletaServiceAPI;

@Service
public class BoletaServiceImpl extends GenericServiceImpl<Boleta, Integer> implements BoletaServiceAPI {

	@Autowired
	private BoletaDaoAPI boletaDaoAPI;
	
	@Override
	public CrudRepository<Boleta, Integer> getDao() {
		return boletaDaoAPI;
	}

}
