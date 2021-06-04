package com.itwill.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import com.itwill.service.BookMemberService;
import com.itwill.service.BookService;
import com.itwill.service.Borrow_BookService;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;
import com.itwill.vo.Borrow_Book;

public class BookReturnPanel extends JPanel {
	private JTable bookDateTable;
	private JCheckBox returnCHB;
	
	/*****************메인호출*****************/
	BookMainFrame bookMainFrame;
	
	/*************서비스객체선언*********************/
	Borrow_BookService borrow_BookService;
	BookService bookService;
	BookMemberService bookMemberService;
	/*************전역변수 선언*********************/
	BookReturnDialog bookReturnDialog;
	BookMember loginMember;
	Book book;
	int returnBook;
	List<Borrow_Book> bookList=new ArrayList<Borrow_Book>();
	List<Integer>  allBookList;

	
	

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public List<Borrow_Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Borrow_Book> bookList) {
		this.bookList = bookList;
	}
	/**
	 * Create the panel.
	 */
	public BookReturnPanel() {
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		JButton backBtn = new JButton("뒤로가기");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.loginProcess(loginMember);
			}
		});
		backBtn.setBounds(23, 21, 97, 23);
		add(backBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 115, 492, 150);
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
		bookDateTable.setFont(new Font("굴림", Font.PLAIN, 14));
		bookDateTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		bookDateTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uB300\uC5EC\uBC88\uD638", "\uAE00\uC4F4\uC774", "\uB300\uC5EC\uC77C", "\uBC18\uB0A9\uC77C", "New column"
			}
		));
		
		scrollPane.setViewportView(bookDateTable);
		
		JLabel returnTitle = new JLabel("도서 반납");
		returnTitle.setFont(new Font("굴림", Font.PLAIN, 24));
		returnTitle.setBounds(230, 69, 142, 26);
		add(returnTitle);
		
		JButton selectReturnBtn = new JButton("선택 책 반납");
		selectReturnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selectBookReturn();
			}
		});
		selectReturnBtn.setBounds(50, 350, 209, 65);
		add(selectReturnBtn);
		
		JButton allReturnBtn = new JButton("전체 반납");
		allReturnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrowBookAllReturn();
				
			}
		});
		allReturnBtn.setBounds(337, 350, 205, 65);
		add(allReturnBtn);
		
		/************대여 정보 불러오기 버튼 (현재 버전 비활성화) **************/
		
		/*
		JButton returnCheckBtn = new JButton("대여 목록");
		returnCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrowBookListJTable();
				
			}
		});
		returnCheckBtn.setBounds(231, 296, 97, 23);
		add(returnCheckBtn);
		*/

		
		/***************서비스객체생성********************/
		bookService = new BookService();
		borrow_BookService = new Borrow_BookService();
		bookMemberService =new BookMemberService();
		/*********************************************/
		
		if(loginMember!=null) {
		borrowBookListJTable();
		}
	
	}//생성자의 끝
		private void borrowBookListJTable() {
			/*******************대여목록***********************/
			try {
				
				this.loginMember=bookMainFrame.loginMember;
				List<Borrow_Book> borrowBookList = borrow_BookService.selectById(loginMember.getMember_id());
				this.loginMember=bookMemberService.findById(loginMember.getMember_id());
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
		/*************************선택 책 반납*********************/
		
		
		private void selectBookReturn()  {
			allBookList=new ArrayList<Integer>();
			try {
				if(loginMember.getMember_count()==0) {
					JOptionPane.showMessageDialog(null, "반납할 책이 없습니다 .");
				}else {
				int row = bookDateTable.getSelectedRow();  //세로
				int col = bookDateTable.getSelectedColumn();//가로
				System.out.println(row+","+col);
				if(row==-1 &&col==-1) {
					JOptionPane.showMessageDialog(null, "책을 선택해주세요.");
					return;
				}
				int selected=(int)bookDateTable.getValueAt(row, 0);
				//JOptionPane.showMessageDialog(null, "선택한 책이 반납되었습니다.");
					BookReturnDialog bookReturnDialog=new BookReturnDialog();
					int bookNo=borrow_BookService.selectBorrowBook(selected).getBook_no();
					returnBook=bookNo;
					allBookList.add(bookNo);
					bookReturnDialog.returnListData(allBookList);
					borrow_BookService.returnOneBook(selected);
					bookReturnDialog.returnBookListJTable();
					bookReturnDialog.setReturnMainFrame(this);
					bookReturnDialog.setModal(true);
					bookReturnDialog.setVisible(true);
					
					borrowBookListJTable();
				 
				 
				}} catch (Exception e) {
				e.printStackTrace();
				}
			
			allBookList=null;
			
		}
		/*******************모든 책 반납*********************/

		private void borrowBookAllReturn() {
			allBookList=new ArrayList<Integer>();
			try {
				if(loginMember.getMember_count()==0) {
					JOptionPane.showMessageDialog(null, "반납할 책이 없습니다 .");
					return;
				}else {
				bookList=borrow_BookService.selectById(loginMember.getMember_id());
			
				for (Borrow_Book book : bookList) {
					allBookList.add(book.getBook_no());
				
				}
				for (Integer integer : allBookList) {
					System.out.println(integer);
				}
				BookReturnDialog bookReturnDialog=new BookReturnDialog();
				bookReturnDialog.returnListData(allBookList);
				bookReturnDialog.returnBookListJTable();
				bookReturnDialog.setReturnMainFrame(this);
				bookReturnDialog.setModal(true);
				bookReturnDialog.setVisible(true);
				
				
				borrow_BookService.allReturnBookById(bookMainFrame.loginMember.getMember_id());
				//JOptionPane.showMessageDialog(null, "모든 책이 반납되었습니다.");
				borrowBookListJTable();
				
				 
				}
			} catch (Exception e) {
				e.printStackTrace();
			} allBookList=null;
		}
		
		
		
		
			
		public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.bookMainFrame=bookMainFrame;
		
		}
		public void dataLoad() {
			borrowBookListJTable();
		}


		
}


