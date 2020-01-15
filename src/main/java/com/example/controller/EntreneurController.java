package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Entreneur;
import com.example.service.EntreneurService;

@RestController
@CrossOrigin
public class EntreneurController {
	
	
	@Autowired
	private EntreneurService entreneurService;
	
	@GetMapping("/entreneur")
	public List<Entreneur> saveEntreneur() {
		return entreneurService.liste();
	}
	
	@PostMapping("/ajoutere")
	public String ajouterEntreneur(@RequestBody Entreneur entreneur) {
		System.out.println(entreneur);
		entreneurService.ajouter(entreneur);

		return "Entreneur ajouté ";
	}
	
	@PostMapping("/supprimere")
	public String supprimerEntreneur(@RequestBody Entreneur entreneur) {
		entreneurService.suppression(entreneur);

		return "Entreneur supprimé ";
	}
	
	@PostMapping("/modife")
	public String modifEntre(@RequestBody Entreneur entreneur) {
		entreneurService.modification(entreneur);

		return "Entreneur modifé ";
	}
	

	
	
	

}
