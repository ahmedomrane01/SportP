package com.example.service;

import java.util.List;

import com.example.entity.Abonnement;


public interface AbonnementService {
	
	public void ajouter(Abonnement abonnement);
	
	public void suppression (Abonnement abonnement);
	
	public void modification (Abonnement abonnement);
	
	public List<Abonnement> liste();

}
