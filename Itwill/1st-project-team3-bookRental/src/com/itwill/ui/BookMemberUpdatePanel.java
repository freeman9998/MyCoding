package com.itwill.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.itwill.service.BookMemberService;
import com.itwill.vo.BookMember;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;
import java.awt.Font;

public class BookMemberUpdatePanel extends JPanel {

	private JTextField phone2TF;
	private JTextField phone3TF;
	private JTextField email1TF;
	private JComboBox phone1CB;
	private JComboBox email2CB;
	private JPasswordField passwordTF;
	private JPasswordField passwordCheckTF;
	private JButton memberDeleteBtn;
	private JButton cancleBtn;
	private JButton confirmBtn;

	/************ 메인 호출 ************/
	BookMainFrame bookMainFrame;
	/************* Service객체선언 *************/
	BookMemberService memberService;
	/*******************************/
	BookMember bookMember;
	BookMember loginMember;
	private JButton passwordUpdateBtn;
	private JButton phoneUpdateBtn;
	private JButton emailUpdateBtn;
	private JLabel lblNewLabel_4;

	/**
	 * Create the panel.
	 */
	public BookMemberUpdatePanel() {
		
		setBackground(new Color(230, 230, 250));
		setLayout(null);

		JLabel lblNewLabel = new JLabel("새 비밀번호");
		lblNewLabel.setBounds(85, 99, 82, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1.setBounds(85, 166, 90, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("전화번호");
		lblNewLabel_2.setBounds(85, 238, 90, 15);
		add(lblNewLabel_2);

		phone1CB = new JComboBox();
		phone1CB.setEnabled(false);
		phone1CB.setModel(new DefaultComboBoxModel(new String[] { "선택없음", "010", "02", "031", "032", "033", "041",
				"042", "043", "044", "051", "052", "053", "054", "055", "061", "062", "063", "064", "070" }));
		phone1CB.setBounds(206, 234, 47, 23);
		add(phone1CB);

		phone2TF = new JTextField();
		phone2TF.setEnabled(false);
		phone2TF.setBounds(272, 235, 57, 21);
		add(phone2TF);
		phone2TF.setColumns(10);

		phone3TF = new JTextField();
		phone3TF.setEnabled(false);
		phone3TF.setColumns(10);
		phone3TF.setBounds(348, 235, 57, 21);
		add(phone3TF);

		JLabel lblNewLabel_6 = new JLabel("-");
		lblNewLabel_6.setBounds(259, 238, 22, 15);
		add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("-");
		lblNewLabel_6_1.setBounds(335, 238, 15, 15);
		add(lblNewLabel_6_1);

		email1TF = new JTextField();
		email1TF.setEnabled(false);
		email1TF.setBounds(206, 305, 89, 21);
		add(email1TF);
		email1TF.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("@");
		lblNewLabel_7.setBounds(299, 308, 57, 15);
		add(lblNewLabel_7);

		email2CB = new JComboBox();
		email2CB.setEnabled(false);
		email2CB.setModel(new DefaultComboBoxModel(
				new String[] { "선택없음", "naver.com", "gmail.com", "hanmail.net", "daum.net", "nate.com" }));
		email2CB.setBounds(316, 304, 89, 23);
		add(email2CB);

		JLabel lblNewLabel_3 = new JLabel("이메일");
		lblNewLabel_3.setBounds(85, 308, 82, 15);
		add(lblNewLabel_3);

		cancleBtn = new JButton("닫기");
		cancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메인화면으로 이동
				bookMainFrame.updateclose();
			}
		});
		cancleBtn.setBounds(165, 383, 97, 23);
		add(cancleBtn);

		confirmBtn = new JButton("확인");
		confirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char[] passChars = passwordTF.getPassword();
				char[] passCheckChars = passwordCheckTF.getPassword();

				String phoneStr1;
				if (((String) phone1CB.getSelectedItem()).equals("선택없음")) {
					phoneStr1 = "";
				} else {
					phoneStr1 = (String) phone1CB.getSelectedItem();
				}
				String phoneStr2 = phone2TF.getText();
				String phoneStr3 = phone3TF.getText();
				String emailStr1 = email1TF.getText();

				String emailStr2;
				if (((String) email2CB.getSelectedItem()).equals("선택없음")) {
					emailStr2 = "";
				} else {
					emailStr2 = (String) email2CB.getSelectedItem();
				}

				String passwordStr = new String(passChars);
				String passCheckStr = new String(passCheckChars);

