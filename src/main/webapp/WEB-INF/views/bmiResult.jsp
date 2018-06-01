<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
			<legend>비만도 테스트 결과</legend>
			<p>
				<label>이름 : </label>
				<label>${info.name }</label>
			</p>
			<p>
				<label>키 : </label>
				<label>${info.height }</label>
			</p>
			<p>
				<label>몸무게 : </label>
				<label>${info.weight }</label>
			</p>
			<c:forEach var="hobby" items="${info.hobbys }">
				<p><label>취미1 : </label>${hobby }</p>
			</c:forEach>
			<p>
				<label>비만도 : </label>
				<label>${info.printInfo() }</label>
			</p>
		</fieldset>
</body>
</html>