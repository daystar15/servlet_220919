package com.web.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class GetMethodQuiz08 extends HttpServlet {

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// request의 parameter값 받기
		String search = request.getParameter("search"); // name값이 search
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		

		PrintWriter out = response.getWriter();
		
		// HTML 문서로 응답 표현
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String line = iter.next();
			
			// 검색어가 있을 때 문장 출력
//			if (line.contains(search)) {
//				out.print(line + "<br>");
//			}
			
			// 풀이1) 단어 자체로 split
//			if (line.contains(search)) {
//				String[] words = line.split(search);
//				out.print(words[0] + "<b>" + search + "</b>" + words[1]);
//			}
			
			// 풀이2) 단어 replace
			if (line.contains(search)) {
				line = line.replace(search, "<b>" + search + "</b>");
				out.print(line + "<br>");
			}
		}
		
		
		// List를 순회 -> 검색어 있는지 확인
		
//		for (int i = 0; i < list.size(); i++) {
//			String word[] = list.get(i).split(search);
//			for (int j = 0; j < word.length; j++) {
//				if (list.get(i).contains(search)) {
//					out.println(word[j] + "<b>" + search + "</b>");
//				}
//			}
//			
//			
//		}
		
		
		
	}
}
