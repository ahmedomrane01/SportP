package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Client;
import com.example.repository.ClientRepository;
import com.example.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepo;

	

	@Override
	public void ajouter(Client client) {
		
		
		
		clientRepo.save(client);
		

	}

	@Override
	public void suppression(Client client) {
		clientRepo.delete(client);
	}

	@Override
	public void modification(Client client) {
		Client cl = clientRepo.getOne(client.getId());
		cl.setNom(client.getNom());
		cl.setPrenom(client.getPrenom());

		clientRepo.save(cl);
	}

	@Override
	public List<Client> liste() {
		// TODO Auto-generated method stub
		return clientRepo.findAll();
	}

	@Override
	public Client getByName(String name) {
		return clientRepo.findByNom(name);
	}

}
