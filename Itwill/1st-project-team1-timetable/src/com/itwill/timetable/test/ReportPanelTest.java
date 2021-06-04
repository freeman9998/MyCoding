package com.itwill.timetable.test;
/*package com.itwill.timetable.test;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.timetable.service.ReportService;
import com.itwill.timetable.ui.Panel.ReportPanel;
import com.itwill.timetable.ui.Panel.ReportTestPanel;
import com.itwill.timetable.vo.Lecture;
import com.itwill.timetable.vo.Report;

public class ReportPanelTest extends JFrame {

	private JPanel contentPane;
	private JPanel base;
	private ReportPanel reportPanel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private ReportTestPanel reportTestPanel;
	Lecture selectLecture;
	ReportService reportService;

	*//**
		* Launch the application.
		*/
/*
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
	public void run() {
		try {
			ReportPanelTest frame = new ReportPanelTest();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
});
}

*//**
	* Create the frame.
	*//*
		public ReportPanelTest() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		base = new JPanel();
		contentPane.add(base, BorderLayout.CENTER);
		base.setLayout(new CardLayout(0, 0));
		
		reportTestPanel = new ReportTestPanel();
		reportTestPanel.setReportPanelTest(this);
		base.add(reportTestPanel, "reportTestPanel");
		
		reportPanel = new ReportPanel();
		base.add(reportPanel, "reportPanel");
		
		}
		
		public void lectureManage(Lecture lecture) throws Exception {
		reportPanel.reportListByLecture(lecture);
		CardLayout cl = (CardLayout) base.getLayout();
		cl.show(base, "reportPanel");
		}
		
		}
		*/