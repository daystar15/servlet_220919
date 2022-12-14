<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="d-flex align-items-center">
	<!-- logo -->
	<h1 class="logo mr-5">
		<a href="/lesson03/quiz02/main.jsp">Melong</a>
	</h1>
	
	<!-- search -->
	<form method="get" action="/lesson03/quiz02/result.jsp">
		<div class="search input-group">
			<input type="text" name="keyword" class="form-control"> 
			<div class="input-group-append">
				<input type="submit" value="검색" class="btn btn-info">
			</div>
		</div>
	</form>
</div>