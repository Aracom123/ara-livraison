package com.aratech.demo.repositories;

import java.sql.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.aratech.demo.models.Livraison;

public interface LivraisonRepository extends JpaRepository<Livraison, Long> {
	@RestResource(path="/parLivreurEtDate")
	@Query(value="SELECT * FROM livraison l WHERE l.livreur_id_livreur = ?1 and l.date_livraison = ?2", nativeQuery = true)
	public Page<Livraison> getLivraisonParLivreurEtDate(@Param("idLivreur") long idLivreur, @Param("dateLivraison") Date date, Pageable pageable);
	
	@RestResource(path="/parLivreur")
	@Query(value="SELECT * FROM livraison l WHERE l.livreur_id_livreur = ?1", nativeQuery = true)
	public Page<Livraison> getLivraisonParLivreur(@Param("idLivreur") long idLivreur, Pageable pageable);
	
	@RestResource(path="/parClient")
	@Query(value="SELECT * FROM livraison l WHERE l.client_id_client = ?1", nativeQuery = true)
	public Page<Livraison> getLivraisonParClient(@Param("idClient") long idLivreur, Pageable pageable);
	
	@RestResource(path="/parDate")
	@Query(value="SELECT * FROM livraison l WHERE l.date_livraison = ?1", nativeQuery = true)
	public Page<Livraison> getLivraisonParDate(@Param("dateLivraison") Date date, Pageable pageable);
	
	@RestResource(path="/parPeriode")
	@Query(value="SELECT * FROM livraison l WHERE l.date_livraison >= ?1 AND l.date_livraison <= ?2", nativeQuery = true)
	public Page<Livraison> getVenteParPeriode(@Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin, Pageable pageable);
	
	@RestResource(path="/getNombreLivraison")
	@Query(value="SELECT COUNT(*) FROM livraison", nativeQuery = true)
	public long getNombreDeLivraisons();
	
	@RestResource(path="/getCATotal")
	@Query(value="SELECT SUM(l.frais_livraison) FROM livraison l", nativeQuery = true)
	public long getCATotalLivraison();
}
