package com.itwill.prm.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.prm.service.SignUpService;
import com.itwill.prm.vo.Members;
import com.sun.jndi.cosnaming.IiopUrl.Address;

import jdk.nashorn.internal.ir.CatchNode;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class SignUpDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField numberTF;
	private JTextField emailTF;
	private JPasswordField passwordTF;
	
	SignUpService signUpService;
	private JButton okButton;
	private JPanel panel;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		try {
			SignUpDialog dialog = new SignUpDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the dialog.
	 */
	public SignUpDialog() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("사원번호");
		lblNewLabel_1.setBounds(36, 58, 120, 33);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이메일");
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(36, 146, 120, 33);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호");
		lblNewLabel_3.setBounds(36, 235, 120, 33);
		contentPanel.add(lblNewLabel_3);
		
		numberTF = new JTextField();
		numberTF.setBounds(152, 64, 116, 21);
		contentPanel.add(numberTF);
		numberTF.setColumns(10);
		
		emailTF = new JTextField();
		emailTF.setBounds(152, 152, 116, 21);
		contentPanel.add(emailTF);
		emailTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(152, 241, 116, 21);
		contentPanel.add(passwordTF);
		
		JButton numberCheckButton = new JButton("인증");
		numberCheckButton.setBackground(new Color(224, 255, 255));
		numberCheckButton.addActionListener(new ActionListener() {
			/*
			 * 입력하지 않은 상태에서 인증버튼을 누르면 입력하라는 메세지 창이 뜸
			 *  DB에 저장되어있는 사원번호를 입력하면 "인증 되었습니다." 메세지 창이 뜸
			 *  DB에 저장되어있지않은 사원번호를 입력하면 "존재하지 않는 사원입니다." 메세지 창이 뜸
			 */
			public void actionPerformed(ActionEvent e) {
				String noStr = numberTF.getText();
				if(noStr.trim().equals("")) {
					numberTF.setText("");
					JOptionPane.showMessageDialog(null, "사원번호를 입력하세요.");
					numberTF.requestFocus();
					return;
					
				}else{
					try {
						if(signUpService.isExistedId(Integer.valueOf(noStr))){
							JOptionPane.showMessageDialog(null, "인증 되었습니다.");
						}else {
							JOptionPane.showMessageDialog(null, "존재하지 않는 사원입니다.");
						}
						okButton.setEnabled(true);
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					numberTF.requestFocus();
					return;
				}
		
		
			}
		});
		
		numberCheckButton.setBounds(321, 63, 97, 23);
		contentPanel.add(numberCheckButton);
		
		JButton emailCheckButton = new JButton("중복체크");
		emailCheckButton.setBackground(new Color(224, 255, 255));
		emailCheckButton.addActionListener(new ActionListener() {
			/*
			 * 입력하지 않은 상태에서 중복체크 버튼을 누르면 입력하라는 창이 뜸
			 * DB에 저장되어있는 이메일 중복체크 
			 */
			public void actionPerformed(ActionEvent e) {
				
				String emailStr = emailTF.getText();
				String pattern = "^[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
				boolean email = Pattern.matches(pattern, emailStr.trim());

		
				if(emailStr.trim().equals("")) {
					emailTF.setText("");
					JOptionPane.showMessageDialog(null, "이메일을 입력하세요.");
					emailTF.requestFocus();
					return;
				}
				if(!email) {
					emailTF.setText("");
					JOptionPane.showMessageDialog(null, "올바른 형식이 아닙니다.");
					emailTF.requestFocus();
					return;
				}
				
				try {

					boolean checkId = signUpService.selectOverchk(emailStr);
					
					if(checkId) {
						JOptionPane.showMessageDialog(null, "사용가능한 이메일입니다.");
						
					}else {
						JOptionPane.showMessageDialog(null, "중복된 이메일입니다.");
						emailTF.setText("");
						emailTF.requestFocus();
				
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		      
			
		emailCheckButton.setBounds(321, 151, 97, 23);
		contentPanel.add(emailCheckButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.LIGHT_GRAY);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
				okButton = new JButton("가입");
				okButton.setBackground(new Color(224, 255, 255));
				okButton.setEnabled(false);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int noStr = Integer.valueOf(numberTF.getText());
						String emailStr = emailTF.getText();
						char[] passChars=passwordTF.getPassword();						
						String passwordStr = new String(passChars);
						try {
							int result = signUpService.updateId_Pw(emailStr,passwordStr,noStr);
							if(result==1) {
								 JOptionPane.showMessageDialog(null, "가입에 성공하셨습니다");
								 dispose();
							 }else if(result>=0) {
								 JOptionPane.showMessageDialog(null, "가입에 실패했습니다.");
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
				cancelButton.setBackground(new Color(224, 255, 255));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(5, 10));
		
		JLabel lblNewLabel = new JLabel("| 회원가입");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lee\\Desktop\\KakaoTalk_20210208_113259490.png"));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		signUpService = new SignUpService();
	}
}