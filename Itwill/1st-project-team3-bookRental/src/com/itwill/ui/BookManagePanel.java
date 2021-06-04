package com.itwill.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.service.BookMemberService;
import com.itwill.service.BookService;
import com.itwill.service.Borrow_BookService;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;
import com.itwill.vo.Borrow_Book;

public class BookManagePanel extends JPanel {
	private JButton rentalBtn;
	private JButton borrowBtn;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/*****************메인호출*****************/
	BookMainFrame bookMainFrame;
	
	/*************객체선언*********************/
	BookService bookService;
	Book book;
	BookMember loginMember;
	

	private JLabel lblNewLabel;
	private JTable bookTable;
	/**
	 * Create the panel.
	 */
	public BookManagePanel() {
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		rentalBtn = new JButton("도서 대여");
		rentalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.manageProcess();
			}
		});
		rentalBtn.setBounds(96, 311, 119, 43);
		add(rentalBtn);
		
		borrowBtn = new JButton("도서 반납");
		borrowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.borrowReturnProcess();
			
				
			}
		});
		borrowBtn.setBounds(379, 311, 119, 43);
		add(borrowBtn);
		
		btnNewButton = new JButton("회원정보 수정");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.updateProcess();
			}
		});
		btnNewButton.setBounds(206, 384, 178, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("로그아웃");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.logoutProcess();
			}
		});
		btnNewButton_1.setBounds(206, 428, 178, 23);
		add(btnNewButton_1);
		
		lblNewLabel = new JLabel("BOOK RENTAL");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(191, 41, 217, 62);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 134, 498, 146);
		add(scrollPane);
		
		bookTable = new JTable();
		bookTable.setEnabled(false);
		bookTable.setModel(new DefaultTableModel(
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
				"\uCC45\uBC88\uD638", "\uC81C\uBAA9", "\uAE00\uC4F4\uC774", "\uC904\uAC70\uB9AC", "\uB300\uC5EC\uAC00\uB2A5\uAD8C\uC218"
			}
		));
		bookTable.getColumnModel().getColumn(3).setPreferredWidth(207);
		bookTable.getColumnModel().getColumn(4).setPreferredWidth(97);
		scrollPane.setViewportView(bookTable);
		
		/***************서비스객체생성********************/
		bookService = new BookService();
		/*********************************************/
		if(loginMember!=null) {
			bookListJTable();
		}
	}
	public void dataLoad() {
		bookListJTable();
	}
	public void bookListJTable() {
		
		try {
			
			List<Book> bookList = bookService.findAll();
			Vector bookListVector = new Vector();
			for (Book book1 : bookList) {
				Vector bookVector= new Vector();
				
				int bookNum= book1.getBook_no();
				String bookTitle= book1.getBook_title();
				String bookAuthor= book1.getBook_author();
				String bookSummary = book1.getBook_summary();
				int bookTotal = book1.getBook_total();
				
				bookVector.add(bookNum);
				bookVector.add(bookTitle);
				bookVector.add(bookAuthor);
				bookVector.add(bookSummary);
				bookVector.add(bookTotal);
				
				bookListVector.add(bookVector);
			}
			
			Vector columnNames=new Vector();
			columnNames.add("책번호");
			columnNames.add("제목");
			columnNames.add("글쓴이");
			columnNames.add("줄거리");
			columnNames.add("대여가능권수");
			
			
			DefaultTableModel defaultTableModel = new DefaultTableModel(bookListVector,columnNames);
			bookTable.setModel(defaultTableModel);
		} catch (Exception e1) {
			e1.printStackTrace();			
		}
		
	}
	
	public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.bookMainFrame=bookMainFrame;	
	}
}
