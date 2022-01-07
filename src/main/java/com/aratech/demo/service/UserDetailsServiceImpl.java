//package com.noor.school.service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User.UserBuilder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//
//import com.noor.school.service.AccountService;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService{
//	@Autowired
//	private AccountServiceImpl accountService;
//
//	@Override
//	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		com.noor.school.entities.User user = accountService.findByUserName(login);
//		
//		//UserBuilder builder = null;
//		if(user == null) throw new UsernameNotFoundException("invaild user");
//		
//		/*builder = org.springframework.security.core.userdetails.User.withUsername(login);
//		builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));*/
//		Collection<GrantedAuthority> authorities = new ArrayList<>();
//		user.getRoles().forEach(r->{
//			authorities.add(new SimpleGrantedAuthority(r.getRole()));
//		});
//		
//		//return builder.build();
//		return new User(user.getLogin(), user.getPassword(),authorities);
//		//return AppUser;
//	}
//
//}
