///**
// * 
// */
//package com.aratech.demo.security.services;
//
////import com.aratech.demo.models.Personne;
//
///**
// * @author Amadou Ali Ousseini
// *
// */
//
//
//import com.aratech.demo.models.User;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//public class UserPrinciple extends User implements UserDetails {
//	private static final long serialVersionUID = 1L;
//
//	private Long id;
//
//    private String name;
//
//    private String username;
//
//    private String email;
//
//    @JsonIgnore
//    private String password;
//
//    private Collection authorities;
//
//
//   public UserPrinciple() {
//	   
//   }
//	/**
//	 * @param nom
//	 * @param prenom
//	 * @param numero
//	 * @param email
//	 * @param login
//	 * @param password
//	 */
//	public UserPrinciple(String nom, String prenom, long numero, String email, String login,
//			String password,Collection authorities) {
//		super(nom, prenom, numero, email, login, password);
//		this.authorities = authorities;
//	}
//
//
//
//	public static UserPrinciple build(User user) {
////        List authorities = user.getRoles().stream().map(role ->
////                new SimpleGrantedAuthority(role.getName().name())
////        ).collect(Collectors.toList());
//
//        return new UserPrinciple(
//        		user.getNom(),
//        		user.getPrenom(),
//        		user.getNumero(),
//        		user.getEmail(),
//                user.getLogin(),
//                user.getMotdepasse(),
//                user.getAuthorities()
//        );
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public Collection getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        
//        UserPrinciple user = (UserPrinciple) o;
//        return Objects.equals(id, user.id);
//    }
//}