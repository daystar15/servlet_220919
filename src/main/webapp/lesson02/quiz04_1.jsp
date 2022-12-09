<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
	<!-- bootstrap CDN link -->
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String cal = request.getParameter("calculate");
	%>
	<div class="container">
		<h1 class="display-4">계산 결과</h1>
		<%-- 선생님 풀이 
			option의 value값을 따로 지정해야함
			double result = 0;
			String printOperator = null;
			switch (cal) {
			case "plus":
				result = num1 + num2;
				printOperator = "+";
				break;
			case "minus":
				result = num1 - num2;
				printOperator = "-";
				break;
			case "multiple":
				result = num1 * num2;
				printOperator = "X";
				break;
			case "divide":
				result = num1 / num2;
				printOperator = "÷";
				break;
			}
		--%>
		<%
			double result;
			if (cal.equals("+")) {
				result = num1 + num2;
			} else if (cal.equals("-")) {
				result = num1 - num2;
			} else if (cal.equals("*")) {
				result = num1 * num2;
			} else {
				result = (double)num1 / num2;
			}
		 %>
		<div class="display-3"><%= num1 %> <%= cal %> <%= num2 %> = <span class="text-primary"><%= result %></span></div>
		<%--
			out.print(num1 + " " + printOperator + " " + num2 + " = ");
		--%>
		<!--<span class="text-primary"><%= result %></span> -->
	</div>
</body>
</html>