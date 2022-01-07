package com.aratech.demo.controllers;


//import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.aratech.demo.models.AuthRequest;
import com.aratech.demo.models.Profile;
import com.aratech.demo.models.User;
import com.aratech.demo.repositories.ProfileRepository;
import com.aratech.demo.repositories.UserRepository;
import com.aratech.demo.util.JwtUtil;


@RestController
@CrossOrigin("*")
public class WelcomeController {

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private UserRepository uRepository;
	
	@Autowired
	private ProfileRepository pRepository;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@GetMapping("/")
	public String welcome() {
		return "Welcome to xadmin channel";
	}

	@PostMapping("/authenticate")
	//@Produces()
	public JSONObject generateToken(@RequestBody AuthRequest authrequest) throws Exception {
		
		//System.out.println("LOGIN === >" +authrequest.getLogin());	
		
		
		System.out.println("PASSWORD === >" + bCryptPasswordEncoder.encode(authrequest.getPassword()));
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authrequest.getLogin(), authrequest.getPassword()));
		}
		catch (Exception e) {
			throw new Exception("Invalid login and password");
		}
		
		System.out.println(authrequest.getLogin());
		JSONObject token = new JSONObject();
		
		User user = (User) uRepository.findByLogin(authrequest.getLogin());
		Profile userPro = user.getProfile();
		//System.out.println("PROFILE === >" +userPro); 
		
		//User u = userRepository.findByLogin(authrequest.getLogin());
		String jwt = jwtUtil.generateToken(authrequest.getLogin());		
		token.put("token", jwt);
		token.put("expiresIn", jwtUtil.extractExpiration(jwt));
		token.put("idUser", user.getId());
		token.put("nom", user.getNom());
		token.put("prenom", user.getPrenom());
		token.put("profile", userPro.getLibelle());
		token.put("idProfile", userPro.getIdProfile());
		
		return token;
	
	}

}
