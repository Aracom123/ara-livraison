
package com.aratech.demo.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public User createArticle(@RequestBody User user) {
		
		String encodedPassword = bCryptPasswordEncoder.encode(user.getMotdepasse());		
		user.setMotdepasse(encodedPassword);
		
		return userRepository.save(user);
	}

}

