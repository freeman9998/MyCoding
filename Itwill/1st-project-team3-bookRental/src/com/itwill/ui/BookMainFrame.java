package com.itwill.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.service.BookMemberService;
import com.itwill.vo.BookMember;
import java.awt.Toolkit;


public class BookMainFrame extends JFrame {

	private JPanel contentPane;
	BookMember loginMember;
	private JPanel baseCardLayoutPanel;

	/************* Service 객체 생성 *************/
	BookMemberService bookMemberService;
	/*****************************************/

	private JPanel loginPanel;
	private JPanel joinPanel;  
	private JPanel rentalPanel;
	private JPanel updatePanel;
	private JPanel borrowPanel;
	private BookMemberJoinPanel bookMemberJoinPanel;
	private BookManagePanel bookRentalMainPanel;
	private BookMemberUpdatePanel bookMemberUpdatePanel;
	private BookReturnPanel bookReturnPanel;
	private JPanel deletePanel;
	private BookMemberDeletePanel bookMemberDeletePanel;
	private JPanel rentManege;
	private BookRentManegePanel bookRentManegePanel;
	private JPanel reservPanel;
	private BookReservPanel bookReservPnael;
	private JPanel rentPanel;
	private BookRentPanel bookRentPanel;
	private BookLoginPanel bookLoginPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookMainFrame frame = new BookMainFrame();
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
	public BookMainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BookMainFrame.class.getResource("/com/itwill/ui/책아이콘.png")));
		setTitle("BOOK RENTAL PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		baseCardLayoutPanel = new JPanel();
		contentPane.add(baseCardLayoutPanel, BorderLayout.CENTER);
		baseCardLayoutPanel.setLayout(new CardLayout(0, 0));

		loginPanel = new JPanel();
		baseCardLayoutPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(new BorderLayout(0, 0));
		
		bookLoginPanel = new BookLoginPanel();
		loginPanel.add(bookLoginPanel, BorderLayout.CENTER);
		// 회원가입 패널
		joinPanel = new JPanel();
		joinPanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				bookMemberJoinPanel.setEmpty();
			}
		});
		baseCardLayoutPanel.add(joinPanel, "joinPanel");
		joinPanel.setLayout(new BorderLayout(0, 0));

		bookMemberJoinPanel = new BookMemberJoinPanel();
		joinPanel.add(bookMemberJoinPanel, BorderLayout.CENTER);
		// 대여,반납 패널
		rentalPanel = new JPanel();
		rentalPanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				bookRentalMainPanel.dataLoad();
			}
		});
		baseCardLayoutPanel.add(rentalPanel, "rentalPanel");
		rentalPanel.setLayout(new BorderLayout(0, 0));

		bookRentalMainPanel = new BookManagePanel();
		rentalPanel.add(bookRentalMainPanel);
		bookRentalMainPanel.setLayout(null);
		// 업데이트 패널
		updatePanel = new JPanel();
		updatePanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				bookMemberUpdatePanel.setEnable();
			}
		});
		baseCardLayoutPanel.add(updatePanel, "updatePanel");
		updatePanel.setLayout(new BorderLayout(0, 0));
		bookMemberUpdatePanel = new BookMemberUpdatePanel();
		updatePanel.add(bookMemberUpdatePanel);
		bookMemberUpdatePanel.setEnable();
		// 반납메인 패널
		borrowPanel = new JPanel();
		borrowPanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				bookReturnPanel.dataLoad();
			}
		});
		baseCardLayoutPanel.add(borrowPanel, "borrowPanel");
		borrowPanel.setLayout(new BorderLayout(0, 0));
		bookReturnPanel = new BookReturnPanel();
		borrowPanel.add(bookReturnPanel);
		bookReturnPanel.setLayout(new BorderLayout(0, 0));
		
		deletePanel = new JPanel();
		deletePanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				bookMemberDeletePanel.setEmpty();
			}
		});
		baseCardLayoutPanel.add(deletePanel, "deletePanel");
		deletePanel.setLayout(new BorderLayout(0, 0));
		
		bookMemberDeletePanel = new BookMemberDeletePanel();
		deletePanel.add(bookMemberDeletePanel, BorderLayout.CENTER);

		
		rentManege = new JPanel();
		baseCardLayoutPanel.add(rentManege, "rentManege");
		rentManege.setLayout(new BorderLayout(0, 0));
		
		bookRentManegePanel = new BookRentManegePanel();
		rentManege.add(bookRentManegePanel);
		
		reservPanel = new JPanel();
		baseCardLayoutPanel.add(reservPanel, "reservPanel");
		reservPanel.setLayout(new BorderLayout(0, 0));
		
		bookReservPnael = new BookReservPanel();
		reservPanel.add(bookReservPnael, BorderLayout.CENTER);
		
		rentPanel = new JPanel();
		baseCardLayoutPanel.add(rentPanel, "rentPanel");
		rentPanel.setLayout(new BorderLayout(0, 0));
		
		bookRentPanel = new BookRentPanel();
		rentPanel.add(bookRentPanel);
		bookMemberJoinPanel.setBookMainFrame(this);
		bookRentalMainPanel.setBookMainFrame(this);
		bookMemberUpdatePanel.setBookMainFrame(this);
		bookReturnPanel.setBookMainFrame(this);
		bookMemberDeletePanel.setBookMainFrame(this);
		bookRentManegePanel.setBookMainFrame(this);
		bookRentPanel.setBookMainFrame(this);
		bookReservPnael.setBookMainFrame(this);
		bookLoginPanel.setBookMainFrame(this);
	}

	// 로그인
	public void loginProcess(BookMember loginMember) {
		this.loginMember = loginMember;
		setTitle(loginMember.getMember_name() + " 님 로그인");
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "rentalPanel");
	}

	// 로그아웃
	public void logoutProcess() {
		this.loginMember = null;
		setTitle("");
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		cl.show(baseCardLayoutPanel, "loginPanel");
	}

	// 회원가입
	public void joinProcess() {
		this.loginMember = null;
		setTitle("");
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		cl.show(baseCardLayoutPanel, "joinPanel");
	}

	//로그인
	public void mainProcess() {
		this.loginMember = null;
		setTitle("");
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		cl.show(baseCardLayoutPanel, "loginPanel");
	}

	// 회원가입닫기
	public void joinclose() {
		this.loginMember = null;
		setTitle("");
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		cl.show(baseCardLayoutPanel, "loginPanel");
	}

	// 회원수정닫기
	public void updateclose() {
		setTitle(loginMember.getMember_name() + " 님 로그인");
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "rentalPanel");
	}

	// 업데이트
	public void updateProcess() {
		setTitle(loginMember.getMember_name() + " 님 로그인");
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "updatePanel");
	}

	// 회원반납
	public void borrowReturnProcess() {
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "borrowPanel");
	}

	// 회원정보수정 
	public void updateSucess() {
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "rentalPanel");
	}
	//회원탈퇴 
	public void deleteProcess() {
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "deletePanel");
	}
	//도서(대여,예약)
	public void manageProcess() {
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "rentManege");
	}
	//도서 예약
	public void reservProcess() {
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "reservPanel");
	}
	//도서 대여
	public void rentProcess() {
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		System.out.println(cl);
		cl.show(baseCardLayoutPanel, "rentPanel");
	}
}
