package com.itwill.timetable.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

import com.itwill.timetable.service.LectureService;
import com.itwill.timetable.service.ReportService;
import com.itwill.timetable.service.TimeService;
import com.itwill.timetable.ui.TimeMainFrame;
import com.itwill.timetable.vo.Lecture;
import com.itwill.timetable.vo.Time;

public class LecturePanel extends JPanel {

	LectureService lectureService;
	TimeMainFrame timeMainFrame;
	TimeService timeService;
	ReportService reportService;
	Lecture lecture;
	Lecture lectureNumber;
	Time time;
	DayTimeTableViewerPanel dayTimeTableViewer;

	private JTextField lectureNameTF;
	private JTextField locationTF;
	private JTable timeTable;
	private JTextField dayTF;
	private JTextField endTimeTF;
	private DefaultTableModel model;
	private JTextField startTimeTF;
	private JTable table;
	private JButton registerBt;
	private JButton updateBt;
	private JButton reportManageBt;
	private JButton deleteBtn;

	/**
	 * Create the panel.
	 */
	public LecturePanel() throws Exception {
		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(830, 506));
		setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(117, 36, 585, 368);
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("강의명");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(106, 60, 57, 15);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("장소");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(106, 96, 57, 15);
		panel_1.add(lblNewLabel_1);

		lectureNameTF = new JTextField();
		lectureNameTF.setBounds(187, 59, 145, 21);
		panel_1.add(lectureNameTF);
		lectureNameTF.setColumns(10);

