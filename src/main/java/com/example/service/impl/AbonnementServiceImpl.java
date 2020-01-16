package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Abonnement;
import com.example.repository.AbonnementRepository;
import com.example.service.AbonnementService;

@Service
public class AbonnementServiceImpl implements AbonnementService {

	@Autowired
	private AbonnementRepository abonnementRepo;


	@Override
	public void ajouter(Abonnement abonnement) {

	 abonnementRepo.save(abonnement);
		

	}

	@Override
	public void suppression(Abonnement abonnement) {
		abonnementRepo.delete(abonnement);
	}

	@Override
	public void modification(Abonnement abonnement) {
		Abonnement ab = abonnementRepo.getOne(abonnement.getNum());
		ab.setType(abonnement.getType());
		
		abonnementRepo.save(ab);
	}

	@Override
	public List<Abonnement> liste() {
		return abonnementRepo.findAll();
	}

}
