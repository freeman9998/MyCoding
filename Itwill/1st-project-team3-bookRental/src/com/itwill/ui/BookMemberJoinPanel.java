package com.itwill.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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



public class BookMemberJoinPanel extends JPanel {
	private JTextField idTF;
	private JTextField nameTF;
	private JTextField birthdayTF;
	private JTextField phone2TF;
	private JTextField phone3TF;
	private JTextField email1TF;
	private JComboBox phone1CB;
	private JComboBox email2CB;
	
	boolean isDuplicationCheck = false;

	/*************Service객체선언*************/
	BookMemberService memberService;
	private JPasswordField passwordTF;
	private JPasswordField passwordCheckTF;
	/*****************************************/
	
	BookMainFrame bookMainFrame;
	/**
	 * Create the panel.
	 */
	public BookMemberJoinPanel() {
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		JLabel idL = new JLabel("아이디");
		idL.setBounds(110, 61, 57, 15);
		add(idL);
		
		JLabel lblNewLabel = new JLabel("비밀번호");
		lblNewLabel.setBounds(110, 111, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1.setBounds(110, 161, 97, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(110, 211, 57, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("생년월일");
		lblNewLabel_3.setBounds(110, 261, 57, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("전화번호");
		lblNewLabel_4.setBounds(110, 311, 57, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("이메일");
		lblNewLabel_5.setBounds(110, 361, 57, 15);
		add(lblNewLabel_5);
		
		idTF = new JTextField();
		idTF.setBounds(235, 58, 148, 21);
		add(idTF);
		idTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setBounds(235, 208, 148, 21);
		add(nameTF);
		nameTF.setColumns(10);
		
		birthdayTF = new JTextField();
		birthdayTF.setBounds(235, 258, 148, 21);
		add(birthdayTF);
		birthdayTF.setColumns(10);
		
		phone1CB = new JComboBox();
		phone1CB.setModel(new DefaultComboBoxModel(new String[] {"010", "02", "031", "032", "033", "041", "042", "043", "044", "051", "052", "053", "054", "055", "061", "062", "063", "064", "070"}));
		phone1CB.setBounds(235, 307, 47, 23);
		add(phone1CB);
		
		phone2TF = new JTextField();
		phone2TF.setBounds(301, 308, 57, 21);
		add(phone2TF);
		phone2TF.setColumns(10);
		
		phone3TF = new JTextField();
		phone3TF.setColumns(10);
		phone3TF.setBounds(377, 308, 57, 21);
		add(phone3TF);
		
		JLabel lblNewLabel_6 = new JLabel("-");
		lblNewLabel_6.setBounds(288, 311, 22, 15);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("-");
		lblNewLabel_6_1.setBounds(364, 311, 15, 15);
		add(lblNewLabel_6_1);
		
		email1TF = new JTextField();
		email1TF.setBounds(235, 358, 89, 21);
		add(email1TF);
		email1TF.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("@");
		lblNewLabel_7.setBounds(328, 361, 57, 15);
		add(lblNewLabel_7);
		
		email2CB = new JComboBox();
		email2CB.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "gmail.com", "hanmail.net", "daum.net", "nate.com"}));
		email2CB.setBounds(345, 357, 89, 23);
		add(email2CB);
		
		JButton cancleBtn = new JButton("닫기");
		cancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.joinclose();
			}
		});
		cancleBtn.setBounds(170, 425, 97, 23);
		add(cancleBtn);
		
		JButton confirmBtn = new JButton("확인");
		confirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idStr=idTF.getText();
				char[] passChars=passwordTF.getPassword();
				char[] passCheckChars=passwordCheckTF.getPassword();
				String nameStr=nameTF.getText();
				String birthdayStr=birthdayTF.getText();
				String phoneStr1=(String)phone1CB.getSelectedItem();
				String phoneStr2=phone2TF.getText();
				String phoneStr3=phone3TF.getText();
				String emailStr1=email1TF.getText();
				String emailStr2=(String)email2CB.getSelectedItem();
	
				String passwordStr=new String(passChars);
				String passCheckStr=new String(passCheckChars);
				
