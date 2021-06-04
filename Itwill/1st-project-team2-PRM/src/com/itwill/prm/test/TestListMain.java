package com.itwill.prm.test;

import javax.swing.JPanel;

import com.itwill.prm.ui.MonthPayStubList;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TestListMain extends JPanel {

	/**
	 * Create the panel.
	 */
	private MonthPayStubList month;
	
	public TestListMain() {
		setLayout(new BorderLayout(0, 0));
		
		JComboBox comboBox = new JComboBox();
		add(comboBox, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton, BorderLayout.SOUTH);

	}
	
	public void setMothPayStubList(MonthPayStubList month) {
		this.month=month;
	}

}
