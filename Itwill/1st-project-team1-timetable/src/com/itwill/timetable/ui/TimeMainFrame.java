package com.itwill.timetable.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import com.itwill.timetable.service.ReportService;
import com.itwill.timetable.service.SettingService;
import com.itwill.timetable.ui.panel.DayTimeTableViewerPanel;
import com.itwill.timetable.ui.panel.LecturePanel;
import com.itwill.timetable.ui.panel.ReportPanel;
import com.itwill.timetable.vo.Lecture;

public class TimeMainFrame extends JFrame {
	private JPanel contentPane;
	private JPanel baseCardLayoutPanel;
	private ReportPanel reportPanel;
	Lecture selectLecture;
	ReportService reportService;
	SettingService settingService;
	private JMenuItem hh24;
	private JMenuItem hh12;
	private LecturePanel lecturePanel;
	private DayTimeTableViewerPanel dayTimeTableViewer;
	private JMenuItem lectureAddBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeMainFrame frame = new TimeMainFrame();
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

	public TimeMainFrame() throws Exception {
		settingService = new SettingService();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 657);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("메뉴");
		menuBar.add(menu);

		JMenuItem exitMenuItem = new JMenuItem("종료");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		lectureAddBtn = new JMenuItem("강의추가");
		lectureAddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
				cl.show(baseCardLayoutPanel, "lecturePanel");
				lecturePanel.setAddRoute();
			}
		});
		menu.add(lectureAddBtn);

		JMenu setting = new JMenu("환경설정");
		menu.add(setting);

		hh12 = new JMenuItem("12시간");
		hh12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SettingService ss = new SettingService();
				try {
					ss.update("F");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		setting.add(hh12);

		hh24 = new JMenuItem("24시간");
		hh24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SettingService ss = new SettingService();
				try {
					ss.update("T");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		setting.add(hh24);

		JSeparator separator = new JSeparator();
		menu.add(separator);
		menu.add(exitMenuItem);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		baseCardLayoutPanel = new JPanel();
		contentPane.add(baseCardLayoutPanel, BorderLayout.CENTER);
		baseCardLayoutPanel.setLayout(new CardLayout(0, 0));

		dayTimeTableViewer = new DayTimeTableViewerPanel();
		dayTimeTableViewer.setTimeMainFrame(this);
		baseCardLayoutPanel.add(dayTimeTableViewer, "dayTimeTablePanel");

		lecturePanel = new LecturePanel();
		lecturePanel.setTimeMainFrame(this);
		baseCardLayoutPanel.add(lecturePanel, "lecturePanel");

		reportPanel = new ReportPanel();
		reportPanel.setTimeMainFrame(this);
		baseCardLayoutPanel.add(reportPanel, "reportPanel");

	}

	public void newPanel() throws Exception {
		dayTimeTableViewer = new DayTimeTableViewerPanel();
		dayTimeTableViewer.setTimeMainFrame(this);
		baseCardLayoutPanel.add(dayTimeTableViewer, "dayTimeTablePanel");
	}

	public void changePanel(String pName, Lecture lecture) throws Exception {
		((CardLayout) baseCardLayoutPanel.getLayout()).show(baseCardLayoutPanel, pName);
		if (lecture != null) {
			lecturePanel.setLecture(lecture);
		}
		lecturePanel.setText();
		lecturePanel.setUpdateRoute();
	}

	public void lectureManage(Lecture lecture) throws Exception {
		reportPanel.reportListByLecture(lecture);
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		cl.show(baseCardLayoutPanel, "reportPanel");
	}

	public void backToLecture() throws Exception {
		CardLayout cl = (CardLayout) baseCardLayoutPanel.getLayout();
		cl.show(baseCardLayoutPanel, "lecturePanel");
	}

	public void changePanelServe(String pName, Lecture lecture) throws Exception {
		((CardLayout) baseCardLayoutPanel.getLayout()).show(baseCardLayoutPanel, pName);
		if (lecture != null) {
			lecturePanel.setLecture(lecture);
		}

	}
}
