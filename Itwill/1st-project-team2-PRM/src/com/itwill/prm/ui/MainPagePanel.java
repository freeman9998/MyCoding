package com.itwill.prm.ui;

import javax.swing.JPanel;

import com.itwill.prm.vo.Members;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class MainPagePanel extends JPanel {
	Members member;
	MainJFrame mainJFrame;
	PayStubsPanel paystubsPanel;
	MonthPayStubList paymonthlist;
	private JPanel mainMenuPanel;
	private JLabel NameL;
	private JButton payStubsBtn;
	private JButton payStubsBtnM;
	private JButton logoutBtn;
	private JButton memberUpdateBtn;
	
	/**
	 * Create the panel.
	 */
	public MainPagePanel() {
		setLayout(new BorderLayout(0, 0));
		
		mainMenuPanel = new JPanel();
		mainMenuPanel.setBackground(Color.LIGHT_GRAY);
		add(mainMenuPanel, BorderLayout.CENTER);
		mainMenuPanel.setLayout(null);
		
		NameL = new JLabel("New label");
		NameL.setFont(new Font("굴림", Font.BOLD, 15));
		NameL.setHorizontalAlignment(SwingConstants.CENTER);
		NameL.setBounds(165, 102, 252, 15);
		mainMenuPanel.add(NameL);
		
		payStubsBtn = new JButton("명세서조회");
		payStubsBtn.setBackground(SystemColor.activeCaptionBorder);
		payStubsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainJFrame.selectPage(MainJFrame.PAYSTUB);
			}
		});
		payStubsBtn.setBounds(62, 157, 177, 181);
		mainMenuPanel.add(payStubsBtn);
		
		payStubsBtnM = new JButton("월별 명세서");
		payStubsBtnM.setBackground(SystemColor.activeCaptionBorder);
		payStubsBtnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainJFrame.selectPage(MainJFrame.PAYSTUBM);
			}
		});
		payStubsBtnM.setBounds(336, 157, 177, 181);
		mainMenuPanel.add(payStubsBtnM);
		
		logoutBtn = new JButton("로그아웃");
		logoutBtn.setBackground(new Color(224, 255, 255));
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainJFrame.selectPage(MainJFrame.LOGOUT);
			}
		});
		logoutBtn.setBounds(491, 48, 97, 23);
		mainMenuPanel.add(logoutBtn);
		
		memberUpdateBtn = new JButton("회원정보수정");
		memberUpdateBtn.setBackground(new Color(224, 255, 255));
		memberUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					mainJFrame.selectPage(MainJFrame.MEMBERUPDATE);
			}
		});
		memberUpdateBtn.setBounds(336, 48, 132, 23);
		mainMenuPanel.add(memberUpdateBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 600, 43);
		mainMenuPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" | WellCome");
		lblNewLabel.setBounds(0, 0, 600, 43);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("궁서", Font.BOLD, 30));
		lblNewLabel.setBackground(Color.DARK_GRAY);

	}
	
	public void setMainJFrame(MainJFrame mainJFrame) {
		member=mainJFrame.member;
		this.mainJFrame=mainJFrame;
		NameL.setText(member.getMember_name()+"님 환영합니다");
	}
}
