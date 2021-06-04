package com.itwill.prm.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.prm.service.MemberService;
import com.itwill.prm.service.MemberUpdateService;
import com.itwill.prm.vo.Members;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;

public class MemberUpdateDialog extends JDialog {

	private MainJFrame mainJFrame;
	private Members member;
	private MemberUpdateService memberUpdateService;
	private JPanel label;
	private JLabel update_member_name;
	private JLabel update_member_no;
	private JLabel update_member_address;
	private JLabel update_member_password;
	private JButton cancle;
	private JTextField addressTF;
	private JTextField passwordTF;
	private JTextField membernoTF;
	private JButton updateBtn;
	private JTextField nameTF;
	private JButton overChkBtn;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			MemberUpdateDialog dialog = new MemberUpdateDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Create the dialog.
	 * @param mainJFrame2 
	 */
	public MemberUpdateDialog(MainJFrame mainJFrame2) {
		setJFrame(mainJFrame2);

		memberUpdateService = new MemberUpdateService();

		getContentPane().setBackground(Color.WHITE);
		getContentPane().setForeground(Color.BLACK);
		setForeground(Color.BLACK);
		setTitle("회원정보수정");
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 584, 32);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(" | 회원정보 수정");
		lblNewLabel.setBounds(0, 0, 178, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(lblNewLabel);

		label = new JPanel();
		label.setLayout(null);
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(0, 20, 584, 391);
		getContentPane().add(label);

		update_member_name = new JLabel("이름");
		update_member_name.setFont(new Font("굴림", Font.PLAIN, 14));
		update_member_name.setBounds(74, 53, 57, 36);
		label.add(update_member_name);

		update_member_no = new JLabel("사원 번호");
		update_member_no.setFont(new Font("굴림", Font.PLAIN, 14));
		update_member_no.setBounds(74, 99, 67, 27);
		label.add(update_member_no);

		update_member_address = new JLabel("이메일");
		update_member_address.setFont(new Font("굴림", Font.PLAIN, 14));
		update_member_address.setBounds(74, 197, 57, 19);
		label.add(update_member_address);

		update_member_password = new JLabel("비밀번호");
		update_member_password.setFont(new Font("굴림", Font.PLAIN, 14));
		update_member_password.setBounds(74, 259, 57, 19);
		label.add(update_member_password);

		// 취소
		cancle = new JButton("취소");
		cancle.setBackground(new Color(224, 255, 255));
		cancle.setBounds(495, 346, 77, 21);
		cancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});
		label.add(cancle);

		addressTF = new JTextField();
		addressTF.setColumns(10);
		addressTF.setBounds(259, 193, 209, 27);
		label.add(addressTF);

		passwordTF = new JTextField();
		passwordTF.setColumns(10);
		passwordTF.setBounds(259, 255, 209, 27);
		label.add(passwordTF);

		membernoTF = new JTextField(member.getMember_no()+" ");
		membernoTF.setFont(new Font("굴림", Font.PLAIN, 14));
		membernoTF.setEditable(false);
		membernoTF.setColumns(10);
		membernoTF.setBounds(259, 99, 126, 27);
		label.add(membernoTF);

		// 수정
		updateBtn = new JButton("수정");
		updateBtn.setEnabled(false);
		updateBtn.setBackground(new Color(224, 255, 255));
		updateBtn.setBounds(406, 346, 77, 21);

		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Members members = new Members();
				String chkId = addressTF.getText();
				String chkPass = passwordTF.getText();
				
				System.out.println("chkId = "+chkId +"// chkPassWord = " +chkPass);
				
				String old_id = member.getMember_id();
				String old_pass = member.getMember_password();
				
				System.out.println("old_id = "+old_id +"// old_pass = " +old_pass);
				
				if(chkId.equals(old_id)&& chkPass.equals(old_pass)) {
					JOptionPane.showMessageDialog(null, "수정 된 내역이 없습니다.");
					return;
				}
				
				try {
					
					System.out.println("member.getMember_no() = "+member.getMember_no());
					
					members.setMember_id(chkId);
					members.setMember_password(chkPass);
					members.setMember_no(member.getMember_no());
					
					memberUpdateService.updateId_Pw(members);
					
					JOptionPane.showMessageDialog(null, "수정되었습니다.");
					
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		label.add(updateBtn);

		nameTF = new JTextField(member.getMember_name());
		nameTF.setFont(new Font("굴림", Font.PLAIN, 14));
		nameTF.setEditable(false);
		nameTF.setColumns(10);
		nameTF.setBounds(259, 57, 126, 30);
		label.add(nameTF);

		// 중복확인
		overChkBtn = new JButton("중복체크");
		overChkBtn.setBackground(new Color(224, 255, 255));
		overChkBtn.setBounds(475, 195, 97, 23);
		overChkBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String addressStr = addressTF.getText();

				if (addressStr.trim().equals("")) {

					JOptionPane.showMessageDialog(null, "이메일을 입력하세요");

					addressTF.setText("");
					addressTF.requestFocus();

					return;

				} else {

					// 이메일 형식구분
					String pattern = "^[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

					System.out.println(Pattern.matches(pattern, addressStr.trim()));
					/*
					 * if() {
					 * 
					 * }else {
					 * 
					 * }
					 */
				}

				try {
					boolean result = memberUpdateService.selectOverChk(addressStr);

					if (result == true) {
						// 중복된 이메일 없음
						JOptionPane.showMessageDialog(null, "사용가능한 이메일 입니다.");

						boolean members = memberUpdateService.selectOverChk(addressStr);
						System.out.println(members);

					} else if (result == false) {
						// 중복된 이메일이 존재함
						JOptionPane.showMessageDialog(null, "중복된 이메일 입니다.");

						addressTF.requestFocus();
						addressTF.setSelectionStart(0);
						addressTF.setSelectionEnd(addressStr.length());

					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		label.add(overChkBtn);
	}

	public void setJFrame(MainJFrame mainJFrame) {
		this.mainJFrame = mainJFrame;
		this.member = mainJFrame.member;
		System.out.println(member.getMember_no());
	}
}