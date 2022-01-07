//package com.noor.school.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import java.util.Optional;
//
//import javax.transaction.Transactional;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
////import org.springframework.transaction.annotation.Transactional;
//
//import com.noor.school.entities.Role;
//import com.noor.school.entities.User;
//import com.noor.school.repositories.RoleRepository;
//import com.noor.school.repositories.UserRepository;
//@Service
//@Transactional
//public class AccountServiceImpl implements AccountService{
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private RoleRepository roleRepository;
//	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//	@Override
//	public User saveUser(User u) {
//		// TODO Auto-generated method stub
//		return userRepository.save(u);
//	}
//
//	@Override
//	public Role saveRole(Role r) {
//		// TODO Auto-generated method stub
//		return roleRepository.save(r);
//	}
//
//	@Override
//	public User findByUserName(String username) {
//		// TODO Auto-generated method stub
//		return userRepository.findByLogin(username);
//	}
//
//	@Override
//	public void addRoleToUser(String login, String roleName) {
//		// TODO Auto-generated method stub
//		//User user = findUserByEmail(email);
//		User user = findByUserName(login);
//		if(user == null) throw new RuntimeException("User already exist");
//		Role role = roleRepository.findByRole(roleName);
//		user.getRoles().add(role);
//	}
//
//	@Override
//	public User saveUser(String login,String email, String lastName, String firstName, String password, String confirmPassword, String pays, String photo) {
//		User user = findUserByEmail(login);
//		if(user != null) throw new RuntimeException("User already exist");
//		if(!password.equals(confirmPassword)) throw new RuntimeException("Please confirm the password");
//		
//		User userAdd = new User();
//		userAdd.setLogin(login);
//		userAdd.setLastName(lastName);
//		userAdd.setFirstName(firstName);
//		userAdd.setActive(true);
//		userAdd.setPays(pays);
//		userAdd.setPhoto(photo);
//		userAdd.setPassword(bCryptPasswordEncoder.encode(password));
//		userRepository.save(userAdd);
//		//addRoleToUser(login,"USER");
//		return userAdd;
//	}
//
//	@Override
//	public Role save(Role role) {
//		// TODO Auto-generated method stub
//		return roleRepository.save(role);
//	}
//
//	@Override
//	public User loadUserbyLogin(String login) {
//		// TODO Auto-generated method stub
//		return userRepository.findByLogin(login);
//	}
//
//	
//	@Override
//	public User findUserByEmail(String email) {
//		// TODO Auto-generated method stub
//		return userRepository.findByEmail(email);
//	}
//
//	@Override
//	public User findUserByResetToken(String resetToken) {
//		// TODO Auto-generated method stub
//		return userRepository.findByResetToken(resetToken);
//	}
//	
//	public void updateResetPasswordToken(String token, String email) throws RuntimeException {
//        User user = userRepository.findByEmail(email);
//        if (user != null) {
//            user.setResetToken(token);
//            userRepository.save(user);
//        } else {
//            throw new RuntimeException("Could not find any customer with the email " + email);
//        }
//    }
//     
//	
//    public void updatePassword(User user, String newPassword) {
//	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//	    String encodedPassword = passwordEncoder.encode(newPassword);
//	    user.setPassword(encodedPassword);
//	     
//	    user.setResetToken(null);
//	    userRepository.save(user);
//    }
//	
////	 public void updateResetPasswordToken(String token, String email) throws UserNotFoundException {
////	        User user = userRepository.findByEmail(email);
////	        if (user != null) {
////	        	user.setResetPasswordToken(token);
////	        	userRepository.save(customer);
////	        } else {
////	            throw new CustomerNotFoundException("Could not find any customer with the email " + email);
////	        }
////	    }
////	     
////	    public Customer getByResetPasswordToken(String token) {
////	        return customerRepo.findByResetPasswordToken(token);
////	    }
////	     
////	    public void updatePassword(Customer customer, String newPassword) {
////	        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
////	        String encodedPassword = passwordEncoder.encode(newPassword);
////	        customer.setPassword(encodedPassword);
////	         
////	        customer.setResetPasswordToken(null);
////	        customerRepo.save(customer);
////	    }
//}
