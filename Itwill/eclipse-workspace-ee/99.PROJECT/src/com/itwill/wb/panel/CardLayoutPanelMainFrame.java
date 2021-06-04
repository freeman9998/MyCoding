package com.itwill.wb.panel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardLayoutPanelMainFrame extends JFrame {

	private JPanel contentPane;
	private JPanel cardLayoutPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutPanelMainFrame frame = new CardLayoutPanelMainFrame();
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
	public CardLayoutPanelMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		cardLayoutPanel = new JPanel();
		cardLayoutPanel.setBackground(new Color(173, 255, 47));
		contentPane.add(cardLayoutPanel, BorderLayout.CENTER);
		cardLayoutPanel.setLayout(new CardLayout(0, 0));
		
		FirstPanel firstPanel = new FirstPanel();
		cardLayoutPanel.add(firstPanel, "first");
		
		SecondPanel secondPanel = new SecondPanel();
		cardLayoutPanel.add(secondPanel, "second");
		
		ThirdPanel thirdPanel = new ThirdPanel();
		cardLayoutPanel.add(thirdPanel, "third");
		
		FourthPanel fourthPanel = new FourthPanel();
		cardLayoutPanel.add(fourthPanel, "fourth");
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(new Color(135, 206, 235));
		contentPane.add(menuPanel, BorderLayout.SOUTH);
		
		JButton firstBtn = new JButton("first");
		firstBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl =(CardLayout)cardLayoutPanel.getLayout();
				cl.show(cardLayoutPanel ,"first");
			}
		});
		menuPanel.add(firstBtn);
		
		JButton secondBtn = new JButton("second");
		secondBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl =(CardLayout)cardLayoutPanel.getLayout();
				cl.show(cardLayoutPanel ,"second");
			}
		});
		menuPanel.add(secondBtn);
		
		JButton thirdBtn = new JButton("third");
		thirdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl =(CardLayout)cardLayoutPanel.getLayout();
				cl.show(cardLayoutPanel ,"third");
			}
		});
		menuPanel.add(thirdBtn);
		
		JButton fourthBtn = new JButton("fourth");
		fourthBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl =(CardLayout)cardLayoutPanel.getLayout();
				cl.show(cardLayoutPanel ,"fourth");
			}
		});
		menuPanel.add(fourthBtn);
	}

}
