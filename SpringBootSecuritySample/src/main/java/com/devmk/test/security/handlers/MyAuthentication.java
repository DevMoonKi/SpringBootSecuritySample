package com.devmk.test.security.handlers;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.devmk.test.vo.Member;

import lombok.Data;


//현재 로그인한 사용자 객체 저장 DTO

@Data
public class MyAuthentication extends UsernamePasswordAuthenticationToken{
	private static final long serialVersionUID = 1L;
	
	Member member;
	
	public MyAuthentication(String id, String password, List<GrantedAuthority> grantedAuthorityList, Member member) {
		super(id, password, grantedAuthorityList);
		this.member = member;
	}
}

