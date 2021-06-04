package com.itwill.shop.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.shop.service.MemberService;
import com.itwill.shop.vo.Member;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class MemberJoinDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JPasswordField passwordTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JComboBox ageCB;
	private JCheckBox marriedCHB;
	private JButton idCheckButton;
	/*************Service객체선언*************/
	MemberService memberService;
	/*****************************************/
	
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			MemberJoinDialog dialog = new MemberJoinDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	/**
	 * Create the dialog.
	 */
	public MemberJoinDialog() {
		setBounds(100, 100, 458, 580);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("아이디");
			lblNewLabel.setBounds(48, 57, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("패쓰워드");
			lblNewLabel_1.setBounds(48, 117, 57, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("이름");
			lblNewLabel_2.setBounds(48, 177, 57, 15);
			contentPanel.add(lblNewLabel_2);
		}
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(48, 238, 57, 15);
		contentPanel.add(lblNewLabel_3);
		{
			JLabel lblNewLabel_4 = new JLabel("나이");
			lblNewLabel_4.setBounds(48, 284, 57, 15);
			contentPanel.add(lblNewLabel_4);
		}
		{
			idTF = new JTextField();
			idTF.setBounds(175, 54, 116, 21);
			contentPanel.add(idTF);
			idTF.setColumns(10);
		}
		{
			passwordTF = new JPasswordField();
			passwordTF.setBounds(175, 114, 116, 21);
			contentPanel.add(passwordTF);
		}
		{
			nameTF = new JTextField();
			nameTF.setBounds(175, 174, 116, 21);
			contentPanel.add(nameTF);
			nameTF.setColumns(10);
		}
		{
			addressTF = new JTextField();
			addressTF.setBounds(175, 235, 116, 21);
			contentPanel.add(addressTF);
			addressTF.setColumns(10);
		}
		{
			ageCB = new JComboBox();
			ageCB.setModel(new DefaultComboBoxModel(new String[] {"25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
			ageCB.setBounds(175, 280, 116, 23);
			contentPanel.add(ageCB);
		}
		
		marriedCHB = new JCheckBox("결혼여부");
		marriedCHB.setBounds(48, 340, 115, 23);
		contentPanel.add(marriedCHB);
		
		idCheckButton = new JButton("중복체크");
		idCheckButton.setBounds(303, 53, 97, 23);
		contentPanel.add(idCheckButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("가입");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String idStr=idTF.getText();
						char[] passChars=passwordTF.getPassword();
						String nameStr=nameTF.getText();
						String addressStr=addressTF.getText();
						String ageStr=(String)ageCB.getSelectedItem();
						String married="F";
						if(marriedCHB.isSelected()) {
							married="T";
						}
						/****************유효성체크*************/
						if(idStr.trim().equals("")) {
							JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
							idTF.requestFocus();
							return;
						}
						/****************************************/
						
						String passwordStr=new String(passChars);
						int age=Integer.parseInt(ageStr);
						Member newMember=new Member(idStr, passwordStr, nameStr, addressStr, age, married, null);
						try {
							boolean isSuccess=memberService.memberRegister(newMember);
							if(isSuccess) {
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "이미존재하는 아이디입니다.");
								idTF.requestFocus();
								idTF.setSelectionStart(0);
								idTF.setSelectionEnd(idStr.length());
								return;
							}
						} catch (Exception e1) {
							e1.printStackTrace();
							
						}
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		/*************Service객체생성*************/
		memberService=new MemberService();
		/*****************************************/
	}//constructor둥
}//end class
