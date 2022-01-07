package com.aratech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.aratech.demo.models.Profile;

@CrossOrigin("*")
@RepositoryRestResource
public interface ProfileRepository extends JpaRepository<Profile, Long> {
	
	@Query("SELECT p FROM Profile p WHERE p.libelle = ?1")
	public Profile findByLibelle(String name);
	
	@Query("SELECT p FROM Profile p WHERE p.idProfile = ?1")
	public Profile getById(Long id);

}
