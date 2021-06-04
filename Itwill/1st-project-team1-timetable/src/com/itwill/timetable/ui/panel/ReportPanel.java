package com.itwill.timetable.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.itwill.timetable.service.ReportService;
import com.itwill.timetable.ui.TimeMainFrame;
import com.itwill.timetable.vo.Lecture;
import com.itwill.timetable.vo.Report;
import java.awt.FlowLayout;
import java.awt.Font;

public class ReportPanel extends JPanel {
	ReportService reportService;
	private JTable table;
	private JTextField reportNameTF;
	private JTextField timeLimitTF;
	private JButton reportAddBtn;
	private JButton reportUpdateBtn;
	private JButton reportDeleteBtn;
	private JButton backBtn;
	private DefaultTableModel model;
	TimeMainFrame timeMainFrame;
	Lecture lecture;
	private JPanel panel_3;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public ReportPanel() throws Exception {
		reportService = new ReportService();
		setBackground(new Color(255, 255, 224));
		setPreferredSize(new Dimension(750, 530));
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		String[] colNames = new String[] { "과제번호", "과제명", "제출기한", "D-DAY" };
		model = new DefaultTableModel(colNames, 0) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table = new JTable(model);
		scrollPane.setViewportView(table);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 192, 203));
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 235, 215));
		panel.add(panel_1);

		JLabel reportNameL = new JLabel("과제명");
		reportNameL.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel_1.add(reportNameL);

		reportNameTF = new JTextField();
		panel_1.add(reportNameTF);
		reportNameTF.setColumns(10);

		JLabel timeLimitL = new JLabel("제출기한(yyyy-MM-dd)");
		timeLimitL.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel_1.add(timeLimitL);

		timeLimitTF = new JTextField();
		timeLimitTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (reportNameTF.getText().equals("")) {
					System.out.println("이름입력필요");
				} else if (timeLimitTF.getText().equals("")) {
					System.out.println("기한입력필요");
				} else {

					try {
						reportService.reportRegister(lecture, reportNameTF.getText(), timeLimitTF.getText());
						model.setNumRows(0);
						List<Report> reportList = reportService.getReportList(lecture.getLectureNumber());
						Report report = null;
						for (int i = 0; i < reportList.size(); i++) {
							report = reportList.get(i);
							String[] str = new String[4];
							str[0] = report.getReportNumber() + "";
							str[1] = report.getReportName();
							str[2] = reportService.convertSqlDateToTimeString(report.getTimeLimit());
							str[3] = reportService.calculateDoomsDay(report.getTimeLimit()) + "";

							model.addRow(str);
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					reportNameTF.setText("");
					timeLimitTF.setText("");
					reportNameTF.requestFocus();
				}
			}
		});
		panel_1.add(timeLimitTF);
		timeLimitTF.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel.add(panel_2);

		reportAddBtn = new JButton("추가");
		reportAddBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reportAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (reportNameTF.getText().equals("")) {
					System.out.println("이름입력필요");
				} else if (timeLimitTF.getText().equals("")) {
					System.out.println("기한입력필요");
				} else {

					try {
						reportService.reportRegister(lecture, reportNameTF.getText(), timeLimitTF.getText());
						model.setNumRows(0);
						List<Report> reportList = reportService.getReportList(lecture.getLectureNumber());
						Report report = null;
						for (int i = 0; i < reportList.size(); i++) {
							report = reportList.get(i);
							String[] str = new String[4];
							str[0] = report.getReportNumber() + "";
							str[1] = report.getReportName();
							str[2] = reportService.convertSqlDateToTimeString(report.getTimeLimit());
							str[3] = reportService.calculateDoomsDay(report.getTimeLimit()) + "";

							model.addRow(str);
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					reportNameTF.setText("");
					timeLimitTF.setText("");
					reportNameTF.requestFocus();

				}
			}
		});
		panel_2.add(reportAddBtn);

		reportUpdateBtn = new JButton("수정");
		reportUpdateBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reportUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = table.getSelectedRow();

				if (rowIndex == -1)
					return;

				int i = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
				model.setValueAt(reportNameTF.getText(), rowIndex, 1);
				model.setValueAt(timeLimitTF.getText(), rowIndex, 2);
				model.setValueAt(reportService.calculateDoomsDay(
						reportService.convertTimeStringToSqlDate(timeLimitTF.getText())), rowIndex, 3);

				try {
					reportService.reportUpdate(new Report(lecture.getLectureNumber(), i, reportNameTF.getText(),
							reportService.convertTimeStringToSqlDate(timeLimitTF.getText())));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				reportNameTF.setText("");
				timeLimitTF.setText("");
				reportNameTF.requestFocus();
			}
		});
		panel_2.add(reportUpdateBtn);

		reportDeleteBtn = new JButton("삭제");
		reportDeleteBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reportDeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = table.getSelectedRow();

				if (rowIndex == -1)
					return;

				int i = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());

				try {
					reportService.reportDelete(i);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				model.removeRow(rowIndex);
			}
		});
		panel_2.add(reportDeleteBtn);

		backBtn = new JButton("돌아가기");
		backBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					timeMainFrame.backToLecture();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_2.add(backBtn);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(176, 224, 230));
		add(panel_3, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("과제관리");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		panel_3.add(lblNewLabel);

	}

	public void reportListByLecture(Lecture lecture) throws Exception {
		reportService = new ReportService();
		this.lecture = lecture;
		model.setNumRows(0);
		List<Report> reportList = reportService.getReportList(lecture.getLectureNumber());
		Report report = null;
		for (int i = 0; i < reportList.size(); i++) {
			report = reportList.get(i);
			String[] str = new String[4];
			str[0] = report.getReportNumber() + "";
			str[1] = report.getReportName();
			str[2] = reportService.convertSqlDateToTimeString(report.getTimeLimit());
			str[3] = reportService.calculateDoomsDay(report.getTimeLimit()) + "";

			model.addRow(str);

		}
	}

	public void setTimeMainFrame(TimeMainFrame timeMainFrame) {
		this.timeMainFrame = timeMainFrame;
	}

	public void setLecture(Lecture lecture2) {
		// TODO Auto-generated method stub
		
	}
}
