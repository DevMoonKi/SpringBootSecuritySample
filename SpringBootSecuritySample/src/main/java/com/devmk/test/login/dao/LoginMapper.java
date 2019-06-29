package com.devmk.test.login.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.devmk.test.vo.LoginLog;
import com.devmk.test.vo.Member;

@Mapper
public interface LoginMapper{

	//메소드 앞에 public 생략해도 기본적으로 public가 붙는다.
	
	/* 회원정보조회 */
	Member getSelectMeberInfo(String id);
	/* 회원가입 */
	public int setInsertMember(Member member);
	/* 로그인 로그 */
	public int setInsertLoginLog(LoginLog loginLog);
	/* 비밀번호 틀린 횟수 증 */
	public int setUpdatePasswordLockCnt(String id);
	/* 비밀번호 틀린횟수 초기화 */
	public int setUpdatePasswordLockCntReset(String id);
	 
}
