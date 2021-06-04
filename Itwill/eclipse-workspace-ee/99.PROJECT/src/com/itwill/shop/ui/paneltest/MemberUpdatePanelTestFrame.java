package com.itwill.shop.ui.paneltest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.itwill.shop.ui.MemberUpdatePanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUpdatePanelTestFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberUpdatePanelTestFrame frame = new MemberUpdatePanelTestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberUpdatePanelTestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		MemberUpdatePanel memberUpdatePanel = new MemberUpdatePanel();
		contentPane.add(memberUpdatePanel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(40, 35, 57, 15);
		memberUpdatePanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(217, 32, 116, 21);
		memberUpdatePanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(30, 10, 57, 15);
		memberUpdatePanel.add(lblNewLabel_1);
	}

}
