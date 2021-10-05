<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form action="/fortune" method="post">
		<div class="mb-3">
			<label for="number" class="form-label">Pick any number from 5 to 25</label>
			<input type="number" class="form-control-sm" max=25 min=5 name="number" id="number"/>
		</div>
		<div class="mb-3">
			<label for="city" class="form-label">Enter the name of any city.</label>
			<input type="text" class="form-control" name="city" id="city" />
		</div>
		<div class="mb-3">
		  <label for="person" class="form-label">Enter the name of any real person</label>
		  <input type="text" class="form-control" id="person" placeholder="Bob Dylan" name="person">
		</div>
		<div class="mb-3">
		  <label for="career" class="form-label">Enter professional endeavor or hobby</label>
		  <input type="text" class="form-control" id="career" placeholder="Underwater Basket Weaving" name="career">
		</div>
		<div class="mb-3">
		  <label for="organism" class="form-label">Enter any type of living thing</label>
		  <input type="text" class="form-control" id="organism" placeholder="ferret" name="organism">
		</div>
		<div class="mb-3">
		  <label for="nice" class="form-label">Say something nice to someone: </label>
		  <textarea type="text" class="form-control-md" id="nice" placeholder="ferret" name="nice"> </textarea>
		</div>
		<p>Send and show a friend</p>
		<button type="submit">Send</button>
	</form>
</div>

</body>
</html>