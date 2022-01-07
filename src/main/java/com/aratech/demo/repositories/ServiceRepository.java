/**
 * 
 */
package com.aratech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.aratech.demo.models.Service;

/**
 * @author Amadou Ali Ousseini
 *
 */
@CrossOrigin("*")
@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, Long>{
	
}
