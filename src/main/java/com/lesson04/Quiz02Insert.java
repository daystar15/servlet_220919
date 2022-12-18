package com.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.MysqlService;

@WebServlet("/lesson04/quiz02_insert")
public class Quiz02Insert extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// content type 생략 - 다른 페이지로 보낼 것이기 때문에(내가 응답을 만들지 않음)
		response.setCharacterEncoding("utf-8"); // filter클래스 없어서 설정해놓음
		
		// request parameter들 꺼내기
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// favorite에 insert 쿼리
		String insertQuery = "insert into `favorite`"
				+ "(`name`, `url`)"
				+ "values"
				+ "('" + name + "', '" + url + "');";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// DB 연결 해제
		ms.disconnect();
		
		// 사용자 목록 화면으로 이동(Redirect)
		response.sendRedirect("/lesson04/quiz02/quiz02.jsp");
		
	}

}
