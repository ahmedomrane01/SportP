package com.example.service;

import java.util.List;


import com.example.entity.Entreneur;

public interface EntreneurService {
	
	public void ajouter(Entreneur entreneur);

	public void suppression(Entreneur entreneur);

	public void modification(Entreneur entreneur);

	public Entreneur getByName(String name);

	public List<Entreneur> liste();
	
	

}
