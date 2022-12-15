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

@WebServlet("/lesson04/quiz01")
public class quiz01 extends HttpServlet {

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// DB insert
		String insertQuery = "insert into `real_estate`"
				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)"
				+ "values"
				+ "( 3,'헤라펠리스 101동 5305호', 350, '매매', 1500000, NULL);";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB select & 결과 출력
		PrintWriter out = response.getWriter();
		String selectQuery = "select * from `real_estate` order by `id` desc;";
		try {
			ResultSet resultSet = ms.select(selectQuery);
			while (resultSet.next()) {
				out.print("매물 주소 : " + resultSet.getString("address") + ", ");
				out.print("면적 : " + resultSet.getInt("area") + ", ");
				out.println("타입 : " + resultSet.getString("type"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 연결 해제
		ms.disconnect();
	}
}
