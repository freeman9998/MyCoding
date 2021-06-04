package com.itwill.prm.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.prm.service.PayStubsService;
import com.itwill.prm.ui.MonthPayStubList;
import com.itwill.prm.vo.PaystubsResultValue;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;

public class JDialogTest extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private PayStubsService paysubsService;
	private MonthPayStubList month;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogTest dialog = new JDialogTest();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogTest() {
		paysubsService = new PayStubsService();	
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		try {
			PaystubsResultValue paysList = paysubsService.selectByNoMM(101213,2);
			DefaultListModel defaultListModel=new  DefaultListModel();
			PaystubsResultValue paystubsResultValue=paysList;
				defaultListModel.addElement(paystubsResultValue.getMember_no());
				defaultListModel.addElement(paystubsResultValue.getHolidaywork());
				defaultListModel.addElement(paystubsResultValue.getWorkMonth());
			list.setModel(defaultListModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setMothPayStubList(MonthPayStubList month) {
		this.month=month;
	}

}
