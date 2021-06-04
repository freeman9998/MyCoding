<%@ page language="java" contentType="text/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.URLEncoder"%>

<%
	String clientId = "Jaxxx_gxFJfvXW9FrxFP";
	String clientSecret = "9xjPC6rXZi";
	try {
		String text = URLEncoder.encode("자바스크립트", "UTF-8");
		String apiURL = "https://openapi.naver.com/v1/search/book?display=100&query="+ text; // json 
		//String apiURL = "https://openapi.naver.com/v1/search/book.xml?query="+ text; // xml 
		//String apiURL = "https://openapi.naver.com/v1/search/blog?query="+ text; // json 
		//String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query=" + text; // xml 
		URL url = new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("X-Naver-Client-Id", clientId);
		con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
		
		int responseCode = con.getResponseCode();
		BufferedReader br;
		if (responseCode == 200) { 
			br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
		} else { 
			br = new BufferedReader(new InputStreamReader(con.getErrorStream(),"UTF-8"));
		}
		String inputLine;
		StringBuffer resp = new StringBuffer();
		while ((inputLine = br.readLine()) != null) {
			resp.append(inputLine);
		}
		br.close();
		System.out.println(resp.toString());
		out.print(resp.toString());
	} catch (Exception e) {
		System.out.println(e);
	}
%>


