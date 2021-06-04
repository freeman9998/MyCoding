package com.itwill.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.itwill.service.BookMemberService;
import com.itwill.service.BookService;
import com.itwill.service.Borrow_BookService;
import com.itwill.service.Reserv_BookService;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class BookRentPanel extends JPanel {
	private JTable bookListTable;
	private JTextField bookTitleTF;
	private JButton rentBtn;
	private JTextField bookRentTitleTF;
	
	BookMainFrame bookMainFrame;
	BookService bookService;
	BookMember loginMember;
	BookMemberService bookMemberService;
	Borrow_BookService borrow_BookService;
	Reserv_BookService reserv_BookService;
	/**
	 * Create the panel.
	 */
	public BookRentPanel() {
		setBackground(new Color(230, 230, 250));
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(171, 142, 335, 193);
		add(scrollPane);
		
		bookListTable = new JTable();
		bookListTable.addMouseListener(new MouseAdapter() {
			// 마우스 클릭 이벤트
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int selectedRow = bookListTable.getSelectedRow();
					int selectedBookNo = (int) bookListTable.getValueAt(selectedRow, 0);

					Book book = bookService.findByNo(selectedBookNo);

					bookRentTitleTF.setText(book.getBook_title());

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		bookListTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uC81C\uBAA9", "\uC800\uC790", "\uC904\uAC70\uB9AC", "\uB300\uC5EC\uD604\uD669"
			}
		));
		scrollPane.setViewportView(bookListTable);

		JLabel bookTitleL = new JLabel("도서명 :");
		bookTitleL.setHorizontalAlignment(SwingConstants.CENTER);
		bookTitleL.setFont(new Font("굴림", Font.BOLD, 14));
		bookTitleL.setBounds(78, 99, 81, 43);
		add(bookTitleL);
		
		//검색 버튼
		JButton btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookTitleStr = bookTitleTF.getText();
				if (bookTitleStr.trim().equals("")) {
					bookTitleTF.setText("");
					JOptionPane.showMessageDialog(null, "도서명을 재검색해주세요.");
					return;
				}

				try {
					boolean result = bookService.bookSearch(bookTitleStr);
					if (result == true) {
						bookListJTable(bookTitleStr);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(372, 108, 134, 24);
		add(btnNewButton);

		bookTitleTF = new JTextField();
		bookTitleTF.setFont(new Font("굴림", Font.BOLD, 14));
		bookTitleTF.setBounds(171, 108, 168, 24);
		add(bookTitleTF);
		bookTitleTF.setColumns(10);

		JLabel lblNewLabel = new JLabel("도서 대여");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(213, 24, 209, 73);
		add(lblNewLabel);

		JLabel bookResult = new JLabel("도서검색결과 :");
		bookResult.setHorizontalAlignment(SwingConstants.CENTER);
		bookResult.setFont(new Font("굴림", Font.BOLD, 14));
		bookResult.setBounds(30, 142, 129, 43);
		add(bookResult);
		
		//대여하기 버튼
		rentBtn = new JButton("대여하기");
		rentBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				/******************************************/
				int selectedRow = bookListTable.getSelectedRow();
				int selectedBookNo = (int) bookListTable.getValueAt(selectedRow, 0);
				
				try {
					boolean isReserv = reserv_BookService.checkReservBook(bookMainFrame.loginMember.getMember_id(), selectedBookNo);
					if(isReserv) {
						JOptionPane.showMessageDialog(null, "예약된 도서입니다.");
						reserv_BookService.cancleReserv(bookMainFrame.loginMember.getMember_id(), selectedBookNo);
					}
					
					Book book = bookService.findByNo(selectedBookNo);
					boolean isContinue = bookService.decreaseBookTotal(book);
					
					if (isContinue == true) {						
						bookMemberService.increaseMemberTotalBookCount(bookMainFrame.loginMember);
						borrow_BookService.updateRentMemberIdAndBookNo(bookMainFrame.loginMember.getMember_id(), book.getBook_no());
						JOptionPane.showMessageDialog(null, "도서 대여가 완료되었습니다.");
						
						bookRentTitleTF.setText("");
						bookListJTable(book.getBook_title());
						bookTitleTF.setText("");
					} else {
						JOptionPane.showMessageDialog(null, "대여할 수 있는 책이 존재하지 않습니다.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				/********************************************/
			}
		});
		rentBtn.setBackground(new Color(192, 192, 192));
		rentBtn.setFont(new Font("굴림", Font.BOLD, 20));
		rentBtn.setBounds(213, 398, 209, 73);
		add(rentBtn);

		JLabel lblNewLabel_1 = new JLabel("*대여할 책을 클릭 후 아래 대여하기 버튼을 눌러주세요.");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(171, 345, 332, 15);
		add(lblNewLabel_1);

		JLabel bookRentTitle = new JLabel("대여할 도서명 :");
		bookRentTitle.setFont(new Font("굴림", Font.BOLD, 14));
		bookRentTitle.setBounds(48, 369, 111, 15);
		add(bookRentTitle);

		bookRentTitleTF = new JTextField();
		bookRentTitleTF.setBounds(171, 366, 168, 21);
		add(bookRentTitleTF);
		bookRentTitleTF.setColumns(10);
		
		JButton backBtn = new JButton("뒤로가기");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.manageProcess();
			}
		});
		backBtn.setBounds(12, 10, 97, 23);
		add(backBtn);

		bookService = new BookService();
		bookMemberService =new BookMemberService();
		borrow_BookService = new Borrow_BookService();
		reserv_BookService = new Reserv_BookService();
	}
	
	//테이블
	private void bookListJTable(String bookTitleStr) {
		try {
			List<Book> bookList = bookService.findByTitleAll(bookTitleStr);
			Vector bookListVector = new Vector();
			for (Book book : bookList) {
				Vector bookVector = new Vector();
				bookVector.add(book.getBook_no());
				bookVector.add(book.getBook_title());
				bookVector.add(book.getBook_author());
				bookVector.add(book.getBook_summary());
				bookVector.add(book.getBook_total());
				bookListVector.add(bookVector);

			}
			Vector columnNames = new Vector();
			columnNames.add("번호");
			columnNames.add("제목");
			columnNames.add("저자");
			columnNames.add("줄거리");
			columnNames.add("대여현황");

			DefaultTableModel defaultTableModel = new DefaultTableModel(bookListVector, columnNames);
			bookListTable.setModel(defaultTableModel);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.bookMainFrame=bookMainFrame;
	}
}

