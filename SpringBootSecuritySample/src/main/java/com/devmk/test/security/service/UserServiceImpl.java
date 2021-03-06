package com.devmk.test.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.devmk.test.login.dao.LoginMapper;
import com.devmk.test.vo.LoginLog;
import com.devmk.test.vo.Member;

@Service
public class UserServiceImpl implements SecurityService {
	
	@Autowired
	LoginMapper loingMapper;
	
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
         Member member = loingMapper.getSelectMeberInfo(id);
         List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
         
         if(member != null) {
             authorities.add(new SimpleGrantedAuthority(member.getUserRole()));
             member.setAuthorities(authorities);
         }
         return member;
    }
    
    @Override
	public int setInsertMember(Member member) throws Exception{
		return loingMapper.setInsertMember(member);
	}
  

    @Override
	public Member getSelectMeberInfo(String id) throws Exception{
		return loingMapper.getSelectMeberInfo(id);
	}
	
    
    @Override
	public int setInsertLoginLog(LoginLog loginLog) throws Exception{
		return loingMapper.setInsertLoginLog(loginLog);
	}
	
    @Override
	public int setUpdatePasswordLockCnt(String id) throws Exception{
		return loingMapper.setUpdatePasswordLockCnt(id);
	}
	
    @Override
	public int setUpdatePasswordLockCntReset(String id) throws Exception{
		return loingMapper.setUpdatePasswordLockCntReset(id);
	}

}
