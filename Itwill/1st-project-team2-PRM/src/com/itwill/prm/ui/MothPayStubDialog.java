package com.itwill.prm.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.prm.service.ExcelService;
import com.itwill.prm.service.MemberService;
import com.itwill.prm.service.PayStubsService;
import com.itwill.prm.vo.Departments;
import com.itwill.prm.vo.Members;
import com.itwill.prm.vo.PaystubsResultValue;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MothPayStubDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel m_member_no;
	private JPanel headerMenu;
	private JLabel m_member_name;
	private JLabel m_member_dept;
	private JLabel m_member_lev;
	private JTable m_table;
	private Members members;
	private MainJFrame mainJframe;
	private String workmonth;
	private PayStubsService paystubsService;
	private MemberService memberService;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton excelBTN;
	PaystubsResultValue paystubs;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public MothPayStubDialog(MainJFrame mainJFrame,String workmonth) {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		this.mainJframe=mainJFrame;
		this.members=mainJFrame.member;
		this.workmonth=workmonth;
		
		paystubsService = new PayStubsService();
		memberService = new MemberService();
		setBounds(100, 100, 624, 468);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			headerMenu = new JPanel();
			headerMenu.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(headerMenu, BorderLayout.NORTH);
			{
				m_member_no = new JLabel("사원번호");
				headerMenu.add(m_member_no);
			}
			{
				m_member_name = new JLabel("성명");
				headerMenu.add(m_member_name);
			}
			{
				m_member_dept = new JLabel("부서");
				headerMenu.add(m_member_dept);
			}
			{
				m_member_lev = new JLabel("직책");
				headerMenu.add(m_member_lev);
			}
		}
		{
			JScrollPane m_scorll_pane = new JScrollPane();
			contentPanel.add(m_scorll_pane, BorderLayout.CENTER);
			{
				m_table = new JTable();
				m_table.setBackground(Color.WHITE);
				m_table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
					},
					new String[] {
						"지급항목", "지급액", "공제항목", "공제액"
					}
				));
				m_table.getColumnModel().getColumn(1).setPreferredWidth(95);
				m_table.getColumnModel().getColumn(3).setPreferredWidth(95);
				m_scorll_pane.setViewportView(m_table);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.LIGHT_GRAY);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("확인");
				cancelButton.setBackground(new Color(224, 255, 255));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				{
					//엑셀 파일로 출력
					excelBTN = new JButton("엑셀출력");
					excelBTN.setBackground(new Color(224, 255, 255));
					excelBTN.setForeground(Color.BLACK);
					excelBTN.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								ExcelService excel = new ExcelService(paystubs);
								JOptionPane.showMessageDialog(null, "엑셀 파일 생성에 성공하였습니다.");	
							} catch (Exception e1) {
								JOptionPane.showMessageDialog(null, "엑셀 파일 생성에 실패했습니다.");		
							}
						}
					});
					buttonPane.add(excelBTN);
				}
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			panel = new JPanel();
			panel.setBackground(Color.DARK_GRAY);
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new BorderLayout(5, 8));
			{
				lblNewLabel = new JLabel(" | 급여명세서");
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setFont(new Font("궁서", Font.BOLD, 27));
				panel.add(lblNewLabel, BorderLayout.NORTH);
			}
		}
		try {
			showPaystub(members.getMember_no(), workmonth);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showPaystub(int member_no,String workMonth) throws Exception {
		paystubs = paystubsService.selectLikeMM(workMonth,member_no);
		Members findMember = memberService.findMemberByNo(member_no);
		Departments finddept = memberService.findDeptByMemberNo(member_no);
		String monthOnMonth = paystubsService.monthOnMonthCal(paystubs.getMember_no(),paystubs.getIssuance_date());		
		int amountPay = paystubsService.amountPay(paystubs.getMember_no(), paystubs.getIssuance_date());

		m_member_no.setText("사원번호:"+findMember.getMember_no());
		m_member_name.setText("이름:"+findMember.getMember_name());
		m_member_dept.setText("부서:"+finddept.getDept_name());
		m_member_lev.setText("직책:"+findMember.getLev());
		Vector paystubsline1 = new Vector();
		Vector paystubsline2 = new Vector();
		Vector paystubsline3 = new Vector();
		Vector paystubsline4 = new Vector();
		Vector paystubsline5 = new Vector();
		Vector paystubsline6 = new Vector();
		Vector paystubsline7 = new Vector();
		Vector paystubsline8 = new Vector();
		Vector paystubsline9 = new Vector();
		Vector paystubsline10 = new Vector();
		Vector paystubsline11 = new Vector();
		Vector paystubsline12 = new Vector();
		Vector paystubsListVector = new Vector();
		paystubsline1.add("기본금");
		paystubsline1.add(paystubs.getNomalpay());
		paystubsline1.add("소득세");
		paystubsline1.add(paystubs.getIncome_tax());
		paystubsListVector.add(paystubsline1);
		paystubsline2.add("직책수당");
		paystubsline2.add(paystubs.getLevpay());
		paystubsline2.add("주민세");
		paystubsline2.add(paystubs.getResidents_tax());
		paystubsListVector.add(paystubsline2);
		paystubsline3.add("연장수당");
		paystubsline3.add(paystubs.getOvertimework());
		paystubsListVector.add(paystubsline3);
		paystubsline4.add("휴일수당");
		paystubsline4.add(paystubs.getHolidaywork());
		paystubsListVector.add(paystubsline4);
		paystubsline5.add("상여금");
		paystubsline5.add(paystubs.getPay_bouns());
		paystubsListVector.add(paystubsline5);
		paystubsline6.add("식대");
		paystubsline6.add(paystubs.getFood_exp());
		paystubsListVector.add(paystubsline6);
		paystubsline7.add("교통비");
		paystubsline7.add(paystubs.getTraffic_exp());
		paystubsListVector.add(paystubsline7);
		paystubsline8.add("복지후생");
		paystubsline8.add(paystubs.getWelfare());
		paystubsListVector.add(paystubsline8);
		paystubsListVector.add(paystubsline9);
		paystubsline10.add("총지급액");
		paystubsline10.add(amountPay);
		paystubsline10.add("증감률");
		paystubsline10.add(monthOnMonth+"%");
		paystubsListVector.add(paystubsline10);
//		paystubsline11.add("전월대비증감률");
//		paystubsline11.add(indecreas+"%");
//		paystubsListVector.add(paystubsline11);
		Vector calumname = new Vector();
		calumname.add("지급항목");
		calumname.add("지급액");
		calumname.add("공제항목");
		calumname.add("공제액");
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(paystubsListVector,calumname);
		m_table.setModel(defaultTableModel);
	}
}
