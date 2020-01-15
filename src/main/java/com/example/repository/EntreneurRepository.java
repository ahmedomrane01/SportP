package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Entreneur;

@Repository
public interface EntreneurRepository extends JpaRepository<Entreneur, Integer>{

}
