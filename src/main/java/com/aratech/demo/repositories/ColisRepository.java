/**
 * 
 */
package com.aratech.demo.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.aratech.demo.models.Coli;


/**
 * @author BAKO ADAMOU
 *
 */

@CrossOrigin("*")
@RepositoryRestResource
public interface ColisRepository extends JpaRepository<Coli, Long> {

	@RestResource(path="/parCodeC")
	public Page<Coli> findByCodeColis(@Param("codecolis") String codeColis, Pageable pageable);
//	
//	@RestResource(path="/parLibelle")
//	@Query(value="SELECT * from colis c where c.liebelle like %?1%", nativeQuery = true)
//	public List<Colis> getStock(@Param("liebelle") String liebelle);
	
}
