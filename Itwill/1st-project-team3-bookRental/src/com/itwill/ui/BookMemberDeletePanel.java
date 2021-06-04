package com.itwill.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import com.itwill.service.BookMemberService;
import com.itwill.vo.BookMember;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BookMemberDeletePanel extends JPanel {
	private JPasswordField passwordCheckTF;
	
	/************메인 호출************/
	BookMainFrame bookMainFrame;
	/*************Service객체선언*************/
	BookMemberService memberService;
	/*******************************/
	BookMember bookMember; 
	private JButton ConfirmBtn;
	private JButton CancleBtn;
	private JLabel lblNewLabel_1;
	
	/**
	 * Create the panel.
	 */
	public BookMemberDeletePanel() {
		setLayout(null);
		setBackground(new Color(230, 230, 250));
		
		JLabel label = new JLabel("비밀번호 확인");
		label.setBounds(133, 209, 104, 15);
		add(label);
		
		passwordCheckTF = new JPasswordField();
		passwordCheckTF.setBounds(297, 206, 161, 21);
		add(passwordCheckTF);
		
		JLabel lblNewLabel = new JLabel("* 탈퇴된 회원정보는 복구할 수 없습니다.");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(297, 237, 261, 21);
		add(lblNewLabel);
		
		ConfirmBtn = new JButton("확인");
		ConfirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] passCheckChars=passwordCheckTF.getPassword();
				String passCheckStr=new String(passCheckChars);
				
				try {
					int isSuccess = -9999;
					bookMember =bookMainFrame.loginMember;
					isSuccess = memberService.memberUnRegister(bookMember, passCheckStr);
					
					if(isSuccess == -1) {
						JOptionPane.showMessageDialog(null, "비밀번호를 다시 입력해주세요.");
						passwordCheckTF.requestFocus();
						passwordCheckTF.setSelectionStart(0);
						passwordCheckTF.setSelectionEnd(passCheckStr.length());
					}else {
						JOptionPane.showMessageDialog(null, "탈퇴되었습니다.");
						bookMainFrame.logoutProcess();
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		ConfirmBtn.setBounds(140, 335, 97, 23);
		add(ConfirmBtn);
		
		CancleBtn = new JButton("닫기");
		CancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bookMainFrame.updateclose();
			}
		});
		CancleBtn.setBounds(349, 335, 97, 23);
		add(CancleBtn);
		
		lblNewLabel_1 = new JLabel("BOOK RENTAL");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(215, 104, 161, 34);
		add(lblNewLabel_1);
		
		/*************Service객체생성*************/
		memberService=new BookMemberService();
		/*****************************************/

	}

	public void setEmpty() {
		passwordCheckTF.setText("");
	}
	public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.bookMainFrame = bookMainFrame;
		
	}
}
