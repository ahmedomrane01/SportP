package com.example.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Client {
	
	
	@Id
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	@ManyToOne
	@JoinColumn(name="num_abonnement", nullable=false)
	private Abonnement abonnement;
	
	public Abonnement getAbonnement() {
		return abonnement;
	}

	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="num_entreneur", nullable=false)
	private List<Entreneur> entreneurs;
	
	
	public List<Entreneur> getEntreneurs() {
		return entreneurs;
	}

	public void setEntreneurs(List<Entreneur> entreneurs) {
		this.entreneurs = entreneurs;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", abonnement=" + abonnement + "]";
	}
	
	
	
	

}
