package com.web.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		// request parameter 꺼내기
		String name = request.getParameter("name");
		String introduceMyself = request.getParameter("introduceMyself");
		
		// 결과 뿌리기(태그)
		PrintWriter out = response.getWriter();
		out.print("<b>" + name + "</b>님 지원이 완료 되었습니다.<br>");
		out.print("<h3>지원 내용</h3>");
		out.print(introduceMyself);
		
	}
}
