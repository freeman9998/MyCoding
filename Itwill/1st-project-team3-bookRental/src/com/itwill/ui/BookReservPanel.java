package com.itwill.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.service.Borrow_BookService;
import com.itwill.service.Reserv_BookService;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

public class BookReservPanel extends JPanel {
	private JTextField titleTF;
	private JTable bTable;
	private JTextField ReservTF;
	Reserv_BookService reserv_bookService;
	BookMember loginMember;
	
	BookMainFrame bookMainFrame;
	
	/**
	 * Create the panel.
	 */
	public BookReservPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("도서 예약 하기");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		lblNewLabel.setBounds(148, 56, 321, 70);
		add(lblNewLabel);
		setBackground(new Color(230, 230, 250));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(123, 278, 393, 92);
		add(scrollPane);
		
		bTable = new JTable();
		bTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int selectedROw = bTable.getSelectedRow();
					int selectedBookNo = (int) bTable.getValueAt(selectedROw, 0);
					
					Book book = reserv_bookService.findByNo(selectedBookNo);
					
					ReservTF.setText(book.getBook_title());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		bTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"    \uB3C4\uC11C \uBC88\uD638", "    \uB3C4\uC11C \uC81C\uBAA9", "    \uB3C4\uC11C \uC800\uC790", "    \uB300\uC5EC \uD604\uD669"
			}
		));
		scrollPane.setViewportView(bTable);
		
		titleTF = new JTextField();
		titleTF.setBounds(148, 203, 116, 21);
		add(titleTF);
		titleTF.setColumns(10);
		
		JButton SearchBtn = new JButton("검색하기");
		SearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titleStr = titleTF.getText();
				/*********************/
				if(titleStr.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "도서 제목을 입력해주세요");
					titleTF.requestFocus();
					return;
				}
				try {
					boolean result = reserv_bookService.booksearch(titleStr);
					if(result == true) {
						bookListTable(titleStr);
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		SearchBtn.setBounds(372, 202, 97, 23);
		add(SearchBtn);
		
		
		JButton reservBtn = new JButton("예약하기");
		reservBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = bTable.getSelectedRow();
				int selectedBookNo = (int)bTable.getValueAt(selectedRow, 0);
				try {
					Book book = reserv_bookService.findByNo(selectedBookNo);
					
					
						JOptionPane.showMessageDialog(null, "예약 되었습니다.");
					
					
					reserv_bookService.reservationBook(bookMainFrame.loginMember.getMember_id(), book.getBook_no());
					
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		reservBtn.setBounds(372, 406, 97, 23);
		add(reservBtn);
		ReservTF = new JTextField();
		ReservTF.setEditable(false);
		ReservTF.setBounds(123, 407, 159, 21);
		add(ReservTF);
		ReservTF.setColumns(10);
		
		JButton goHomeBtn = new JButton("뒤로가기");
		goHomeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.manageProcess();
			}
		});
		goHomeBtn.setBounds(12, 10, 97, 23);
		add(goHomeBtn);
		
		reserv_bookService = new Reserv_BookService();
	}
	private void bookListTable(String bookTitleStr) {
		try {
			List<Book> bList = reserv_bookService.findTitleAll(bookTitleStr);
			Vector bListVector = new Vector();
			for (Book book : bList) {
				Vector bookV = new Vector();
				bookV.add(book.getBook_no());
				bookV.add(book.getBook_title());
				bookV.add(book.getBook_author());
				bookV.add(book.getBook_summary());
				bookV.add(book.getBook_total());
				bListVector.add(bookV);
			}
			Vector columnName = new Vector();
			columnName.add("도서번호");
			columnName.add("도서제목");
			columnName.add("도서저자");
			columnName.add("줄거리");
			columnName.add("대여현황");
			
			DefaultTableModel defaultTableModel = new DefaultTableModel(bListVector, columnName);
			bTable.setModel(defaultTableModel);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.bookMainFrame = bookMainFrame;
	}
	
	
}