				/*****************************/
				memberUpdate(passwordStr, passCheckStr,phoneStr1, phoneStr2, phoneStr3, emailStr1, emailStr2);

			}
		});
		confirmBtn.setBounds(335, 383, 97, 23);
		add(confirmBtn);

		passwordTF = new JPasswordField();
		passwordTF.setEnabled(false);
		passwordTF.setBounds(206, 96, 199, 21);
		add(passwordTF);

		passwordCheckTF = new JPasswordField();
		passwordCheckTF.setEnabled(false);
		passwordCheckTF.setBounds(206, 163, 199, 21);
		add(passwordCheckTF);

		memberDeleteBtn = new JButton("회원탈퇴");
		memberDeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.deleteProcess();
			}
		});
		memberDeleteBtn.setBounds(25, 454, 97, 23);
		add(memberDeleteBtn);
		
		passwordUpdateBtn = new JButton("수정");
		passwordUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordTF.setEnabled(true);
				passwordCheckTF.setEnabled(true);
				passwordUpdateBtn.setEnabled(false);
			}
		});
		passwordUpdateBtn.setBounds(439, 94, 62, 23);
		add(passwordUpdateBtn);
		
		phoneUpdateBtn = new JButton("수정");
		phoneUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMember = bookMainFrame.loginMember;
				try {
					loginMember = memberService.findById(bookMember.getMember_id());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				for(int i = 0 ; i < 20; i++) {
					if(phone1CB.getItemAt(i).equals(loginMember.getMember_phone_1())) {
						phone1CB.setSelectedIndex(i);
					}
				}
				phone2TF.setText(loginMember.getMember_phone_2());
				phone3TF.setText(loginMember.getMember_phone_3());
				
				phone1CB.setEnabled(true);
				phone2TF.setEnabled(true);
				phone3TF.setEnabled(true);
				phoneUpdateBtn.setEnabled(false);
			}
		});
		phoneUpdateBtn.setBounds(439, 234, 64, 23);
		add(phoneUpdateBtn);
		
		emailUpdateBtn = new JButton("수정");
		emailUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMember = bookMainFrame.loginMember;
				try {
					loginMember = memberService.findById(bookMember.getMember_id());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				for(int i = 0 ; i < 6; i++) {
					if(email2CB.getItemAt(i).equals(loginMember.getMember_email_2())) {
						email2CB.setSelectedIndex(i);
					}
				}
				email1TF.setText(loginMember.getMember_email_1());
				
				email1TF.setEnabled(true);
				email2CB.setEnabled(true);
				emailUpdateBtn.setEnabled(false);
			}
		});
		emailUpdateBtn.setBounds(439, 304, 64, 23);
		add(emailUpdateBtn);
		
		lblNewLabel_4 = new JLabel("BOOK RENTAL");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(233, 35, 199, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("*영문자, 숫자, 특수문자 2가지 조합 시 10글자 이상, 3가지 조합 시 8글자 이상");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 10));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(206, 127, 420, 15);
		add(lblNewLabel_5);

		/************* Service객체생성 *************/
		memberService = new BookMemberService();
		/*****************************************/

	}
	
	
	public void setEnable() {
		
		passwordTF.setText("");
		passwordCheckTF.setText("");
		phone1CB.setSelectedIndex(0);
		phone2TF.setText("");
		phone3TF.setText("");
		email1TF.setText("");
		email2CB.setSelectedIndex(0);
		
		passwordTF.setEnabled(false);
		passwordCheckTF.setEnabled(false);
		phone1CB.setEnabled(false);
		phone2TF.setEnabled(false);
		phone3TF.setEnabled(false);
		email1TF.setEnabled(false);
		email2CB.setEnabled(false);
		
		passwordUpdateBtn.setEnabled(true);
		phoneUpdateBtn.setEnabled(true);
		emailUpdateBtn.setEnabled(true);
	}
	
	
	public void memberUpdate(String passwordStr, String passCheckStr, String phoneStr1, String phoneStr2,
			String phoneStr3, String emailStr1, String emailStr2) {
		try {
			int isSuccess = -9999;

//			bookMember = bookMainFrame.loginMember;
			bookMember = memberService.findById(bookMainFrame.loginMember.getMember_id());
			System.out.println(isSuccess = memberService.BookmemberUpdate(bookMember, passwordStr, passCheckStr,
					phoneStr1, phoneStr2, phoneStr3, emailStr1, emailStr2));

			if (isSuccess == -1) {
				JOptionPane.showMessageDialog(null, "비밀번호 확인과 일치하지 않습니다. 다시 입력해주세요.");
				passwordCheckTF.requestFocus();
				passwordCheckTF.setSelectionStart(0);
				passwordCheckTF.setSelectionEnd(passCheckStr.length());
				return;
			} else if (isSuccess == -2) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				passwordTF.requestFocus();
				passwordTF.setSelectionStart(0);
				passwordTF.setSelectionEnd(passwordStr.length());
			} else if (isSuccess == -3) {
				JOptionPane.showMessageDialog(null, "비밀번호 생성 조건을 만족하지 못했습니다. 다시 입력해주세요.");
				passwordTF.requestFocus();
				passwordTF.setSelectionStart(0);
				passwordTF.setSelectionEnd(passwordStr.length());
			} else if (isSuccess == -4 || isSuccess == -5) {
				JOptionPane.showMessageDialog(null, "비밀번호가 너무 짧습니다. 다시 입력해주세요.");
				passwordTF.requestFocus();
				passwordTF.setSelectionStart(0);
				passwordTF.setSelectionEnd(passwordStr.length());
			} else if (isSuccess == 1) {
				bookMainFrame.updateSucess();	
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}


	public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.bookMainFrame = bookMainFrame;
	}
}