<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex01</title>
</head>
<body>
	<!-- HTML 주석: 소스보기에서 보인다 -->
	<%-- JSP 주석: 소스보기에서 보이지 않는다 --%>
<%
	// 자바 문법 시작(스클립틀릿) %로 묶인 구간 벗어나면 //주석 안먹힘
	// scriptlet - 메인 메소드 같은 느낌
	
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
	}
%>
<strong>합계:</strong>
<input type="text" value="<%=sum %>">
<br>

<%!
	// 선언문 - 클래스같은 느낌
	
	// 필드 (은닉화)
	private int num = 100;

	// 메소드
	public String getHelloWorld() {
		return "Hello world";
	}
%>

<%=num + 200 %><br>

<%=getHelloWorld() %>

<%
	List<Integer> list = new ArrayList<>();
%>

</body>
</html>