package com.devmk.test.vo;


import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class Member implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	/*??΄?*/
	private String id;
	/*λΉλ?λ²νΈ*/
	private String password;
	/*?΄λ¦?*/
	private String memberName;
	/*?΄λ©μΌ*/
	private String email;
	/*κΆν*/
	private String userRole;
	/*λΉλ?λ²νΈ ??λ¦? ??*/
	private int passwordLock;
	/*?±λ‘μΌ*/
	private String regDate;
	/*?? ?Ό*/
	private String modDate;
	/*λΉλ?λ²νΈ λ³?κ²? ? μ§?*/
	private String passwordChgDate;
	/*??*/
	private String status;
	
	/*UserDetails κΈ°λ³Έ λ³??*/
	private Collection<? extends GrantedAuthority> authorities;
	   
	private boolean isEnabled = true;
	
	private String username;
	
	private boolean isCredentialsNonExpired = true;
	
	private boolean isAccountNonExpired = true;
	
	private boolean isAccountNonLocked = true;

}
