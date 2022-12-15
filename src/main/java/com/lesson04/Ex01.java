package com.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.MysqlService;

@WebServlet("/lesson04/ex01")
public class Ex01 extends HttpServlet {

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance(); // 객체 생성, 연결하는 코드가 꼭 있어야함
		ms.connect(); // 실질적인 DB 연결 (꼭 넣어야 함)
		
		// DB insert 한 행
		String insertQuery = "insert into `used_goods`"
				+ "(`sellerId`, `title`, `description`, `price`)"
				+ "values"
				+ "(1, '고양이 간식 팝니다.', '저희 고양이가 입맛이 까다로워서 잘 안먹어요ㅠ', 2000);";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		// DB select & 결과 출력
		PrintWriter out = response.getWriter();
		String selectQuery = "select * from `used_goods`;"; // 쿼리문이 만들어짐
		try {
			ResultSet resultSet = ms.select(selectQuery);
			while (resultSet.next()) { // 결과행이 있는 동안 수행, iterator같은 역할
				out.print(resultSet.getInt("id")); // 컬럼명이 id라서 id로 받음
				out.print(resultSet.getString("title")); 
				out.print(resultSet.getInt("price")); 
				out.print(resultSet.getString("description")); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 연결 해제
		ms.disconnect();

	}
}
