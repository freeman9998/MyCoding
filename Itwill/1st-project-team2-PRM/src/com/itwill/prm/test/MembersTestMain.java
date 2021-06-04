package com.itwill.prm.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.itwill.prm.service.MemberUpdateService;
import com.itwill.prm.service.PayStubsService;
import com.itwill.prm.vo.PaystubsResultValue;

public class MembersTestMain {

	public static void main(String[] args) throws Exception {
//		System.out.println("Hi");
//		Calendar cal = Calendar.getInstance();
//		int month=cal.get(Calendar.MONTH);
//		System.out.println(month);
//		
//		
//		MemberUpdateService service = new MemberUpdateService();
//		System.out.println(service.selectByNo(110506));
		 PayStubsService paystubsService =new PayStubsService();
		 PaystubsResultValue paystubs = paystubsService.selectByNoMM(101213, 1);
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
         Date date = null;
         Date date1= null;
         String data = dateFormat.format(paystubs.getIssuance_date());
         System.out.println(data+"나는 스트링");
         date = dateFormat.parse("2021/02/04");
         Calendar cal = Calendar.getInstance();
         cal.setTime(date);
         cal.add(Calendar.MONTH, 6);
         cal.add(Calendar.DATE, 4);
         System.out.println(date);
         System.out.println(cal.getTime());     
         String strDate = dateFormat.format(cal.getTime());
         date1=cal.getTime();
         if(date.compareTo(date1)>0) {
        	 System.out.println("미래");
        	 System.out.println("현재달보다 과거에 있어서 너는 나와도 됨(인자보다 미래니깐)");
         }else if(date.compareTo(date1)<0) {
        	 System.out.println("과거");
        	 System.out.println("현재달보다 미래에 있어서 너는 안돼(인자보다 과거니깐)");
         }else if(date.compareTo(date)==0) {
        	 System.out.println("동일시간");
        	 System.out.println("6개월까지만 확인이 가능합니다.");
         }
 
         System.out.println(strDate);

		
	}
	
	 public static long diffOfDate(String begin, String end) throws Exception
	  {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	 

	    Date beginDate = formatter.parse(begin);
	    Date endDate = formatter.parse(end);

	 

	    long diff = endDate.getTime() - beginDate.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);

	 

	    return diffDays;
	  }

}