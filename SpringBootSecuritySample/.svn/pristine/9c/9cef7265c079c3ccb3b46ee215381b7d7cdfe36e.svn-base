package com.devmk.test.security.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.devmk.test.login.controller.LoginController;
import com.devmk.test.security.service.SecurityService;
import com.devmk.test.util.CommonUtil;
import com.devmk.test.vo.LoginLog;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * 로그인 실패 핸들러
 * 
 */
@Component
public class AuthFailureHandler implements AuthenticationFailureHandler  {
	
	@Autowired
    SecurityService securityService;
	
	private static final Logger logger = LoggerFactory.getLogger(AuthFailureHandler.class);
	
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
		
    	String ip = CommonUtil.getClientIp(request);
		logger.info(" :::::::::::::::::::::::::::: 로그인실패 :::::::::::::::::::::::: ");
		logger.info("@@@ 로그인 실패 아이피  "+ip);
		LoginLog loginLog = new LoginLog();
		String id = "";
		String msg = "";
		try {
			
			id = exception.getMessage();
			
			if(securityService.getSelectMeberInfo(id) != null) {
				securityService.setUpdatePasswordLockCnt(id);
				loginLog.setLoginIp(ip);
				loginLog.setId(id);
				loginLog.setStatus("FAILD");
				securityService.setInsertLoginLog(loginLog);
				msg="A";
			}else {
				msg="B";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		response.sendRedirect("/login?msg="+msg);
	}

}
