package com.itwill.wb.optionpane;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JOptionPaneJFrame extends JFrame {

	private JPanel contentPane;
	private JLabel displayL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneJFrame frame = new JOptionPaneJFrame();
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
	public JOptionPaneJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton optionBtn = new JButton("option");
		optionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options= {"1인용","2인용"};
				int result=JOptionPane.showOptionDialog(null,
						"게임을선택하세요",
						"게임",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[0]
						);
				if(result== 0) {
					displayL.setText("1인용");
				}else if(result==1) {
					displayL.setText("2인용");
				}else if(result == -1) {
					displayL.setText("선택안하고 다이알로그닫기");
				}
				
			}
		});
		optionBtn.setBounds(23, 256, 97, 23);
		contentPane.add(optionBtn);
		
		JButton messageBtn = new JButton("message");
		messageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "에러발생","타이틀",JOptionPane.WARNING_MESSAGE);
			}
		});
		messageBtn.setBounds(148, 256, 97, 23);
		contentPane.add(messageBtn);
		
		JButton confirmBtn = new JButton("confirm");
		confirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, 
						"삭제하시겠습니까?",
						"삭제",
						JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.YES_OPTION) {
					displayL.setText("마구마구삭제");
				}else if(result==JOptionPane.NO_OPTION) {
					displayL.setText("아무일도없던것처럼~~~");
					
				}
				
			}
		});
		confirmBtn.setBounds(281, 256, 97, 23);
		contentPane.add(confirmBtn);
		
		JButton inputBtn = new JButton("input");
		inputBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=JOptionPane.showInputDialog("이름을 입력하세요");
				displayL.setText(name);
				
				Integer[] ages= {10,20,30,40,50};
				Object age = JOptionPane.showInputDialog(
						null,
						"나이대를 입력하세요",
						"나이",
						JOptionPane.INFORMATION_MESSAGE,
						null,
						ages,
						ages[2]);
				
				displayL.setText(age+"");
				
			}
		});
		inputBtn.setBounds(427, 256, 97, 23);
		contentPane.add(inputBtn);
		
		displayL = new JLabel("");
		displayL.setFont(new Font("D2Coding", Font.BOLD, 23));
		displayL.setHorizontalAlignment(SwingConstants.CENTER);
		displayL.setBounds(12, 10, 522, 203);
		contentPane.add(displayL);
	}

}
