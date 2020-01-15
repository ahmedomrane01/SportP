package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Client;
import com.example.service.ClientService;

@RestController
@CrossOrigin
public class ClientController {
	
	@Autowired
	private ClientService  clientService;
	
	
	@GetMapping("/client")
	public List<Client> saveClient() {
		return clientService.liste();
	}
	
	@PostMapping("/ajouterc")
	public String ajouterClient(@RequestBody Client client) {
		System.out.println(client);
		clientService.ajouter(client);

		return "client ajouté ";
	}
	
	@PostMapping("/supprimerc")
	public String supprimerClient(@RequestBody Client client) {
		clientService.suppression(client);

		return "client supprimé ";
	}
	
	@PostMapping("/modifc")
	public String modifClient(@RequestBody Client client) {
		clientService.modification(client);

		return "client modifé ";
	}
	
	@PostMapping("/find")
	public Client findByName(@RequestBody String name) {
		System.out.println(name);
		return clientService.getByName(name); 
	}
	
}
