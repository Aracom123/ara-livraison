package com.aratech.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aratech.demo.models.Livraison;
import com.aratech.demo.repositories.LivraisonRepository;

@CrossOrigin(origins="*")
@RestController
public class LivraisonController {
	
	@Autowired
	private LivraisonRepository livraisonRepository;
	
	@GetMapping("/api/mesLivraisons")
	public Page<Livraison> getAllItems(Pageable page){
		System.out.println("Liste de tous les Items ....");
		
		List<Livraison> mesLivraisons = new ArrayList<>();
		
		livraisonRepository.findAll().forEach(mesLivraisons::add);
		
		return livraisonRepository.findAll(page);
	}
}
