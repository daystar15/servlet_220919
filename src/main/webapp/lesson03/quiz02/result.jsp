<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Merong</title>
	<!-- bootstrap CDN link -->
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	
	<style>
		a, a:hover {
			text-decoration: none;
			color: #000;
		}
		.logo a {
			color: green;
		}
		form {
			height: 30px;
		}
		nav {
			height: 50px;
			line-height: 50px;
		}
		.info {
			border: 1px solid green;
		}
		.albumInfo p {
			margin-bottom: -5px;
		}
		.lyricBox h5 {
			border-bottom: 1px solid #dcdcdc;
		}
		footer {
			border-top: 1px solid #dcdcdc;
		}
	</style>
</head>
<body>
	<div class="container">
		<header class="pt-3 pb-3">
			<jsp:include page="header.jsp" />
		</header>
		<nav>
			<jsp:include page="menu.jsp" />
		</nav>
		<section class="content">
			<jsp:include page="list_result.jsp" />
		</section>
		<footer class="pt-3">
			<jsp:include page="footer.jsp" />
		</footer>
	</div>
</body>
</html>