		locationTF = new JTextField();
		locationTF.setBounds(187, 95, 145, 21);
		panel_1.add(locationTF);
		locationTF.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 248, 220));
		scrollPane.setBounds(0, 187, 585, 114);
		panel_1.add(scrollPane);

		String[] colNames = new String[] { "요일", "시작시간", "종료시간" };
		model = new DefaultTableModel(colNames, 0) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table = new JTable(model);
		table.setBackground(new Color(255, 248, 220));
		scrollPane.setViewportView(table);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(230, 230, 250));
		panel_1_1.setBounds(0, 300, 585, 33);
		panel_1.add(panel_1_1);

		JLabel dayL = new JLabel("요일");
		dayL.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel_1_1.add(dayL);

		dayTF = new JTextField();
		dayTF.setColumns(10);
		panel_1_1.add(dayTF);

		JLabel startTimeL = new JLabel("시작시간");
		startTimeL.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel_1_1.add(startTimeL);

		startTimeTF = new JTextField();
		startTimeTF.setColumns(10);
		panel_1_1.add(startTimeTF);

		JLabel endTimeL = new JLabel("종료시간");
		endTimeL.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel_1_1.add(endTimeL);

		endTimeTF = new JTextField();
		endTimeTF.setColumns(10);
		panel_1_1.add(endTimeTF);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBounds(0, 335, 585, 33);
		panel_1.add(panel_2);

		JButton reportAddBtn = new JButton("시간추가");
		reportAddBtn.setBounds(97, 3, 120, 27);
		reportAddBtn.setBackground(new Color(211, 211, 211));
		reportAddBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reportAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] str = new String[3];
				str[0] = dayTF.getText();
				str[1] = startTimeTF.getText();
				str[2] = endTimeTF.getText();

				model.addRow(str);

				dayTF.setText("");
				startTimeTF.setText("");
				endTimeTF.setText("");
				dayTF.requestFocus();

			}
		});
		panel_2.setLayout(null);
		panel_2.add(reportAddBtn);

		JButton reportUpdateBtn = new JButton("시간수정");
		reportUpdateBtn.setBounds(229, 3, 120, 27);
		reportUpdateBtn.setBackground(new Color(211, 211, 211));
		reportUpdateBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reportUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = table.getSelectedRow();

				model.setValueAt(dayTF.getText(), rowIndex, 0);
				model.setValueAt(startTimeTF.getText(), rowIndex, 1);
				model.setValueAt(endTimeTF.getText(), rowIndex, 2);

				dayTF.setText("");
				startTimeTF.setText("");
				endTimeTF.setText("");
				dayTF.requestFocus();

			}
		});
		panel_2.add(reportUpdateBtn);

		JButton reportDeleteBtn = new JButton("시간삭제");
		reportDeleteBtn.setBounds(361, 3, 120, 27);
		reportDeleteBtn.setBackground(new Color(211, 211, 211));
		reportDeleteBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reportDeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = table.getSelectedRow();

				model.removeRow(rowIndex);

			}
		});
		panel_2.add(reportDeleteBtn);

		JButton colorChooser = new JButton("색상선택");
		colorChooser.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		colorChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ColorFrame cs = new ColorFrame();
			}
		});

		colorChooser.setBackground(new Color(211, 211, 211));
		colorChooser.setBounds(187, 136, 145, 23);
		panel_1.add(colorChooser);

		JLabel lblNewLabel_2 = new JLabel("강의추가");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_2.setBounds(252, 21, 80, 21);
		panel_1.add(lblNewLabel_2);

		registerBt = new JButton("강의등록");
		registerBt.setBackground(new Color(211, 211, 211));
		registerBt.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		registerBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timeService = new TimeService();
				lectureService = new LectureService();
				try {
					lectureService.lectureCreate(new Lecture(lectureNameTF.getText(), locationTF.getText(),
							ColorFrame.r, ColorFrame.g, ColorFrame.b));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				lectureNameTF.setText("");
				locationTF.setText("");
				lectureNameTF.requestFocus();

				int rowCount = model.getRowCount();

				for (int i = 0; i < rowCount; i++) {
					try {
						time = new Time(lectureService.selectMaxLectureNumber(), model.getValueAt(i, 0).toString(),
								model.getValueAt(i, 1).toString(), model.getValueAt(i, 2).toString());
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}

					try {
						timeService.timeCreate(time);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				model.setNumRows(0);
			}
		});
		registerBt.setBounds(117, 425, 201, 23);
		add(registerBt);

		updateBt = new JButton("강의수정");
		updateBt.setBackground(new Color(211, 211, 211));
		updateBt.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		updateBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lectureService = new LectureService();
				timeService = new TimeService();

				try {
					lectureService.lectureUpdate(new Lecture(lecture.getLectureNumber(), lectureNameTF.getText(),
							locationTF.getText(), ColorFrame.r, ColorFrame.g, ColorFrame.b));
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				lectureNameTF.setText("");
				locationTF.setText("");
				lectureNameTF.requestFocus();

				try {
					timeService.timeDeleteByLectureNumber(lecture.getLectureNumber());
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				int rowCount = model.getRowCount();

				for (int i = 0; i < rowCount; i++) {
					try {
						time = new Time(lecture.getLectureNumber(), model.getValueAt(i, 0).toString(),
								model.getValueAt(i, 1).toString(), model.getValueAt(i, 2).toString());
						timeService.timeCreate(time);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				model.setNumRows(0);

				try {
					timeMainFrame.newPanel();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					timeMainFrame.changePanelServe("dayTimeTablePanel", null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		updateBt.setBounds(323, 425, 173, 23);
		add(updateBt);

		reportManageBt = new JButton("과제관리");
		reportManageBt.setBackground(new Color(211, 211, 211));
		reportManageBt.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reportManageBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					timeMainFrame.lectureManage(lecture);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		reportManageBt.setBounds(234, 458, 173, 23);
		add(reportManageBt);

		JButton backBtn = new JButton("돌아가기");
		backBtn.setBackground(new Color(211, 211, 211));
		backBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				model.setRowCount(0);
				lectureNameTF.setText("");
				locationTF.setText("");
				dayTF.setText("");
				startTimeTF.setText("");
				endTimeTF.setText("");
				registerBt.setEnabled(true);
				updateBt.setEnabled(true);
				deleteBtn.setEnabled(true);
				reportManageBt.setEnabled(true);

				try {
					timeMainFrame.newPanel();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					timeMainFrame.changePanelServe("dayTimeTablePanel", null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		backBtn.setBounds(410, 458, 173, 23);
		add(backBtn);

		deleteBtn = new JButton("강의삭제");
		deleteBtn.setBackground(new Color(211, 211, 211));
		deleteBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timeService = new TimeService();
				reportService = new ReportService();
				lectureService = new LectureService();

				try {
					timeService.timeDeleteByLectureNumber(lecture.getLectureNumber());
					reportService.reportDeleteByLectureNumber(lecture.getLectureNumber());
					lectureService.lectureDeleteByLectureNumber(lecture.getLectureNumber());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				model.setRowCount(0);
				lectureNameTF.setText("");
				locationTF.setText("");
				dayTF.setText("");
				startTimeTF.setText("");
				endTimeTF.setText("");
				registerBt.setEnabled(true);
				updateBt.setEnabled(true);
				deleteBtn.setEnabled(true);
				reportManageBt.setEnabled(true);

				try {
					timeMainFrame.newPanel();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					timeMainFrame.changePanelServe("dayTimeTablePanel", null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		deleteBtn.setBounds(501, 425, 201, 23);
		add(deleteBtn);
	}

	public void setTimeMainFrame(TimeMainFrame timeMainFrame) {
		this.timeMainFrame = timeMainFrame;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public void setText() throws Exception {
		lectureNameTF.setText(lecture.getLectureName());
		locationTF.setText(lecture.getLocation());

		timeService = new TimeService();

		List<Time> timeList = timeService.findByLectureNumber(lecture.getLectureNumber());

		Time time = null;
		model.setNumRows(0);
		for (int i = 0; i < timeList.size(); i++) {
			time = timeList.get(i);
			String[] str = new String[3];
			str[0] = time.getDay();
			str[1] = time.getStartTime();
			str[2] = time.getEndTime();

			model.addRow(str);
		}

		ColorFrame.r = lecture.getColorR();
		ColorFrame.g = lecture.getColorG();
		ColorFrame.b = lecture.getColorB();
	}

	public void setAddRoute() {
		updateBt.setEnabled(false);
		deleteBtn.setEnabled(false);
		reportManageBt.setEnabled(false);

	}

	public void setUpdateRoute() {
		registerBt.setEnabled(false);
	}

}