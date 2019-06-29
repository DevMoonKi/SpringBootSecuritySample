package com.devmk.test.vo;


import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class Member implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	/*?•„?´?””*/
	private String id;
	/*ë¹„ë?ë²ˆí˜¸*/
	private String password;
	/*?´ë¦?*/
	private String memberName;
	/*?´ë©”ì¼*/
	private String email;
	/*ê¶Œí•œ*/
	private String userRole;
	/*ë¹„ë?ë²ˆí˜¸ ??ë¦? ?šŸ?ˆ˜*/
	private int passwordLock;
	/*?“±ë¡ì¼*/
	private String regDate;
	/*?ˆ˜? •?¼*/
	private String modDate;
	/*ë¹„ë?ë²ˆí˜¸ ë³?ê²? ?‚ ì§?*/
	private String passwordChgDate;
	/*?ƒ?ƒœ*/
	private String status;
	
	/*UserDetails ê¸°ë³¸ ë³??ˆ˜*/
	private Collection<? extends GrantedAuthority> authorities;
	   
	private boolean isEnabled = true;
	
	private String username;
	
	private boolean isCredentialsNonExpired = true;
	
	private boolean isAccountNonExpired = true;
	
	private boolean isAccountNonLocked = true;

}
