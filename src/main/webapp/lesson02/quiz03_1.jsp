<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz03_1</title>
</head>
<body>
<%
	int height = Integer.parseInt(request.getParameter("height"));
	int weight = Integer.parseInt(request.getParameter("weight"));
	double BMI = (double)weight / ((height / 100.0) * (height / 100.0));
	
%>
<div>
	<strong>BMI</strong> 측정 결과 <br>
	당신은 <span class="text-info"><%= %></span>입니다.
</div>
<span>BMI 수치 : <%=BMI %></span>
</body>
</html>