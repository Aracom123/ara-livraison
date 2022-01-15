package com.aratech.demo.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
		return livraisonRepository.findAll(page);
	}
	
	@GetMapping("/api/mesLivraisons/{id}")
	public Livraison getLivraison(@PathVariable(value="id") long idLivraison){
		Livraison l = null;
		Optional<Livraison> findItem = livraisonRepository.findById(idLivraison);
		if(findItem.isPresent()) {
			l = findItem.get();
		}
		return l;
	}

	@GetMapping("/api/mesLivraisons/parDate")
	public Page<Livraison> getAllEnableLivraisonParDate(
			@RequestParam(name="dateLivraison", defaultValue="") Date date, 
			Pageable page){
		
		return livraisonRepository.getLivraisonParDate(date, page);
	}
	
	@GetMapping("/api/mesLivraisons/parClient")
	public Page<Livraison> getAllEnableLivraisonParClient(
			@RequestParam(name="idClient", defaultValue="") long idClient, 
			Pageable page){
		
		return livraisonRepository.getLivraisonParClient(idClient, page);
	}
	
	@GetMapping("/api/mesLivraisons/parLivreur")
	public Page<Livraison> getAllEnableLivraisonParLivreur(
			@RequestParam(name="idLivreur", defaultValue="") long idLivreur, 
			Pageable page){
		
		return livraisonRepository.getLivraisonParLivreur(idLivreur, page);
	}
	
	@GetMapping("/api/mesLivraisons/parLivreurEtDate")
	public Page<Livraison> getLivraisonParLivreurEtDate(			
			@RequestParam(name="idLivreur", defaultValue="") long idLivreur, 
			@RequestParam(name="dateLivraison", defaultValue="") Date date,
			Pageable page){		
		return livraisonRepository.getLivraisonParLivreurEtDate(idLivreur, date, page);
	}
	
	@GetMapping("/api/mesLivraisons/parClientEtDate")
	public Page<Livraison> getLivraisonParClientEtDate(			
			@RequestParam(name="idClient", defaultValue="") long idClient, 
			@RequestParam(name="dateLivraison", defaultValue="") Date date,
			Pageable page){		
		return livraisonRepository.getLivraisonParClientEtDate(idClient, date, page);
	}
	
	@GetMapping("/api/mesLivraisons/parDateAndVendeurAndClient")
	public Page<Livraison> parDateAndVendeurAndClient(			
			@RequestParam(name="idClient", defaultValue="") long idClient, 
			@RequestParam(name="idLivreur", defaultValue="") long idLivreur,
			@RequestParam(name="dateLivraison", defaultValue="") Date date,
			Pageable page){		
		return livraisonRepository.getLivraisonParClientEtDateEtLivreur(idClient, date, idLivreur, page);
	}
}
