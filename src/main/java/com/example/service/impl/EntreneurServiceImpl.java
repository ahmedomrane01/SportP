package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Entreneur;
import com.example.repository.EntreneurRepository;
import com.example.service.EntreneurService;

@Service
public class EntreneurServiceImpl implements EntreneurService{
	
	@Autowired
	private EntreneurRepository entreneurRepo; 

	@Override
	public void ajouter(Entreneur entreneur) {
		
		entreneurRepo.save(entreneur);
		
	}

	@Override
	public void suppression(Entreneur entreneur) {
		
		entreneurRepo.delete(entreneur);
		
	}

	@Override
	public void modification(Entreneur entreneur) {

		entreneurRepo.save(entreneur);
	}

	@Override
	public Entreneur getByName(String name) {
		return null;
	}

	@Override
	public List<Entreneur> liste() {
		// TODO Auto-generated method stub
		return entreneurRepo.findAll();
	}

}
