package com.aratech.demo;

import java.util.Collection;
import java.util.Optional;

//import java.text.DateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.aratech.demo.models.Action;
import com.aratech.demo.models.Profile;
import com.aratech.demo.models.User;
import com.aratech.demo.repositories.ActionRepository;
import com.aratech.demo.repositories.ProfileRepository;
import com.aratech.demo.repositories.UserRepository;

@SpringBootApplication
public class AralivraisonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AralivraisonApplication.class, args);
	}
	
	@Autowired
	private UserRepository repository;
	
	//WebMvcConfigurer bean
	@Configuration
	public class CorsConfiguration 
	{
	    @Bean
	    public WebMvcConfigurer corsConfigurer() 
	    {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/api/**")
	                .allowedOrigins("*");
	            }
	        };
	    }
	}
	
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;	
	
	//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//	@Bean
//	CommandLineRunner start(ProfileRepository pRpository, UserRepository uRepository) {
//		return args->{				
//			
//			int nbrProfile = (int) pRpository.count();
//			
//			int nbrUsers = (int) uRepository.count();
//			
//			if(nbrProfile == 0 && nbrUsers == 0) {
//				Profile profile = new Profile();
//				profile.setLibelle("ADMIN");
//				profile = pRpository.save(profile);
//				System.out.println("PROFILE PAR DEFAUT"+ profile);
//				
//				User user = new User();
//				user.setNom("BAKO");
//				user.setPrenom("ADAMOU");
//				user.setLogin("admin");
//				user.setMotdepasse(this.getBCPE().encode("admin"));
//				user.setProfile(profile);
//				user = uRepository.save(user);
//				System.out.println("UTILISATEUR PAR DEFAUT"+ user);
//			}
//			
//			System.out.println("Nombre de profiles: "+ nbrProfile);
//			
//			
//			
////			if(profile != null) {
////				//System.out.println(profile);
////				Collection<Action> actions = actionRepository.findAll();
////				profile.setActions(actions);
////				pRpository.save(profile);
////				System.out.println(profile);
////			}			
//		};
//		
//	}

}
