package com.example.democrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.democrud.commons.GenericServiceImpl;
import com.example.democrud.dao.api.SorteoDaoAPI;
import com.example.democrud.model.Sorteo;
import com.example.democrud.service.api.SorteoServiceAPI;

@Service
public class SorteoServiceImpl extends GenericServiceImpl<Sorteo, Integer> implements SorteoServiceAPI {

	@Autowired
	private SorteoDaoAPI sorteoDaoAPI;
	
	@Override
	public CrudRepository<Sorteo, Integer> getDao() {
		return sorteoDaoAPI;
	}

}
