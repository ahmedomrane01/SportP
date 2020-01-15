package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Abonnement;
import com.example.service.AbonnementService;

@RestController
@CrossOrigin
public class AbonnementController {
	
	@Autowired
	private AbonnementService abonnementService;
	
	@GetMapping("/abonnement")
	public List<Abonnement> saveAbonnement() {
		return abonnementService.liste();
	}
	
	@PostMapping("/ajoutera")
	public String ajouterAbonnement(@RequestBody Abonnement abonnement) {
		abonnementService.ajouter(abonnement);

		return "abonnement ajouté ";
	}
	
	@PostMapping("/supprimera")
	public String supprimerAbonnement(@RequestBody Abonnement abonnement) {
		abonnementService.suppression(abonnement);

		return "abonnement supprimé ";
	}
	
	@PostMapping("/modifa")
	public String modifClient(@RequestBody Abonnement abonnement) {
		abonnementService.modification(abonnement);

		return "abonnement modifé ";
	}
	

	
	

}
