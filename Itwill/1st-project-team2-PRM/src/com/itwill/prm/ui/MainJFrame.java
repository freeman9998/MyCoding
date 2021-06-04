package com.itwill.prm.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.prm.vo.Members;

import java.awt.CardLayout;

public class MainJFrame extends JFrame {

	private JPanel contentPane;
	private JPanel MainCardPanel;
	private JButton loginbtn;
	Members member;
	private MainPagePanel mainPagePanel;
	private PayStubsPanel payStubsPanel;
	private MonthPayStubList monthPayStbList;
	private MemberUpdateDialog memberUpdateDialog;
	private MothPayStubDialog monthPayStubDialog;
	public static final int PAYSTUB=0;
	public static final int PAYSTUBM=1;
	public static final int LOGOUT=2;
	public static final int MEMBERUPDATE=3;
	public static final int MAINPAGE=4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setTitle("급여관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		MainCardPanel = new JPanel();
		contentPane.add(MainCardPanel, BorderLayout.CENTER);
		MainCardPanel.setLayout(new CardLayout(0, 0));
		
		LoginPagePanel loginPagePanel = new LoginPagePanel();
		MainCardPanel.add(loginPagePanel, "LoginPage");
		
		mainPagePanel = new MainPagePanel();
		MainCardPanel.add(mainPagePanel, "MainPage");
		
		loginPagePanel.setMainJFrame(MainJFrame.this);
		
	}
	
		
	public void loginProcess(Members loginmember) {
		this.member=loginmember;
		mainPagePanel.setMainJFrame(MainJFrame.this);
		CardLayout c1 = (CardLayout)MainCardPanel.getLayout();
		c1.show(MainCardPanel, "MainPage");
	}
	
	public void selectPage(int no) {
		if(no==0) {
			payStubsPanel = new PayStubsPanel(MainJFrame.this);
			MainCardPanel.add(payStubsPanel, "PayStubsPanel");
			CardLayout c1 = (CardLayout)MainCardPanel.getLayout();
			c1.show(MainCardPanel, "PayStubsPanel");
		}else if(no==1) {
			monthPayStbList = new MonthPayStubList(MainJFrame.this);
			MainCardPanel.add(monthPayStbList, "MonthPayStubList");
			CardLayout c1 = (CardLayout)MainCardPanel.getLayout();
			c1.show(MainCardPanel, "MonthPayStubList");
		}else if(no==2) {
			member=null;
			CardLayout c1 = (CardLayout)MainCardPanel.getLayout();
			c1.show(MainCardPanel, "LoginPage");
		}else if(no==3) {
			memberUpdateDialog=new MemberUpdateDialog(MainJFrame.this);
			memberUpdateDialog.setModal(true);
			memberUpdateDialog.setVisible(true);
		}else if(no==4) {
			CardLayout c1 = (CardLayout)MainCardPanel.getLayout();
			c1.show(MainCardPanel, "MainPage");
		}
	}
	
	public void selectPayStubs(String workmonth) {
		monthPayStubDialog=new MothPayStubDialog(MainJFrame.this, workmonth);
		monthPayStubDialog.setModal(true);
		monthPayStubDialog.setVisible(true);
	}
}
