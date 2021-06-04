package com.itwill.shop.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.shop.service.MemberService;

public class MemberUpdatePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	/****************서비스객체변수선언*****************/
	MemberService memberService=null;
	/*
	ProductService productService;
	OrderService orderService;
	*/
	/**
	 * Create the panel.
	 */
	public MemberUpdatePanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(36, 66, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(36, 133, 57, 15);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(222, 63, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 130, 116, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(462, 62, 97, 23);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 177, 300, 186);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		/*****************서비스객체생성***********************/
		memberService = new  MemberService();
		/*
		productService = new ProductService();
		orderService   = new OrderService();
		*/
		
	}
}
