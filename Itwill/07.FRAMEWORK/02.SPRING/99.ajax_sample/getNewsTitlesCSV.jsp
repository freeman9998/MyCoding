<%@page import="java.util.Date"%>
<%@page import="com.itwill.ajax.HeadLineNews"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/plain; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	ArrayList<HeadLineNews> newsList=new ArrayList<HeadLineNews>();
	public void newsInit(){
		newsList.clear();
		newsList.add(new HeadLineNews("2017년까지 주택 사 준공공임대로 쓰면 양도세 면제",new Date().toLocaleString(),"한국일보"));		
		newsList.add(new HeadLineNews("정부 \"北 개성공단 규정개정 퇴행적…용인 못해\"",new Date().toLocaleString(),"조선일보"));		
		newsList.add(new HeadLineNews("여야 긴급현안질문 진용확정…창과 방패 대결 연합뉴스",new Date().toLocaleString(),"중앙일보"));		
		newsList.add(new HeadLineNews("지하철 4호선 남양주 진접선 기공식…2020년 개통",new Date().toLocaleString(),"경기일보"));		
		newsList.add(new HeadLineNews("김무성 \"성역없이 얘기\" 문희상 국정농단 논의",new Date().toLocaleString(),"부산일보"));		
		newsList.add(new HeadLineNews("미 CIA 고문실태 보고서 공개…\"최소 119명에 자행\"",new Date().toLocaleString(),"대한일보"));		
		newsList.add(new HeadLineNews("올해 한국서 가장 인기끈 유튜브 동영상 겨울왕국",new Date().toLocaleString(),"민국일보"));		
	}
	
%>
<%
	/*
		3|뉴스타이틀1,뉴스타이틀2,뉴스타이틀3
	*/
	newsInit();
	out.print(newsList.size()+"|");
	for(int i=0;i<newsList.size();i++){
		out.print(newsList.get(i).getTitle()+"["+newsList.get(i).getDate()+"]");
		if(i!=(newsList.size()-1)){
			out.print(",");
		}
	}
%>









