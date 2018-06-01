<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>
	<div class="container">
		<h4 class="text-primary">기본 form화면</h4>
		<form>
			<label for="name">이름</label>
			<input type="text" placeholder="이름" id="name">
			<input type="submit">
		</form>
		
		<hr>
		
		<form>
			<div class="form-group">
				<label for="name">이름</label>
				<input type="text" placeholder="이름" class="form-control" id="name">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-default">전송</button>
			</div>
		</form>
	</div>
</body>
</html>




