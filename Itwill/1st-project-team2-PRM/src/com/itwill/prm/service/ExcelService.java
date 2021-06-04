package com.itwill.prm.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.itwill.prm.dao.DepartmentsDao;
import com.itwill.prm.dao.MembersDao;
import com.itwill.prm.vo.Departments;
import com.itwill.prm.vo.Members;
import com.itwill.prm.vo.PaystubsResultValue;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;




public class ExcelService {
	
	public ExcelService(PaystubsResultValue paystubsResultValue) throws Exception {
		MembersDao memberdao = new MembersDao();
		DepartmentsDao deptdao = new DepartmentsDao();
		PayStubsService payservice = new PayStubsService();
		
		String monthOnMonth = payservice.monthOnMonthCal(paystubsResultValue.getMember_no(),paystubsResultValue.getIssuance_date());
		int amountPay = payservice.amountPay(paystubsResultValue.getMember_no(), paystubsResultValue.getIssuance_date());
		
		try {
			Members members = memberdao.selectByNo(paystubsResultValue.getMember_no());
			Departments dept = deptdao.selectDeptMemberNo(paystubsResultValue.getMember_no());
            // 엑셀파일 객체 생성
            WritableWorkbook workbook = null;
 
            // 시트 객체 생성
            WritableSheet sheet = null;
 
            // 셀 객체 생성
            Label label = null;
 
            // 저장할 파일 객체 생성
            String desktocp=System.getProperty ( "user.home" );
            String payMonth=paystubsResultValue.getIssuance_date().substring(5, 7);
            File file = new File(desktocp+"\\Desktop\\"+members.getMember_name()+"님의 "+payMonth+"월 급여명세서.xls");

 
            // 테스트 데이터 (S)
            // 반드시 String 타입의 값으로 보내야함
            HashMap hm_0 = new HashMap();
            hm_0.put("1", "지급항목");
            hm_0.put("2", "기본급여");
            hm_0.put("3", "초과수당");
            hm_0.put("4", "휴일수당");
            hm_0.put("5", "직책수당");
            hm_0.put("6", "상여금");
            hm_0.put("7", "식대");
            hm_0.put("8", "교통비");
            hm_0.put("9", "복지후생");
            hm_0.put("10", " ");
            hm_0.put("11", "총지급액");
            hm_0.put("12", " ");
            hm_0.put("13", " ");
 
            HashMap hm_1 = new HashMap();
            hm_1.put("1", "지급액");
            hm_1.put("2", String.valueOf(paystubsResultValue.getNomalpay()));
            hm_1.put("3", String.valueOf(paystubsResultValue.getOvertimework()));
            hm_1.put("4", String.valueOf(paystubsResultValue.getHolidaywork()));
            hm_1.put("5", String.valueOf(paystubsResultValue.getLevpay()));
            hm_1.put("6", String.valueOf(paystubsResultValue.getPay_bouns()));
            hm_1.put("7", String.valueOf(paystubsResultValue.getFood_exp()));
            hm_1.put("8", String.valueOf(paystubsResultValue.getTraffic_exp()));
            hm_1.put("9", String.valueOf(paystubsResultValue.getWelfare()));
            hm_1.put("10", " ");
            hm_1.put("11", String.valueOf(amountPay));
            hm_1.put("12"," ");
            hm_1.put("13"," ");
            
            HashMap hm_2 = new HashMap();
            hm_2.put("1", "공제항목");
            hm_2.put("2", "소득세");
            hm_2.put("3", "주민세");
            hm_2.put("4", " ");
            hm_2.put("5", " ");
            hm_2.put("6", " ");
            hm_2.put("7", " ");
            hm_2.put("8", " ");
            hm_2.put("9", " ");
            hm_2.put("10", " ");
            hm_2.put("11", "증감률");
            hm_2.put("12", " ");
            hm_2.put("13", " ");
            
            HashMap hm_3 = new HashMap();
            hm_3.put("1","공제액");
            hm_3.put("2", String.valueOf(paystubsResultValue.getIncome_tax()));
            hm_3.put("3", String.valueOf(paystubsResultValue.getResidents_tax()));
            hm_3.put("4", " ");
            hm_3.put("5", " ");
            hm_3.put("6", " ");
            hm_3.put("7", " ");
            hm_3.put("8", " ");
            hm_3.put("9", " ");
            hm_3.put("10", " ");
            hm_3.put("11", monthOnMonth+"%");
            hm_3.put("12", " ");
            hm_3.put("13", " ");
            
            List list = new ArrayList();
            list.add(hm_0);
            list.add(hm_1);
            list.add(hm_2);
            list.add(hm_3);          
            // 테스트 데이터 (E)
 
            // 파일 생성
            workbook = Workbook.createWorkbook(file);
 
            // 시트 생성
            workbook.createSheet("sheet1", 0);
            sheet = workbook.getSheet(0);
 
            // 셀에 쓰기
            label = new Label(5, 0, "사원번호");
            sheet.addCell(label);
            label = new Label(5, 1, String.valueOf(members.getMember_no()));
            sheet.addCell(label);
 
            label = new Label(6, 0, "성명");
            sheet.addCell(label);
            label = new Label(6, 1, members.getMember_name());
            sheet.addCell(label);
            
            label = new Label(7, 0, "부서");
            sheet.addCell(label);
            label = new Label(7, 1, dept.getDept_name());
            sheet.addCell(label);
            
            label = new Label(8, 0, "직급");
            sheet.addCell(label);
            label = new Label(8, 1, members.getLev());
            sheet.addCell(label);
 
            // 데이터 삽입
            for (int i = 0; i < list.size(); i++) {
                HashMap rs = (HashMap) list.get(i);
 
                label = new Label(5+i, 4, (String) rs.get("1"));
                sheet.addCell(label);
 
                label = new Label(5+i, 5, (String) rs.get("2"));
                sheet.addCell(label);	 
                
                label = new Label(5+i, 6, (String) rs.get("3"));
                sheet.addCell(label);
                
                label = new Label(5+i, 7, (String) rs.get("4"));
                sheet.addCell(label);
                
                label = new Label(5+i, 8, (String) rs.get("5"));
                sheet.addCell(label);
                
                label = new Label(5+i, 9, (String) rs.get("6"));
                sheet.addCell(label);
                
                label = new Label(5+i, 10, (String) rs.get("7"));
                sheet.addCell(label);
                
                label = new Label(5+i, 11, (String) rs.get("8"));
                sheet.addCell(label);
                
                label = new Label(5+i, 12, (String) rs.get("9"));
                sheet.addCell(label);
                
                label = new Label(5+i, 13, (String) rs.get("10"));
                sheet.addCell(label);
                
                label = new Label(5+i, 14, (String) rs.get("11"));
                sheet.addCell(label);
                
                label = new Label(5+i, 15, (String) rs.get("12"));
                sheet.addCell(label);
                
                label = new Label(5+i, 16, (String) rs.get("13"));
                sheet.addCell(label);
            }
 
            workbook.write();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
