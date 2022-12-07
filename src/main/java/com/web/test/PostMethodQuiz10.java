package com.web.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class PostMethodQuiz10 extends HttpServlet {

	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	    
	};
	
	
	
	@Override
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		// request로 parameter 가져오기
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		// 비교 => HTML
		if (userMap.get("id").equals(id) == false) {
			out.print("id가 일치하지 않습니다.");
		} else if (!userMap.get("password").equals(password)) {
			out.print("password가 일치하지 않습니다.");
		} else {
			// 모두 일치
			out.print(userMap.get("name") + "님 환영합니다!");
		}
		
	}
}
