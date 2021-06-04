package com.itwill.ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.itwill.service.BookService;
import com.itwill.vo.Book;
import com.itwill.vo.Borrow_Book;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class BookReturnDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable returnBookTable;
	private JTable bestSellerTable;
	BookReturnPanel bookReturnPanel;
	int returnBook;
	List<Borrow_Book> bookList;
	List<Integer> returnBookList;
	BookService bookService;
	Book book;

	/**
	 * Create the dialog.
	 */
	public BookReturnDialog() {
		setBounds(100, 100, 603, 500);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBounds(0, 0, 587, 429);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("반납 목록");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(224, 25, 74, 45);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("추천 도서");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(232, 240, 111, 19);
		contentPanel.add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 66, 471, 133);
		contentPanel.add(scrollPane);

		returnBookTable = new JTable();
		returnBookTable.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, },
				new String[] { "\uCC45\uC774\uB984", "\uAE00\uC4F4\uC774", "\uC904\uAC70\uB9AC" }));
		scrollPane.setViewportView(returnBookTable);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(48, 282, 471, 137);
		contentPanel.add(scrollPane_1);

		bestSellerTable = new JTable();
		bestSellerTable.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "\uCC45\uC774\uB984", "\uAE00\uC4F4\uC774", "\uC904\uAC70\uB9AC" }));
		scrollPane_1.setViewportView(bestSellerTable);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(230, 230, 250));
			buttonPane.setBounds(0, 429, 587, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton closeBtn = new JButton("닫기");
				closeBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						book=null;
						dispose();
					}
				});
				closeBtn.setActionCommand("OK");
				buttonPane.add(closeBtn);
				getRootPane().setDefaultButton(closeBtn);
			}
		}
		/************ 서비스객체생성 **************/
		bookService = new BookService();
		bookReturnPanel=new BookReturnPanel();
		/***************************************/

	}

	public void setReturnMainFrame(BookReturnPanel bookReturnPanel) {
		this.bookReturnPanel = bookReturnPanel;

	}

	public void returnListData(List<Integer> returnBookList) {
		this.returnBookList = returnBookList;

	}

	public void returnBookListJTable() {
		Vector bookListVector = new Vector();
		try {

			for (Integer no : returnBookList) {

				book = bookService.findByNo(no);
				Vector bookVector = new Vector();

				String title = book.getBook_title();
				String author = book.getBook_author();
				String summary = book.getBook_summary();

				bookVector.add(title);
				bookVector.add(author);
				bookVector.add(summary);
				bookListVector.add(bookVector);

			}

			Vector columnNames = new Vector();
			columnNames.add("책 이름");
			columnNames.add("저자");
			columnNames.add("줄거리");
			DefaultTableModel defaultTableModel = new DefaultTableModel(bookListVector, columnNames);
			returnBookTable.setModel(defaultTableModel);

		} catch (Exception e) {

			e.printStackTrace();
		}
		bestSeller();
	}

	public void bestSeller() {
		
		
		try {
		book = bookService.findByNo((int)(Math.random()*24)+1);
		System.out.println(book);
			Vector bookListVector = new Vector();
			Vector bookVector= new Vector();
				
				String title=book.getBook_title();
				
				String author=book.getBook_author();
				
				String summary=book.getBook_summary();	
				
				bookVector.add(title);
				bookVector.add(author);
				bookVector.add(summary);
				bookListVector.add(bookVector);
		
			
				Vector columnNames=new Vector();
				columnNames.add("제목");
				columnNames.add("글쓴이");
				columnNames.add("줄거리");
			
			
			DefaultTableModel defaultTableModel=
					new DefaultTableModel(bookListVector,columnNames);
			bestSellerTable.setModel(defaultTableModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
}

	
}

