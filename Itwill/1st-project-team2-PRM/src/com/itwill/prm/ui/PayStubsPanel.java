package com.itwill.prm.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.Calendar;
import java.util.Objects;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.prm.service.ExcelService;
import com.itwill.prm.service.MemberUpdateService;
import com.itwill.prm.service.PayStubsService;
import com.itwill.prm.vo.Members;
import com.itwill.prm.vo.PaystubsResultValue;

import oracle.sql.DATE;

import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;

public class PayStubsPanel extends JPanel {
	private JTable paystubsListTable;
	private JTable memberListTable;
	private JTable memberTable;
	private MainPagePanel mainPagePanel;
	private Members pmember;
	private MainJFrame mainJFrame;
	PayStubsService paystubsService;
	MemberUpdateService memberUpdateService;
	private JLabel monthLabel;
	private JButton beforeMonthBtn;
	private JButton afterMonthBtn;
	private JLabel issuanceDateL;
	private PaystubsResultValue paystubs;	
	private final JPanel panel = new JPanel();
	private JTextField txtPayroll;
	
	/**
	 * Create the panel.
	 */
	public PayStubsPanel(MainJFrame mainFrame) {
		setBackground(Color.LIGHT_GRAY);
		setMainJFrame(mainFrame);
		setLayout(null);
		addComponentListener(new ComponentAdapter() {
			@Override
			/*
			 * 메인화면에서 명세서조회 버튼을 누르면
			 * 현재달의 급여명세서를 조회한다.
			 * 이 달에 지급목록과 공제목록을 상세하게 볼수 있으며,
			 * 이 전달과 비교한 증감률을 볼수있다.
			 */
			public void componentShown(ComponentEvent e) {
				memberList();
				paystubsList();
			}
		});
			
		monthLabel = new JLabel("");
		monthLabel.setBounds(272, 57, 48, 16);
		add(monthLabel);
		
		beforeMonthBtn = new JButton("이전달");
		beforeMonthBtn.setBackground(new Color(224, 255, 255));
		
		beforeMonthBtn.addActionListener(new ActionListener() {		
			@Override
			/*
			 * 이전달 버튼을 누르면 이전달의 급여명세서를 상세히 확인가능하다.
			 * 단, 최근 6개월 내역만 열람이 가능하다.
			 * 그 이상 넘어가면  "최근 6개월 내 내역까지 조회가능합니다." 라는 메세지가 뜬다.
			 */
			public void actionPerformed(ActionEvent e) {
				afterMonthBtn.setEnabled(true);
				paystudsBeforeMM();
			}
		});
		beforeMonthBtn.setBounds(63, 51, 117, 29);
		add(beforeMonthBtn);
		
		afterMonthBtn = new JButton("다음달");
		afterMonthBtn.setBackground(new Color(224, 255, 255));
		afterMonthBtn.setEnabled(false);
		
		afterMonthBtn.addActionListener(new ActionListener() {
			/*
			 * 다음달 버튼을 누르면 다음달의 급여명세서를 상세히 확인가능하다.
			 * 단, 최근 6개월 내역만 열람이 가능하다.
			 * 그 이상 넘어가면  "최근 6개월 내 내역까지 조회가능합니다." 라는 메세지가 뜬다.
			 * 그 달의 급여명세서가 없는 경우는 "해당하는 급여명세서가 없습니다." 라는 메세지가 뜬다.
			 */
			public void actionPerformed(ActionEvent e) {
				paystudsAfterMM();									
			}
		});
		afterMonthBtn.setBounds(412, 51, 117, 29);
		add(afterMonthBtn);
		JButton excelPrintBtn = new JButton("엑셀로 출력");
		excelPrintBtn.setBackground(new Color(224, 255, 255));
		excelPrintBtn.addActionListener(new ActionListener() {
			/*
			 * 엑셀로 출력버튼을 누르면 급여명세테이블이 엑셀파일로 넘어간다.
			 */
			public void actionPerformed(ActionEvent e) {
				try {
					ExcelService excel = new ExcelService(paystubs);
					JOptionPane.showMessageDialog(null, "엑셀 파일 생성에 성공했습니다.");	
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "엑셀 파일 생성에 실패했습니다.");				
				}
			}
		});
		excelPrintBtn.setBounds(298, 415, 117, 29);
		add(excelPrintBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setBackground(new Color(224, 255, 255));
		cancleBtn.addActionListener(new ActionListener() {
			@Override
			/*
			 * 취소버튼을 누르면 메인화면으로 이동한다.
			 */
			public void actionPerformed(ActionEvent e) {
				mainJFrame.selectPage(MainJFrame.MAINPAGE);
			}
		});
		cancleBtn.setBounds(412, 415, 117, 29);
		add(cancleBtn);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(63, 91, 466, 64);
		add(scrollPane_1);
		
		memberListTable = new JTable();
		memberListTable.setFont(new Font("D2Coding", Font.PLAIN, 13));
		memberListTable.setShowVerticalLines(false);
		memberListTable.setShowHorizontalLines(false);
		memberListTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},					
				},
				new String[] {
					"사원번호","성명","부서","직책"
				}
			));

		scrollPane_1.setViewportView(memberListTable);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(63, 155, 466, 255);
		add(scrollPane_2);
		
		paystubsListTable = new JTable();
		paystubsListTable.setFont(new Font("D2Coding", Font.PLAIN, 13));
		paystubsListTable.setShowVerticalLines(false);
		paystubsListTable.setShowHorizontalLines(false);
		paystubsListTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					
				},
				new String[] {
					"지급항목","지급액","공제항목","공제액"
				}
			));
		scrollPane_2.setViewportView(paystubsListTable);
		
		issuanceDateL = new JLabel("");
		issuanceDateL.setBounds(65, 416, 154, 24);
		add(issuanceDateL);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 620, 43);
		add(panel);
		panel.setLayout(null);
		
		txtPayroll = new JTextField();
		txtPayroll.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		txtPayroll.setForeground(Color.WHITE);
		txtPayroll.setBackground(Color.DARK_GRAY);
		txtPayroll.setText(" | 급여명세서");
		txtPayroll.setBounds(0, 0, 156, 43);
		panel.add(txtPayroll);
		txtPayroll.setColumns(10);
		
		
		paystubsService = new PayStubsService();
		memberUpdateService = new MemberUpdateService();
				
	}
	
	/************사원정보[JTable]****************/
	private void memberList() {
		try {
			Members member = memberUpdateService.selectByNo(pmember.getMember_no());
			Vector memberListVector = new Vector();
			Vector memberVector = new Vector();
			memberVector.add(member.getMember_no());
			memberVector.add(member.getMember_name());
			memberVector.add(member.getJob());
			memberVector.add(member.getLev());
			memberListVector.add(memberVector);
			
			Vector columNames = new Vector();
			columNames.add("사원번호");
			columNames.add("성  명");
			columNames.add("부  서");
			columNames.add("직  책");
			
			DefaultTableModel defaultTableModel = 
					new DefaultTableModel(memberListVector,columNames);
			memberListTable.setModel(defaultTableModel);
			
		} catch (Exception e){
			
		}
	}
	
	
	/***********현재달 급여명세서[JTable]****************/
	private void paystubsList() {
		try {
			Calendar cal = Calendar.getInstance();

			paystubs = paystubsService.selectByNoMM(pmember.getMember_no(), cal.get(Calendar.MONTH));					
			
			String month = paystubs.getIssuance_date().substring(5, 7);
			monthLabel.setText(month+"월");
				
			String issuanceDate = paystubs.getIssuance_date().substring(0, 10);
			issuanceDateL.setText(issuanceDate);
			
			Vector paystubsListVector = payVector(paystubs);
			Vector columNames = columVector();
			
			DefaultTableModel defaultTableModel = 
					new DefaultTableModel(paystubsListVector,columNames);
			paystubsListTable.setModel(defaultTableModel);
					
		} catch (Exception e) {
	
			mainJFrame.selectPage(MainJFrame.MAINPAGE);
			JOptionPane.showMessageDialog(null, "명세서가 존재하지 않습니다.");
		}
	
		
	}
	
	
	/***********이전달 급여명세서[JTable]****************/
	private void paystudsBeforeMM() {
		try {
			/*
			if(paystubs==null) {
				Calendar cal = Calendar.getInstance();
				paystubs = paystubsService.selectByNoMM(pmember.getMember_no(), cal.get(Calendar.MONTH));
			}
			*/
			
			YearMonth date = paystubsService.beforeMonth(paystubs.getIssuance_date());		
			
			String vaildaDate = paystubsService.getValidMonth(date);
			if(vaildaDate==null) {
				JOptionPane.showMessageDialog(null, "최근 6개월 내 내역까지 조회가능합니다.");
				return;
			}
			paystubs = paystubsService.selectLikeMM(vaildaDate, pmember.getMember_no());			

			
			if(paystubs!=null) {

				String month = paystubs.getIssuance_date().substring(5,7);
				monthLabel.setText(month+"월");
				String issuanceDate = paystubs.getIssuance_date().substring(0, 10);
				issuanceDateL.setText(issuanceDate);
				
				memberList();
				Vector paystubsListVector = payVector(paystubs);
				Vector columNames = columVector();
			
				DefaultTableModel defaultTableModel = 
						new DefaultTableModel(paystubsListVector,columNames);
				paystubsListTable.setModel(defaultTableModel);
			
			} else {
				
				JOptionPane.showMessageDialog(null, "해당하는 급여명세서가 없습니다.");
			}
			
		} catch (Exception e) {
			
		}
	}

	/***********다음달 급여명세서[JTable]****************/
	private void paystudsAfterMM() {
		try {
			
			YearMonth date = paystubsService.afterMonth(paystubs.getIssuance_date());	
			String vaildaDate = paystubsService.getValidMonth(date);
			
			if(vaildaDate==null) {
				JOptionPane.showMessageDialog(null, "최근 6개월 내 내역까지만 조회가능합니다.");
				return;
			}
			paystubs = paystubsService.selectLikeMM(vaildaDate, pmember.getMember_no());			
			
			
			if(paystubs!=null) {
 				String month = paystubs.getIssuance_date().substring(5,7);			
				monthLabel.setText(month+"월");
				String issuanceDate = paystubs.getIssuance_date().substring(0, 10);
				issuanceDateL.setText(issuanceDate);
				

				memberList();
				Vector paystubsListVector = payVector(paystubs);
				Vector columNames = columVector();
			
				DefaultTableModel defaultTableModel = 
						new DefaultTableModel(paystubsListVector,columNames);
				paystubsListTable.setModel(defaultTableModel);
			
			} else {				
				JOptionPane.showMessageDialog(null, "해당하는 급여명세서가 없습니다.");
			}
			
		} catch (Exception e) {
			
		}
	}
	
	private Vector payVector(PaystubsResultValue paystubs) throws Exception {
		String monthOnMonth = paystubsService.monthOnMonthCal(paystubs.getMember_no(),paystubs.getIssuance_date());		
		int amountPay = paystubsService.amountPay(paystubs.getMember_no(), paystubs.getIssuance_date());
		
		Vector paystubsListVector = new Vector();			
		Vector paystubsLine1 = new Vector();
		Vector paystubsLine2 = new Vector();
		Vector paystubsLine3 = new Vector();
		Vector paystubsLine4 = new Vector();
		Vector paystubsLine5 = new Vector();
		Vector paystubsLine6 = new Vector();
		Vector paystubsLine7 = new Vector();
		Vector paystubsLine8 = new Vector();
		Vector paystubsLine9 = new Vector();
		Vector paystubsLine10 = new Vector();
		Vector paystubsLine11 = new Vector();
		Vector paystubsLine12 = new Vector();
		
		paystubsLine1.add("기본급여");
		paystubsLine1.add(paystubs.getNomalpay());
		paystubsLine1.add("소득세");
		paystubsLine1.add(paystubs.getIncome_tax());
		paystubsListVector.add(paystubsLine1);
		
		paystubsLine2.add("초과수당");
		paystubsLine2.add(paystubs.getOvertimework());
		paystubsLine2.add("주민세");
		paystubsLine2.add(paystubs.getResidents_tax());
		paystubsListVector.add(paystubsLine2);
		
		paystubsLine3.add("휴일수당");
		paystubsLine3.add(paystubs.getHolidaywork());
		paystubsListVector.add(paystubsLine3);
		
		paystubsLine4.add("직책수당");
		paystubsLine4.add(paystubs.getLevpay());
		paystubsListVector.add(paystubsLine4);
		
		paystubsLine5.add("상여금");
		paystubsLine5.add(paystubs.getPay_bouns());
		paystubsListVector.add(paystubsLine5);
		
		paystubsLine6.add("식대");
		paystubsLine6.add(paystubs.getFood_exp());
		paystubsListVector.add(paystubsLine6);
		
		paystubsLine7.add("교통비");
		paystubsLine7.add(paystubs.getTraffic_exp());
		paystubsListVector.add(paystubsLine7);
		
		paystubsLine8.add("복지후생");
		paystubsLine8.add(paystubs.getWelfare());
		paystubsListVector.add(paystubsLine8);
				
		paystubsListVector.add(paystubsLine9);
		
		paystubsLine10.add("총지급액");
		paystubsLine10.add(amountPay);
		paystubsLine10.add("증감률");
		paystubsLine10.add(monthOnMonth+"%");
		paystubsListVector.add(paystubsLine10);
		
		
		paystubsListVector.add(paystubsLine11);
		paystubsListVector.add(paystubsLine12);
		
		
		return paystubsListVector;				
	}
	
	private Vector columVector() {
		Vector columNames = new Vector();
		columNames.add("지급항목");
		columNames.add("지급액");
		columNames.add("공제항목");
		columNames.add("공제액");
		return columNames;
	}
	
	/************메인****************/
	public void setMainJFrame(MainJFrame mainJFrame) {
		pmember=mainJFrame.member;
		this.mainJFrame=mainJFrame;
		
	}
}