				BookMember newMember=new BookMember(idStr, passwordStr, nameStr, birthdayStr, phoneStr1, 
						phoneStr2, phoneStr3, emailStr1, emailStr2, null, 0,0);
				try {
					int isSuccess= -99999;
					if(!isDuplicationCheck) {
						JOptionPane.showMessageDialog(null, "아이디 중복체크 해주세요.");
						return;
					}else {
						isSuccess=memberService.memberRegister(newMember, passCheckStr);
						System.out.println(isSuccess);
					}

					if(isSuccess == -1) {
						JOptionPane.showMessageDialog(null, "아이디 생성 조건을 만족하지 못했습니다. 다시 입력해주세요.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(idStr.length());
						isDuplicationCheck = false;
						return;
					}else if (isSuccess == -2) {
						JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
						passwordTF.requestFocus();
						passwordTF.setSelectionStart(0);
						passwordTF.setSelectionEnd(passwordStr.length());
					}else if (isSuccess == -3) {
						JOptionPane.showMessageDialog(null, "비밀번호 생성 조건을 만족하지 못했습니다. 다시 입력해주세요.");
						passwordTF.requestFocus();
						passwordTF.setSelectionStart(0);
						passwordTF.setSelectionEnd(passwordStr.length());
					}else if (isSuccess == -4 || isSuccess == -5) {
						JOptionPane.showMessageDialog(null, "비밀번호가 너무 짧습니다.");
						passwordTF.requestFocus();
						passwordTF.setSelectionStart(0);
						passwordTF.setSelectionEnd(passwordStr.length());
					}else if (isSuccess == -3) {
						JOptionPane.showMessageDialog(null, "비밀번호 생성 조건을 만족하지 못했습니다. 다시 입력해주세요.");
						passwordTF.requestFocus();
						passwordTF.setSelectionStart(0);
						passwordTF.setSelectionEnd(passwordStr.length());
					}else if (isSuccess == 2) {
						JOptionPane.showMessageDialog(null, "비밀번호 확인이 일치하지 않습니다.");
						passwordCheckTF.requestFocus();
						passwordCheckTF.setSelectionStart(0);
						passwordCheckTF.setSelectionEnd(passCheckStr.length());
					}else if (isSuccess == 0) {
						// 메인 패널로 넘어가야 함
						bookMainFrame.mainProcess();

					}

						
				} catch (Exception e1) {
					e1.printStackTrace();
					
				}
				
				
			}
		});
		confirmBtn.setBounds(337, 425, 97, 23);
		add(confirmBtn);
		
		JButton duplicationBtn = new JButton("중복확인");
		duplicationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				duplicationCheck();
			}
		});
		duplicationBtn.setBounds(405, 57, 97, 23);
		add(duplicationBtn);
		
		JLabel idConditionL = new JLabel("* 4~22자의 첫 글자 소문자로 시작,대문자와 숫자 가능 스페이스 제한 ");
		idConditionL.setForeground(Color.RED);
		idConditionL.setFont(new Font("굴림", Font.PLAIN, 10));
		idConditionL.setBounds(235, 83, 353, 15);
		add(idConditionL);
		
		JLabel passCoditionL = new JLabel("*영문자, 숫자, 특수문자 2가지 조합 시 10글자 이상, 3가지 조합 시 8글자 이상");
		passCoditionL.setForeground(Color.RED);
		passCoditionL.setFont(new Font("굴림", Font.PLAIN, 10));
		passCoditionL.setBounds(235, 133, 353, 15);
		add(passCoditionL);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(235, 108, 148, 21);
		add(passwordTF);
		
		passwordCheckTF = new JPasswordField();
		passwordCheckTF.setBounds(235, 158, 148, 21);
		add(passwordCheckTF);
		
		JLabel lblNewLabel_8 = new JLabel("BOOK RENTAL");
		lblNewLabel_8.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_8.setBounds(230, 21, 234, 15);
		add(lblNewLabel_8);
		
		/*************Service객체생성*************/
		memberService=new BookMemberService();
		/*****************************************/

	}
	
	public void duplicationCheck() {
		String idStr = idTF.getText();
		if(idStr.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
			idTF.requestFocus();
			return;
		}
		
		boolean isExist;
		try {
			isExist = memberService.isExistedId(idStr);
			if(!isExist) {
				JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
				isDuplicationCheck = true;
				return;
				
			}else {
				JOptionPane.showMessageDialog(null, "이미 존재하는 아이디입니다.");
				idTF.requestFocus();
				idTF.setSelectionStart(0);
				idTF.setSelectionEnd(idStr.length());
				return;
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void setEmpty() {
		idTF.setText("");
		passwordTF.setText("");
		passwordCheckTF.setText("");
		nameTF.setText("");
		birthdayTF.setText("");
		phone2TF.setText("");
		phone3TF.setText("");
		email1TF.setText("");
		phone1CB.setSelectedIndex(0);
		email2CB.setSelectedIndex(0);
		
	}
	
	public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.bookMainFrame = bookMainFrame;
		
	}
}
