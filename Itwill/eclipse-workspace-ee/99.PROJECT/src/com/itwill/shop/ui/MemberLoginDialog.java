package com.itwill.shop.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.shop.service.MemberService;
import com.itwill.shop.vo.Member;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberLoginDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField idTF;
	private JPasswordField passwordTF;
	
	MemberMainFrame memberMainFrame;
	
	/*************Service객체선언*************/
	MemberService memberService;
	/*****************************************/
	/**
	 * Create the dialog.
	 */
	public MemberLoginDialog() {
		setTitle("로그인");
		setBounds(100, 100, 336, 201);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.PINK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(50, 28, 57, 15);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패쓰워드");
		lblNewLabel_1.setBounds(50, 78, 57, 15);
		contentPanel.add(lblNewLabel_1);
		
		idTF = new JTextField();
		idTF.setBounds(156, 25, 116, 21);
		contentPanel.add(idTF);
		idTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(156, 75, 116, 21);
		contentPanel.add(passwordTF);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.ORANGE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton loginButton = new JButton("로그인");
				loginButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String idStr = idTF.getText();
						char[] passwordChars= passwordTF.getPassword();
						String passwordStr=new String(passwordChars);
						
						if(idStr.trim().equals("") || passwordStr.trim().equals("")) {
							idTF.setText("");
							passwordTF.setText("");
							JOptionPane.showMessageDialog(null,"아이디와 패쓰워드를 입력하세요");
							idTF.requestFocus();
							return;
						}
						try {
							/*
							 * MemberService객체의 로그인 메쏘드호출
							 */
							int result = memberService.login(idStr, passwordStr);
							/*
							 * 0.성공
							 * 1.아이디존재안함
							 * 2.패쓰워드불일치
		 					 */
							if(result==0) {
								JOptionPane.showMessageDialog(null,"로그인성공");
								Member loginMember = memberService.findById(idStr);
								//MemberMainFrame에 로그인정보 넘겨주기
								memberMainFrame.loginProcess(loginMember);
								/*
								 * 1.MemberMainFrame타이틀변경
								 * 2.로그인,회원가입메뉴아이템 불활성화
								 * 3.로그아웃메뉴아이템 활성화
								 */
								//로그인다이알로그 닫기
								dispose();
								
							}else if(result==1) {
								JOptionPane.showMessageDialog(null,"아이디존재안함");
								
								idTF.requestFocus();
								idTF.setSelectionStart(0);
								idTF.setSelectionEnd(idStr.length());
								
							}else {
								JOptionPane.showMessageDialog(null,"패쓰워드불일치");
								
								passwordTF.requestFocus();
								passwordTF.setSelectionStart(0);
								passwordTF.setSelectionEnd(passwordStr.length());
							}
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
						
						
					}
				});
				loginButton.setActionCommand("OK");
				buttonPane.add(loginButton);
				getRootPane().setDefaultButton(loginButton);
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
	}
	
	public void setMemberMainFrame(MemberMainFrame memberMainFrame) {
		this.memberMainFrame=memberMainFrame;
		
	}
}
