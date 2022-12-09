<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz03_1</title>
	<!-- bootstrap CDN link -->
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<%
	int height = Integer.parseInt(request.getParameter("height"));
	int weight = Integer.parseInt(request.getParameter("weight"));
	// out.println("height");
	// out.println("weight");
	double BMI = (double)weight / ((height / 100.0) * (height / 100.0));
	String result = null;

	if (BMI <= 20) { // ~ 20
		result = "저체중";
	} else if (BMI <= 25) { // 21 ~ 25
		result = "정상";
	} else if (BMI <= 30) { // 26 ~ 30
		result = "과체중";
	} else { // 31 ~
		result = "비만";
	}
%>
<div class="container">
	<div class="mb-3">
		<div class="display-4"><strong class="font-weight-bold">BMI</strong> 측정 결과</div> <br>
		<div class="display-3">당신은 <span class="text-info"><%=result %></span>입니다.</div>
	</div>
	<span>BMI 수치 : <%=BMI %></span>
</div>

</body>
</html>