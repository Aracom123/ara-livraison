package com.aratech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aratech.demo.models.Livreur;

public interface LivreurRepository extends JpaRepository<Livreur, Long>  {
	
}