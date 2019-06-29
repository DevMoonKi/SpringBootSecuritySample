<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
<script
  src="https://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>
  <!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
</head>
<body>
	<div class="container">
		<h1>로그인 성공</h1>
		
		- 권한을 체크하는 태그 입니다.
		<br/>
		* 로그인 되지 않았다면 [TRUE] 입니다.
		<br/>
		<sec:authorize access="isAnonymous()">[TRUE]</sec:authorize>
		<br/>
		<br/>
		* 로그인 했다면 참입니다.
		<br/>
		&nbsp;&nbsp;<sec:authorize access="isAuthenticated()">[TRUE]</sec:authorize>
		<br/>
		
		* 인자로 주어진 ROLE_ADMIN을 가지고 있다면 [TRUE]입니다.
		<br/>
		<br/>
		&nbsp;&nbsp;<sec:authorize access="hasRole('ROLE_ADMIN')">[TRUE]</sec:authorize>
		<br/>
		* 인자로 주어진 ROLE_USER을 가지고 있다면 [TRUE]입니다.
		<br/>
		&nbsp;&nbsp;<sec:authorize access="hasRole('ROLE_USER')">[TRUE]</sec:authorize>
		<br/>
		<br/>
		* 인자로 주어진 ROLE_ADMIN을 가지고 있지 않다면 [TRUE]입니다.
		<br/>
		&nbsp;&nbsp;<sec:authorize access="!hasRole('ROLE_ADMIN')">[TRUE]</sec:authorize>
		<br/>
		<br/>
		* 인자로 주어진 ROLE_USER을 가지고 있지 않다면 [TRUE]입니다.
		<br/>
		&nbsp;&nbsp;<sec:authorize access="!hasRole('ROLE_USER')">[TRUE]</sec:authorize>
		<br/>
		<br/>
		* 인자로 주어진 롤들중 하나라도 가지고 있다면 [TRUE]입니다.
		<br/>
		&nbsp;&nbsp;<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_USER')">[TRUE]</sec:authorize>
		<br/>
		<br/>
		* 이 사용자는 "Rememember Me Cookies"로 자동 로그인이라면 [TRUE]입니다.
   		<br/>
   		&nbsp;&nbsp;<sec:authorize access="isRememberMe()">[TRUE]</sec:authorize>
 		<br/>
		<br/>
 		* 이 사용자는 사용자 아이디/비밀번호로 로그인 하고 있으면 [TRUE]입니다.
 		<br/>
	    &nbsp;&nbsp;<sec:authorize access="isFullyAuthenticated()">[TRUE]</sec:authorize>
		<br/>
		<br/>
		<a href="/login/logout">[로그아웃]</a>
	</div>
</body>
</html>