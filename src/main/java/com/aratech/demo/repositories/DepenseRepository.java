/**
 * 
 */
package com.aratech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.aratech.demo.models.Depense;

/**
 * @author Amadou Ali Ousseini
 *
 */

@CrossOrigin("*")
@RepositoryRestResource
public interface DepenseRepository extends JpaRepository<Depense, Long>{
	@RestResource(path="/getTotalDepense")
	@Query(value="SELECT SUM(montant) FROM depense", nativeQuery = true)
	public long getTotalDepenses();
}
