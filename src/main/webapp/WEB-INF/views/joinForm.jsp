<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label{
		float:left;
		width:90px;
		
	}
</style>
</head>
<body>
	<form action="join" method="post">
		<p>
			<label>이름</label>
			<input type="text" name="name">
		</p>
		<p>
			<label>비밀번호</label>
			<input type="password" name="password">
		</p>
		<p>
			<input type="submit" value="회원가입">
		</p>
	</form>
</body>
</html>