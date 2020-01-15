package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Abonnement;


@Repository
public interface AbonnementRepository extends  JpaRepository<Abonnement, Integer>{
	


}
