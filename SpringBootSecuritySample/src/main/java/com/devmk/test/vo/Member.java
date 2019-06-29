package com.devmk.test.vo;


import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class Member implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	/*?��?��?��*/
	private String id;
	/*비�?번호*/
	private String password;
	/*?���?*/
	private String memberName;
	/*?��메일*/
	private String email;
	/*권한*/
	private String userRole;
	/*비�?번호 ??�? ?��?��*/
	private int passwordLock;
	/*?��록일*/
	private String regDate;
	/*?��?��?��*/
	private String modDate;
	/*비�?번호 �?�? ?���?*/
	private String passwordChgDate;
	/*?��?��*/
	private String status;
	
	/*UserDetails 기본 �??��*/
	private Collection<? extends GrantedAuthority> authorities;
	   
	private boolean isEnabled = true;
	
	private String username;
	
	private boolean isCredentialsNonExpired = true;
	
	private boolean isAccountNonExpired = true;
	
	private boolean isAccountNonLocked = true;

}
