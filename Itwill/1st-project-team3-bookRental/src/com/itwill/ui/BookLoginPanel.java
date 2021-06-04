package com.itwill.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.itwill.service.BookMemberService;
import com.itwill.vo.BookMember;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class BookLoginPanel extends JPanel {
	private JTextField idTF;
	private JPasswordField pwTF;
	
	
	
	BookMainFrame BookMainFrame;
	
	/*************Service객체선언*************/
	BookMemberService bookMemberService;
	/*****************************************/
	/**
	 * Create the panel.
	 */
	public BookLoginPanel() {
//		setBackground(UIManager.getColor("ScrollBar.background"));
		setBackground(new Color(230, 230, 250));
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(123, 166, 351, 33);
		lblNewLabel.setIcon(new ImageIcon(BookLoginPanel.class.getResource("/com/itwill/ui/아이디.PNG")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(123, 272, 351, 33);
		lblNewLabel_1.setFont(new Font("D2Coding", Font.PLAIN, 25));
		lblNewLabel_1.setIcon(new ImageIcon(BookLoginPanel.class.getResource("/com/itwill/ui/비밀번호.PNG")));
		
		idTF = new JTextField();
		idTF.setBounds(172, 166, 302, 33);
		idTF.setFont(new Font("D2Coding", Font.PLAIN, 25));
		idTF.setColumns(10);
		idTF.setBorder(null);
		pwTF = new JPasswordField();
		pwTF.setBounds(172, 272, 302, 33);
		pwTF.setBorder(null);
		JButton joinBtn = new JButton("회원가입");
		joinBtn.setBounds(358, 423, 97, 23);
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookMainFrame.joinProcess();
			}
		});
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.setBounds(136, 349, 319, 23);
		loginBtn.setIcon(new ImageIcon(BookLoginPanel.class.getResource("/com/itwill/ui/button.png")));
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idStr = idTF.getText();
				char[] passwordChars= pwTF.getPassword();
				String passwordStr=new String(passwordChars);
				
				if(idStr.trim().equals("") || passwordStr.trim().equals("")) {
					idTF.setText("");
					pwTF.setText("");
					JOptionPane.showMessageDialog(null,"아이디와 패쓰워드를 입력하세요");
					idTF.requestFocus();
					return;
				}
				try {
					/*
					 * MemberService객체의 로그인 메쏘드호출
					 */
					System.out.println(idStr+","+passwordStr);
					int result = bookMemberService.login(idStr, passwordStr);
					/*
					 * 0.성공
					 * 1.아이디존재안함
					 * 2.패쓰워드불일치
 					 */
					if(result==0) {
						
						
						BookMember loginMember = bookMemberService.findById(idStr);
						BookMainFrame.loginProcess(loginMember);
						idTF.setText("");
						pwTF.setText("");
						
						
					}else if(result==1) {
						JOptionPane.showMessageDialog(null,"아이디존재안함");
						
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(idStr.length());
						
					}else {
						JOptionPane.showMessageDialog(null,"패쓰워드불일치");
						
						pwTF.requestFocus();
						pwTF.setSelectionStart(0);
						pwTF.setSelectionEnd(passwordStr.length());
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		setLayout(null);
		add(lblNewLabel);
		add(lblNewLabel_1);
		add(idTF);
		add(pwTF);
		add(joinBtn);
		add(loginBtn);
		
		JLabel lblNewLabel_2 = new JLabel("BOOK RENTAL ");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(187, 81, 219, 33);
		add(lblNewLabel_2);
		
		
		/*************Service객체선언*************/
		bookMemberService = new BookMemberService();
		/*****************************************/
		
	}
	public void setBookMainFrame(BookMainFrame bookMainFrame) {
		this.BookMainFrame=bookMainFrame;
	}
}
