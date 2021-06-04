package com.itwill.prm.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.itwill.prm.dao.PaystubsDao;
import com.itwill.prm.vo.PaystubsResultValue;

public class PayStubsService {
	private PaystubsDao payStubs;
	
	public PayStubsService() {
		payStubs = new PaystubsDao();
	}
	
	public List<PaystubsResultValue> payFindByNo(int member_no) throws Exception{
		List<PaystubsResultValue> payfindNo = payStubs.selectByNo(member_no);
		return payfindNo;
	}
	/***********************해당하는 달의 상세급여명세서를 보여준다*******************************/
	
	public PaystubsResultValue selectByNoMM(int member_no, int workMonth) throws Exception {	
		return payStubs.selectByNoMM(member_no, workMonth); 
	}
	
	public PaystubsResultValue selectLikeMM(String workMonth,int member_no) throws Exception{
		return payStubs.selectLikeMM(workMonth, member_no);
	}
	

	
	/**********************해당하는 달의 지급액과 증감률을 구한다.*******************************/
	
	public int amountPay(int member_no, String date) throws Exception{
		PaystubsResultValue prePayS =payStubs.selectLikeMM(casting(presentMonth(date)),member_no);
		int presentTot = prePayS.getTot();
		return presentTot;
	}
	
	public String casting(YearMonth date) {
		
		return date.format(DateTimeFormatter.ofPattern("yyyy/MM"));
	}
	
	public String monthOnMonthCal(int member_no, String date) throws Exception {
		PaystubsResultValue befPayS =payStubs.selectLikeMM(casting(beforeMonth(date)),member_no);
		if(befPayS!=null) {
		PaystubsResultValue prePayS =payStubs.selectLikeMM(casting(presentMonth(date)),member_no);
		int presentTot = prePayS.getTot();
				
		int beforeTot = befPayS.getTot();
		return calculateRate(presentTot, beforeTot);
		
		}
		return "-";		
	}
	
	public String calculateRate(int tot1, int tot2) {
		double result = (((double)tot1-(double)tot2)/(double)tot1)*100.0;	
		return String.format("%.2f", result);
	}
	
	/***********************최근 6개월 전후의 급여명세서만 보여준다.**************************/

	public YearMonth presentMonth(String date) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		YearMonth presentMonth = YearMonth.parse(date, dateFormat);	
		return presentMonth;
	}

	public YearMonth beforeMonth(String date) {
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		YearMonth inputMonth = YearMonth.parse(date, dateFormat);
		YearMonth beforeMonth = inputMonth.minusMonths(1);	
		System.out.println(beforeMonth);
		return beforeMonth;

	}
	
	public YearMonth afterMonth(String date) {
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		YearMonth inputMonth = YearMonth.parse(date, dateFormat);
		YearMonth afterMonth = inputMonth.plusMonths(1);
		System.out.println(afterMonth);
		return afterMonth;						
	}
	
	public String getValidMonth(YearMonth date) {
		
		if(isBetween(YearMonth.now().minusMonths(6), YearMonth.now(), date)) {
			
			return date.format(DateTimeFormatter.ofPattern("yyyy/MM"));			
		}else {
			return null;
		}

	}
	
	public boolean isBetween(YearMonth startDate,YearMonth endDate,YearMonth date) {
		
		if(date.compareTo(startDate)>= 0 && date.compareTo(endDate)<= 0) {
			return true;
 		}
			return false;
	}
	
	/********************************************************************************************/


}