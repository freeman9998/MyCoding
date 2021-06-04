package com.itwill.shop.ui;

import javax.swing.JPanel;
import java.awt.Color;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.DateModel;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.JComboBox;

public class MemberDetailPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberDetailPanel() {
		setBackground(new Color(144, 238, 144));
		setLayout(null);
		
		UtilDateModel model = new UtilDateModel();
		model.setDate(2021, 01, 02);
		model.setSelected(true);
		JDatePanelImpl datePanelImpl = new JDatePanelImpl(model);
		JDatePickerImpl datePickerImpl = new JDatePickerImpl(datePanelImpl);
		datePickerImpl.setBounds(50, 50, 191, 23);
		add(datePickerImpl);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(57, 150, 184, 23);
		add(comboBox);
		
	}
}
