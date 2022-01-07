package com.aratech.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.aratech.demo.models.Profile;
import com.aratech.demo.models.User;
import com.aratech.demo.repositories.ProfileRepository;
import com.aratech.demo.repositories.UserRepository;

@Service
public class CustomUserDetailService  implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	ProfileRepository profileRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void saveUserWithDefaultProfile(User user) {
		System.out.println("------- USER -------");
		System.out.println(user);
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String encodedPassword = bCryptPasswordEncoder.encode(user.getMotdepasse());
		
		user.setMotdepasse(encodedPassword);		
		Profile p = profileRepository.findByLibelle("USER");
		
		user.setProfile(p);		
		userRepository.save(user);
	}
	
	public User save(User user) {
		System.out.println("------- USER -------");
		System.out.println(user);
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String encodedPassword = bCryptPasswordEncoder.encode(user.getMotdepasse());
		
		user.setMotdepasse(encodedPassword);		
		return userRepository.save(user);
	}
	
	public List<User> listAllUser(){
		return userRepository.findAll();
	}
	
	public List<Profile> getProfiles(){
		return profileRepository.findAll();
	}
	
	public User get(Long id) {
		return userRepository.findById(id).get();
	}
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		
		User user = userRepository.findByLogin(login);
		
		return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getMotdepasse(), new ArrayList<>());
		
		
		
	}

}
