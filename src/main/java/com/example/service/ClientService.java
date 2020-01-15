package com.example.service;

import java.util.List;

import com.example.entity.Client;

public interface ClientService {

	public void ajouter(Client client);

	public void suppression(Client client);

	public void modification(Client client);

	public Client getByName(String name);

	public List<Client> liste();

}
