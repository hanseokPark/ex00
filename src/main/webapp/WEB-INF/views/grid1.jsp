<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	#row1 div{
		border:1px solid red;
		padding:10px;
	}
	#row2 div{
		margin-top:50px;
		border:1px solid blue;
		padding:10px;
	}
	#row4 div{
		border: 1px solid black;
		background: pink;
		padding:10px;
		margin-top:50px;
	}
</style>
</head>
<body>
	<div class="row" id="row1">
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
		<div class="col-md-1">.col-md-1</div>
	</div>
	
	<div class="row" id="row2">
		<div class="col-md-8">col-md-8</div>
		<div class="col-md-4">col-md-8</div>
	</div>
	
	
	<div class="row" id="row4">
		<div class="col-xs-6 col-sm-3">Column 1</div>
		<div class="col-xs-6 col-sm-3">Column 2</div>
		<div class="col-xs-6 col-sm-3">Column 3</div>
		<div class="col-xs-6 col-sm-3">Column 4</div>
	</div>
	
</body>
</html>