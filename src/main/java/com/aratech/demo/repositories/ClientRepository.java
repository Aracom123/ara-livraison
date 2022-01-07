package com.aratech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.aratech.demo.models.Client;

@CrossOrigin("*")
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long>{
	@RestResource(path="/countClient")
	@Query(value="SELECT count(*) FROM client c WHERE c.numero = ?1", nativeQuery = true)
	public long countClientByNumero(@Param("numeroClient") long numeroClient);
	
	@RestResource(path="/parNumero")
	@Query(value="SELECT * FROM client c WHERE c.numero = ?1", nativeQuery = true)
	public Client getClientByNumero(@Param("numeroClient") long numeroClient);
	
	@RestResource(path="/getNombreClients")
	@Query(value="SELECT COUNT(*) FROM client", nativeQuery = true)
	public long getNombreDeClients();
}