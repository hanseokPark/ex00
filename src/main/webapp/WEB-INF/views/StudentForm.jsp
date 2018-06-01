<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="student" method="post">
		<fieldset>
			<p>
				<label>이름 : </label>
				<input type="text" name="name">
			</p>
			<p>
				<label>반 : </label>
				<input type="text" name="ban">
			</p>
			<p>
				<label>수학 : </label>
				<input type="text" name="math">
			</p>
			<p>
				<label>영어 : </label>
				<input type="text" name="eng">
			</p>
			<p>
				<label>국어 : </label>
				<input type="text" name="kor">
			</p>
			<input type="submit" value="확인">
		</fieldset>		
	</form>
</body>
</html>