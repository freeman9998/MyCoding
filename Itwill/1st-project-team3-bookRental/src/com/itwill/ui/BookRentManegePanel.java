package com.itwill.ui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.itwill.service.BookMemberService;
import com.itwill.service.BookService;
import com.itwill.service.Borrow_BookService;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;
import com.itwill.vo.Borrow_Book;

public class BookRentManegePanel extends JPanel {
	private JPanel BookRentPanel;
	private JTable bookDateTable;

	BookMainFrame bookMainFrame;
	
	/*************서비스객체선언*********************/
	Borrow_BookService borrow_BookService;
	BookService bookService;
	BookMemberService bookMemberService;
	BookMember loginMember;
	Book book;
	/**
	 * Create the panel.
	 */
	public BookRentManegePanel() {
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		JButton goRentBtn = new JButton("도서 대여");
		goRentBtn.setFont(new Font("굴림", Font.PLAIN, 28));
		goRentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.rentProcess();
			}
		});
		goRentBtn.setBounds(71, 343, 200, 50);
		add(goRentBtn);
		
		JButton goReservBtn = new JButton("도서 예약");
		goReservBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.reservProcess();
			}
		});
		goReservBtn.setFont(new Font("굴림", Font.PLAIN, 28));
		goReservBtn.setBounds(302, 343, 200, 50);
		add(goReservBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 138, 431, 116);
		add(scrollPane);
		
		bookDateTable = new JTable() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		bookDateTable.setModel(new DefaultTableModel(new Object[][][] {}, new String[] { "대여번호","제목","글쓴이","대여일","반납일" }){

			public boolean isCellEditable(int row, int column) {
				
			      return false;

			    }

			});
		
		bookDateTable.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		bookDateTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		bookDateTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uB300\uC5EC \uBC88\uD638", "\uB3C4\uC11C \uC81C\uBAA9", "\uB3C4\uC11C \uC800\uC790", "\uB300\uC5EC\uC77C", "\uBC18\uB0A9\uC77C"
			}
		));
		scrollPane.setViewportView(bookDateTable);
		
		JButton returnCheckBtn = new JButton("대여 목록");
		returnCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrowBookListJTable();
			}
		});
		returnCheckBtn.setBounds(241, 278, 97, 23);
		add(returnCheckBtn);
		
		JButton backBtn = new JButton("뒤로가기");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.updateclose();
			}
		});
		backBtn.setBounds(12, 10, 97, 23);
		add(backBtn);

		
		/***************서비스객체생성********************/
		bookService = new BookService();
		borrow_BookService = new Borrow_BookService();
		bookMemberService =new BookMemberService();
		/*********************************************/
		if(loginMember!=null) {
		borrowBookListJTable();
		}
	}
	private void borrowBookListJTable() {
		/*******************대여목록***********************/
		try {
			this.loginMember=bookMainFrame.loginMember;

			List<Borrow_Book> borrowBookList = borrow_BookService.selectById(loginMember.getMember_id());
			Vector bookListVector = new Vector();
			for (Borrow_Book borrow_Book : borrowBookList) {
				Vector bookVector= new Vector();
				
				int borrowBookNum=borrow_Book.getBorrow_no();
				
				Date borrowBook=borrow_Book.getBorrow_rental();
				
				Date returnBook=borrow_Book.getBorrow_return();
				
				Book book=bookService.findByNo(borrow_Book.getBook_no());
				
				String author=book.getBook_author();
				
				String title=book.getBook_title();	
				
				bookVector.add(borrowBookNum);
				bookVector.add(title);
				bookVector.add(author);
				bookVector.add(borrowBook);
				bookVector.add(returnBook);
				bookListVector.add(bookVector);
			
			}
			
			Vector columnNames=new Vector();
			columnNames.add("대여번호");
			columnNames.add("제목");
			columnNames.add("글쓴이");
			columnNames.add("대여일");
			columnNames.add("반납일");
			
			
			DefaultTableModel defaultTableModel=
					new DefaultTableModel(bookListVector,columnNames);
			bookDateTable.setModel(defaultTableModel);
		} catch (Exception e1) {
			e1.printStackTrace();			
		}
	}
	public void setBookMainFrame(BookMainFrame bookMainFrame2) {
		this.bookMainFrame = bookMainFrame2;
		
	}

	public void dataLoad() {
		borrowBookListJTable();
	}
}
