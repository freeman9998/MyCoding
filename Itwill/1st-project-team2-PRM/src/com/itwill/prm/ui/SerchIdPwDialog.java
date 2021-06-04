package com.itwill.prm.ui;

import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.prm.service.SerchIdPwService;
import com.itwill.prm.vo.Members;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;


public class SerchIdPwDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField memberNo2TF;
	private JTextField memberEmailTF;
	private JTextField memberNo1TF;
	
	/*************Service객체선언*************/
	SerchIdPwService serchIdPwService;
	/*****************************************/
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		try {
			SerchIdPwDialog dialog = new SerchIdPwDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Create the dialog.
	 */
	public SerchIdPwDialog() {
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
	
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel(" | 계정찾기");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("궁서", Font.BOLD, 27));
		panel.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel = new JLabel("아이디 찾기");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(254, 10, 97, 34);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("비번 찾기");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(Color.BLACK);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
			lblNewLabel_1.setBounds(254, 129, 97, 34);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("사원번호");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_2.setForeground(Color.BLACK);
			lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
			lblNewLabel_2.setBounds(67, 168, 83, 34);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("이메일");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_3.setForeground(Color.BLACK);
			lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 16));
			lblNewLabel_3.setBounds(67, 221, 83, 32);
			contentPanel.add(lblNewLabel_3);
		}
		
		memberNo2TF = new JTextField();
		memberNo2TF.setBounds(172, 173, 262, 27);
		contentPanel.add(memberNo2TF);
		memberNo2TF.setColumns(10);
		
		memberEmailTF = new JTextField();
		memberEmailTF.setBounds(172, 225, 262, 27);
		contentPanel.add(memberEmailTF);
		memberEmailTF.setColumns(10);
		
		memberNo1TF = new JTextField();
		memberNo1TF.setBounds(172, 42, 262, 34);
		contentPanel.add(memberNo1TF);
		memberNo1TF.setColumns(10);
		
		JButton idFindBtn = new JButton("찾기");
		idFindBtn.setForeground(Color.BLACK);
		idFindBtn.setBackground(new Color(224, 255, 255));
		idFindBtn.setFont(new Font("굴림", Font.BOLD, 14));
		idFindBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//##### 입력받은 사원번호로 사원의 이메일 정보 출력 #####
				String noStr = memberNo1TF.getText();
				/********************유효성체크*******************/
				if(noStr.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "사원번호를 입력하세요");
					memberNo1TF.requestFocus();
					return;
				}
				/********************유효성체크*******************/
				int noInt = Integer.parseInt(noStr) ;
				try {
					boolean isSuccess = serchIdPwService.isExistedId(noInt);
					if(isSuccess) {
						
						Members memberIDPW = serchIdPwService.findById(noInt);
						String emailStr = memberIDPW.getMember_id();
						JOptionPane.showMessageDialog(null, "사원번호 " + noInt + "의 이메일은 " + emailStr + " 입니다.");	
						memberNo2TF.setText(noStr);
						memberEmailTF.setText(emailStr);
						memberEmailTF.requestFocus();
						
						//dispose();	
					}else {
						JOptionPane.showMessageDialog(null, "존재하지 않는 사원번호 "+ noStr + " 입니다.");
						memberNo1TF.requestFocus();
						memberNo1TF.setSelectionStart(0);
						memberNo1TF.setSelectionEnd(noStr.length());
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		idFindBtn.setBounds(172, 96, 97, 23);
		contentPanel.add(idFindBtn);
		
		JButton idFindCancelBtn = new JButton("취소");
		idFindCancelBtn.setForeground(Color.BLACK);
		idFindCancelBtn.setBackground(new Color(224, 255, 255));
		idFindCancelBtn.setFont(new Font("굴림", Font.BOLD, 14));
		idFindCancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		idFindCancelBtn.setBounds(337, 96, 97, 23);
		contentPanel.add(idFindCancelBtn);
		
		JButton pwFindBtn = new JButton("찾기");
		pwFindBtn.setForeground(Color.BLACK);
		pwFindBtn.setBackground(new Color(224, 255, 255));
		pwFindBtn.setFont(new Font("굴림", Font.BOLD, 14));
		pwFindBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//##### 입력한 사원번호와 사원의 이메일을 입력받아 사원의 패스워드 출력 #####
				String noStr = memberNo2TF.getText(); 
				String emailStr =  memberEmailTF.getText();
				String pattern = "^[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
				boolean email = Pattern.matches(pattern, emailStr.trim());
				/********************유효성체크*******************/
				if(noStr.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "사원번호를 입력하세요");
					memberNo2TF.requestFocus();
					return;
				}else if(emailStr.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 입력하세요");
					memberEmailTF.requestFocus();
					return;	
				}else if(!email) {
					memberEmailTF.setText("");
					JOptionPane.showMessageDialog(null, "올바른 형식이 아닙니다");
					memberEmailTF.requestFocus();
					return;
				}
					
				/********************유효성체크*******************/
				int noInt = Integer.parseInt(memberNo2TF.getText());
				try {
					Members memberIDPW	= serchIdPwService.findById(noInt);
					if(memberIDPW==null) {
						JOptionPane.showMessageDialog(null, "사원번호 " + noInt + " 는 존재하지 않습니다.");
						memberNo2TF.requestFocus();
						return;
					}
					if(emailStr.equals(memberIDPW.getMember_id())) {
						JOptionPane.showMessageDialog(null, "비밀번호는 " + memberIDPW.getMember_password() + " 입니다.");
					}
						
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		pwFindBtn.setBounds(172, 282, 97, 23);
		contentPanel.add(pwFindBtn);
		
		JButton pwFindCancelBtn = new JButton("취소");
		pwFindCancelBtn.setForeground(Color.BLACK);
		pwFindCancelBtn.setBackground(new Color(224, 255, 255));
		pwFindCancelBtn.setFont(new Font("굴림", Font.BOLD, 14));
		pwFindCancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		pwFindCancelBtn.setBounds(337, 282, 97, 23);
		contentPanel.add(pwFindCancelBtn);
		
		JLabel lblNewLabel_4 = new JLabel("사원번호");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_4.setBounds(67, 46, 83, 23);
		contentPanel.add(lblNewLabel_4);
		
		/*************Service객체생성*************/
		serchIdPwService = new SerchIdPwService();
		/*****************************************/
	}
}