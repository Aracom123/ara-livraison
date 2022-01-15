
package com.aratech.demo.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aratech.demo.exceptions.RessourceNotFoundException;
import com.aratech.demo.models.Coli;
import com.aratech.demo.models.Livraison;
import com.aratech.demo.models.User;
import com.aratech.demo.repositories.UserRepository;
import com.aratech.demo.service.CustomUserDetailService;


/**
 * @author Amadou Ali Ousseini
 *
 */

@CrossOrigin(origins="*")
@RestController
@RequestMapping("")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/api/utilisateurs")
	public User createUser(@RequestBody User user) {
		
		String encodedPassword = bCryptPasswordEncoder.encode(user.getMotdepasse());		
		user.setMotdepasse(encodedPassword);
		
		return userRepository.save(user);
	}
	
	@PutMapping("/api/utilisateurs/{id}")
    User replaceEtudiant(@RequestBody User newUser, @PathVariable Long id) {

      return userRepository.findById(id)
        .map(user -> {
        	user.setNom(newUser.getNom());
        	user.setPrenom(newUser.getPrenom());
        	user.setEmail(newUser.getEmail());
        	user.setProfile(newUser.getProfile());
          return userRepository.save(user);
        })
        .orElseGet(() -> {
          newUser.setId(id);
          return userRepository.save(newUser);
        });
    }
	
	@PutMapping("/api/utilisateurs/resetpw/{id}")
    User changePassword(@PathVariable Long id, @RequestBody String newPassword) {
		String encodedPassword = bCryptPasswordEncoder.encode(newPassword);
      return userRepository.findById(id)
        .map(user -> {
        	user.setMotdepasse(encodedPassword);
          return userRepository.save(user);
        })
        .orElseGet(() -> {
          return null;
        });
    }
	
	@GetMapping("/api/mesUsers")
	public Page<User> getAllItems(Pageable page){
		
		return userRepository.findAll(page);
	}
	@GetMapping("/api/mesUsers/{id}")
	public User getUser(@PathVariable(value="id") long idUser){
		User u = null;
		Optional<User> findItem = userRepository.findById(idUser);
		if(findItem.isPresent()) {
			u = findItem.get();
		}
		return u;
	}

}

