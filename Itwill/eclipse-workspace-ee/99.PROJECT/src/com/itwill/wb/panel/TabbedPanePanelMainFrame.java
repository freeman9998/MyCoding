package com.itwill.wb.panel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;

public class TabbedPanePanelMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabbedPanePanelMainFrame frame = new TabbedPanePanelMainFrame();
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
	public TabbedPanePanelMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(175, 238, 238));
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		mainPanel.add(tabbedPane, BorderLayout.CENTER);
		
		FirstPanel firstPanel = new FirstPanel();
		tabbedPane.addTab("first", null, firstPanel, null);
		
		SecondPanel secondPanel = new SecondPanel();
		tabbedPane.addTab("second", null, secondPanel, null);
		
		ThirdPanel thirdPanel = new ThirdPanel();
		tabbedPane.addTab("third", null, thirdPanel, null);
		
		FourthPanel fourthPanel = new FourthPanel();
		tabbedPane.addTab("fourth", null, fourthPanel, null);
		
		tabbedPane.setSelectedIndex(3);
		
	}

}
