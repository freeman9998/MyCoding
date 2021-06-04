package com.itwill.prm.ui;

import javax.swing.JPanel;
import javax.swing.UIManager;

import com.itwill.prm.service.LoginService;
import com.itwill.prm.vo.Members;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;

public class LoginPagePanel extends JPanel {
	private JTextField idTF;
	private JButton findIdPwBtn;
	private JPasswordField passwordTF;

	LoginService loginService;
	
	MainJFrame mainJFrame;
	private JButton loginBtn;
	
	/**
	 * Create the panel.
	 */
	public LoginPagePanel() {
		setBackground(UIManager.getColor("Button.light"));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		panel.setLayout(null);
		
		JLabel logoL = new JLabel("");
		logoL.setIcon(new ImageIcon("C:\\JAVA_BACKEND\\elipse_workspace_ee\\1st-project-team2-PRM\\src\\com\\itwill\\prm\\ui\\logo.png"));
		logoL.setBounds(226, 25, 135, 189);
		panel.add(logoL);
		
		idTF = new JTextField();
		idTF.addMouseListener(new MouseAdapter() {
			/*
			 * idTF 마우스클릭하면 TF초기화되어 바로 입력가능하다.
			 */
			public void mouseClicked(MouseEvent e) {
				idTF.setText("");
			}
		});
		idTF.setFont(new Font("D2Coding ligature", Font.PLAIN, 12));
		idTF.setText("아이디(이메일)을 입력해주세요.");
		idTF.setBounds(146, 220, 298, 37);
		panel.add(idTF);
		idTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.addMouseListener(new MouseAdapter() {
			/*
			 * passwordTF 마우스클릭하면 TF초기화되어 바로 입력가능하다.
			 */
			public void mouseClicked(MouseEvent e) {
				passwordTF.setText("");
			}
		});
		passwordTF.setText("*****");
		passwordTF.setToolTipText("");
		passwordTF.setFont(new Font("D2Coding ligature", Font.PLAIN, 15));
		passwordTF.setBounds(146, 267, 298, 37);
		panel.add(passwordTF);
		
		findIdPwBtn = new JButton("아이디 / 비밀번호 찾기");
		findIdPwBtn.setForeground(Color.BLACK);
		findIdPwBtn.addActionListener(new ActionListener() {
				/*
				 * 버튼 누르면 아이디.비번찾기 창으로 이동
				 */
			public void actionPerformed(ActionEvent e) {
				SerchIdPwDialog serchIdPwDialog = new SerchIdPwDialog();
				serchIdPwDialog.setModal(true);
				serchIdPwDialog.setVisible(true);	
			}
		});
		
		findIdPwBtn.setBackground(new Color(224, 255, 255));
		findIdPwBtn.setFont(new Font("굴림", Font.BOLD, 13));
		findIdPwBtn.setBounds(247, 314, 200, 20);
		panel.add(findIdPwBtn);
		
		loginBtn = new JButton("로그인");
		loginBtn.setFont(new Font("굴림", Font.BOLD, 12));
		loginBtn.addActionListener(new ActionListener() {
			/*
			 * idTF,passwordTF입력 후 로그인 버튼 누르면 유효성 검사를 통해 로그인 성공,실패
			 * - 아무것도 입력되지 않은 상태라면 "아이디와 패스워드를 입력하세요" 메세지 창뜨고 idTF에 커서포커스
			 * - 아이디가 이메일 형식이 아니라면 "올바른 형식이 아닙니다" 메세지 창뜨고 idTF에 커서포커스
			 * - 아이디를 잘못 입력했다면 "없는 아이디입니다" 메세지 창뜨고 idTF 입력내용 드래그
			 * - 패스워드를 잘못 입력했다면 "패스워드가 일치하지 않습니다" 메세지 창뜨고 passwordTF 입력내용 드래그
			 * - 아이디, 패스워드 제대로 입력했다면 로그인 성공 메세지 창 뜨고 메인페이지로 이동
			 */
			public void actionPerformed(ActionEvent e) {
				String idStr = idTF.getText();
				char[] passwordChars = passwordTF.getPassword();
				String passwordStr = new String(passwordChars);
				
				String pattern = "^[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
				boolean email = Pattern.matches(pattern, idStr.trim());
				
				if(idStr.trim().equals("") || idStr.trim().equals("아이디(이메일)을 입력해주세요.") 
						|| passwordStr.trim().equals("") || passwordStr.trim().equals("●●●●●")) {
					idTF.setText("");
					passwordTF.setText("");
					JOptionPane.showMessageDialog(null, "아이디와 패스워드를 입력하세요");
					idTF.requestFocus();
					return;
				}
				if(!email) {
					idTF.setText("");
					passwordTF.setText("");
					JOptionPane.showMessageDialog(null, "올바른 형식이 아닙니다");
					idTF.requestFocus();
					return;
				}

				
				try {
					int result = loginService.loginCheck(idStr, passwordStr);
					
					if(result == 0) {
						JOptionPane.showMessageDialog(null, "로그인 성공");
					
						Members loginMember = loginService.findById(idStr);
						System.out.println(loginMember);
						idTF.setText("");
						passwordTF.setText("");
						mainJFrame.loginProcess(loginMember);
						
					}else if(result == 1) {
						JOptionPane.showMessageDialog(null, "없는 아이디입니다.");
						
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(idStr.length());
						
					}else {
						JOptionPane.showMessageDialog(null, "패스워드가 일치하지 않습니다.");
						
						passwordTF.requestFocus();
						passwordTF.setSelectionStart(0);
						passwordTF.setSelectionEnd(passwordStr.length());
					}
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		loginBtn.setForeground(new Color(0, 0, 0));
		loginBtn.setBackground(new Color(224, 255, 255));
		loginBtn.setBounds(146, 371, 97, 23);
		panel.add(loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.setFont(new Font("굴림", Font.BOLD, 12));
		joinBtn.addActionListener(new ActionListener() {
			/*
			 * 버튼 누르면 회원가입 창으로 이동
			 */
			public void actionPerformed(ActionEvent e) {
				SignUpDialog signupDialog = new SignUpDialog();
				signupDialog.setModal(true);
				signupDialog.setVisible(true);

				
			}
		});
		joinBtn.setForeground(Color.BLACK);
		joinBtn.setBackground(new Color(224, 255, 255));
		joinBtn.setBounds(347, 372, 97, 20);
		panel.add(joinBtn);
		
		loginService = new LoginService();
	}
	
	public void setMainJFrame(MainJFrame mainJFrame) {
		this.mainJFrame=mainJFrame;
	}
}