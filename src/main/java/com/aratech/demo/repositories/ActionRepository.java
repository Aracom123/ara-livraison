package com.aratech.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.aratech.demo.models.Action;

@CrossOrigin("*")
@RepositoryRestResource
public interface ActionRepository extends JpaRepository<Action, Long>{

}
