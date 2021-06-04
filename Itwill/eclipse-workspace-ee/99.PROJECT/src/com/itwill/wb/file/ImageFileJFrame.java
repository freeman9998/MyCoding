package com.itwill.wb.file;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ImageFileJFrame extends JFrame {

	private JPanel contentPane;
	private JLabel imageL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageFileJFrame frame = new ImageFileJFrame();
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
	public ImageFileJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image\\default1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(null);
		
		imageL = new JLabel("");
		imageL.setIcon(new ImageIcon("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image\\album.jpg"));
		imageL.setBounds(39, 25, 549, 335);
		mainPanel.add(imageL);
		
		JButton imageSelectBtn = new JButton("이미지선택");
		imageSelectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc=new JFileChooser("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image");
				/*
				 * 파일선택기가뜨고 쓰레드대기
				 */
				int openOrCancle =  jfc.showOpenDialog(ImageFileJFrame.this);
				if(openOrCancle==JFileChooser.APPROVE_OPTION) {
					//열기
					File selectedFile = jfc.getSelectedFile();
					imageL.setIcon(new ImageIcon(selectedFile.getAbsolutePath()));
				}
				
				
			}
		});
		imageSelectBtn.setIcon(new ImageIcon("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image\\w.png"));
		imageSelectBtn.setBounds(182, 382, 269, 53);
		mainPanel.add(imageSelectBtn);
	}

}
