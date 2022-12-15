package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	// 필드
		private static MysqlService mysqlService = null;
		
		// mysql 홈에서 localhost번호 확인해서 넣기, DB접속 정보
		private String url = "jdbc:mysql://localhost:3306/db_220919"; // 도메인 뒤에 접속할 데이터베이스명까지 넣는다.
		private String id = "root"; // mysql 아이디값
		private String pw = "root"; // mysql 비번
		
		private Connection conn; // jdbc라이브러리를 사용할 수 있도록함
		private Statement statement; // import java.sql.Statement 이 패키지 선택하기
		private ResultSet res;
		
		// 메소드
		
		// Singleton 패턴: MysqlService라는 객체가 단 하나만 생성될 수 있도록 하는 디자인 패턴
		// DB연결을 여러 객체에서 하지 않도록
		public static MysqlService getInstance() {
			// 유일한 하나의 객체만 가질 수 있음
			if (mysqlService == null) {
				mysqlService = new MysqlService();
			}
			return mysqlService;
		}
		
		// DB 접속
		public void connect() {
			try {
				// 1. 드라이버 메모리에 로딩 - jdbc를 드라이버 메모리라고 함
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				
				// 2. DB 연결(connection) - 실제 연결
				conn = DriverManager.getConnection(url, id, pw);
				
				// 3. statement: DB와 연결해서 쿼리를 실행하기 위한 준비, 쿼리를 할 수 있는 매개체
				statement = conn.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		// DB 연결 해제
		public void disconnect() {
			try {
				statement.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	 	// CRUD   R / CUD
		
		// R: select
		public ResultSet select(String query) throws SQLException {
			res = statement.executeQuery(query);
			return res;
		}
		
		// CUD: insert, update, delete - 수행하고 끝, 안돌려받음
		public void update(String query) throws SQLException {
			statement.executeUpdate(query);
		}

}
