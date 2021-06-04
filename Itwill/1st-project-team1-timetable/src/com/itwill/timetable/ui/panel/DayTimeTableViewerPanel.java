package com.itwill.timetable.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.itwill.timetable.service.LectureService;
import com.itwill.timetable.service.TimeService;
import com.itwill.timetable.ui.TimeMainFrame;
import com.itwill.timetable.vo.Lecture;
import com.itwill.timetable.vo.Time;
import com.itwill.timetable.vo.Week;

public class DayTimeTableViewerPanel extends JPanel {
	public static TimeMainFrame timeMainFrame;

	public TimeMainFrame getTimeMainFrame() {
		return timeMainFrame;
	}

	public void setTimeMainFrame(TimeMainFrame timeMainFrame) {
		this.timeMainFrame = timeMainFrame;
	}

	private static JFrame frame;
	private static final long serialVersionUID = 1L;
	private JPanel jPanelTop = null;
	private JPanel jPanelLeft = null;
	private DaySchedulePanel jPanelCenter = null;

	private int width = 6;
	private int startY = 0;
	private int endY = 18;

	public DayTimeTableViewerPanel() throws Exception {
		this(new Lecture(), new ArrayList<Time>());
	}

	private List<Time> timeList = new ArrayList<Time>();
	private List<Lecture> lectureList = new ArrayList<Lecture>();

	public DayTimeTableViewerPanel(Lecture lecture, List<Time> timeList) throws Exception {
		dataInitialize();
		/*
		this.lecture = lecture;
		this.timeList = timeList;
		System.out.println("1.DayTimeTableViewer -------------");
		
		Iterator<Time> timeIter = timeList.iterator();
		
		while (timeIter.hasNext()) {
			Time time = (Time) timeIter.next();
			System.out.println("4.-->" + time);
			int w = time.week.ordinal() + 1;
			int ys = time.periodStart;
			int ye = time.periodEnd;
			this.width = (this.width > w ? this.width : w);
			this.startY = (this.startY < ys ? this.startY : ys);
			this.endY = (this.endY > ye ? this.endY : ye);
		
		}
		initialize();
		*/
	}

	private void initialize() {
		GridBagConstraints gridBagConstraintscenter = new GridBagConstraints();
		gridBagConstraintscenter.insets = new Insets(0, 0, 5, 0);
		gridBagConstraintscenter.gridx = 1;
		gridBagConstraintscenter.weightx = this.width;
		gridBagConstraintscenter.fill = 0;
		gridBagConstraintscenter.weighty = this.endY;
		gridBagConstraintscenter.ipadx = 0;
		gridBagConstraintscenter.ipady = 0;
		gridBagConstraintscenter.anchor = 18;
		gridBagConstraintscenter.gridy = 1;
		GridBagConstraints gridBagConstraintsTop = new GridBagConstraints();
		gridBagConstraintsTop.gridx = 1;
		gridBagConstraintsTop.gridwidth = 1;
		gridBagConstraintsTop.weightx = this.width;
		gridBagConstraintsTop.fill = 0;
		gridBagConstraintsTop.weighty = 1.0D;
		gridBagConstraintsTop.insets = new Insets(0, 0, 5, 0);
		gridBagConstraintsTop.anchor = 16;
		gridBagConstraintsTop.gridy = 0;
		GridBagConstraints gridBagConstraintsLeft = new GridBagConstraints();
		gridBagConstraintsLeft.insets = new Insets(0, 0, 5, 5);
		gridBagConstraintsLeft.gridx = 0;
		gridBagConstraintsLeft.weightx = 1.0D;
		gridBagConstraintsLeft.weighty = this.endY;
		gridBagConstraintsLeft.fill = 0;
		gridBagConstraintsLeft.anchor = 12;
		gridBagConstraintsLeft.gridy = 1;

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0 };
		setLayout(gridBagLayout);
		add(getJPanelLeft(), gridBagConstraintsLeft);
		add(getJPanelTop(), gridBagConstraintsTop);
		add(getJPanelCenter(), gridBagConstraintscenter);
	}

	private JPanel getJPanelTop() {
		if (this.jPanelTop == null) {
			this.jPanelTop = new TopPanel(this.width);
		}
		return this.jPanelTop;
	}

	private JPanel getJPanelLeft() {
		if (this.jPanelLeft == null) {
			this.jPanelLeft = new LeftPanel(this.startY, this.endY);
		}
		return this.jPanelLeft;
	}

	private DaySchedulePanel getJPanelCenter() {
		if (this.jPanelCenter == null) {
			this.jPanelCenter = new DaySchedulePanel(this.width, this.startY, this.endY);
			this.jPanelCenter.setDatas(this.lectureList, this.timeList);
		}

		return this.jPanelCenter;
	}

	public void dataInitialize() throws Exception {
		LectureService lectureService = new LectureService();
		TimeService timeService = new TimeService();
		List<Lecture> lectureList = lectureService.lectureSelectAll();
		List<Time> timeList2 = new ArrayList<Time>();
		for (Lecture lecture : lectureList) {
			List<Time> timeList1 = timeService.findByLectureNumber(lecture.getLectureNumber());
			for (Time time : timeList1) {
				time.week = Week.parse(time.getDay().substring(0, 1));
				String hhStr1 = time.getStartTime().substring(0, 2);
				String mmStr1 = time.getStartTime().substring(3, 5);
				String hhStr2 = time.getEndTime().substring(0, 2);
				String mmStr2 = time.getEndTime().substring(3, 5);
				time.periodStart = ((Integer.parseInt(hhStr1) - 9) * 2);
				time.periodStart += (Integer.parseInt(mmStr1) == 0 ? 0 : 1);
				time.periodEnd = ((Integer.parseInt(hhStr2) - 9) * 2);
				time.periodEnd += (Integer.parseInt(mmStr2) <= 15 ? 1 : 2);
				timeList2.add(time);
			}
		}
		/*************************************************************/
		this.lectureList = lectureList;
		this.timeList = timeList2;
		System.out.println("1.DayTimeTableViewer -------------");
		Iterator<Time> timeIter = timeList.iterator();
		while (timeIter.hasNext()) {
			Time time = (Time) timeIter.next();
			System.out.println("4.-->" + time);
			int w = time.week.ordinal() + 1;
			int ys = time.periodStart;
			int ye = time.periodEnd;
			this.width = (this.width > w ? this.width : w);
			this.startY = (this.startY < ys ? this.startY : ys);
			this.endY = (this.endY > ye ? this.endY : ye);

		}
		initialize();
		/*************************************************************/

	}

	public static void main(String[] args) throws Exception {
		/*
				frame = new JFrame();
				LectureService lectureService = new LectureService();
				TimeService timeService = new TimeService();
				Lecture lecture = lectureService.lectureSelectByLectureNumber(3);
				System.out.println(lecture);
				List<Time> timeList1 = timeService.findByLectureNumber(3);
				List<Time> timeList2 = new ArrayList<Time>();
				for (Time time : timeList1) {
					time.week = Week.parse(time.getDay().substring(0, 1));
					String hhStr1 = time.getStartTime().substring(0, 2);
					String mmStr1 = time.getStartTime().substring(3, 5);
					String hhStr2 = time.getEndTime().substring(0, 2);
					String mmStr2 = time.getEndTime().substring(3, 5);
		
					time.periodStart = ((Integer.parseInt(hhStr1) - 9) * 2);
					time.periodStart += (Integer.parseInt(mmStr1) == 0 ? 0 : 1);
					time.periodEnd = ((Integer.parseInt(hhStr2) - 9) * 2);
					time.periodEnd += (Integer.parseInt(mmStr2) <= 15 ? 1 : 2);
					timeList2.add(time);
				}
				frame.getContentPane().add(new DayTimeTableViewerPanel(lecture, timeList2));
				frame.pack();
				frame.setDefaultCloseOperation(3);
				frame.setVisible(true);
		*/
	}

	static class LeftPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public LeftPanel(int ys, int ye) {
			setLayout(new GridBagLayout());
			for (int i = ys; i < ye; i += 2) {
				GridBagConstraints gridBagConstraintsOrder = new GridBagConstraints();
				gridBagConstraintsOrder.gridx = 0;
				gridBagConstraintsOrder.gridy = (i - ys);
				gridBagConstraintsOrder.gridheight = 2;
				GridBagConstraints gridBagConstraintsT00 = new GridBagConstraints();
				gridBagConstraintsT00.gridx = 1;
				gridBagConstraintsT00.gridy = (i - ys);

				GridBagConstraints gridBagConstraintsT30 = new GridBagConstraints();
				gridBagConstraintsT30.gridx = 1;
				gridBagConstraintsT30.gridy = (i - ys + 1);

				JLabel Order = new JLabel();
				Order.setHorizontalAlignment(0);
				Order.setHorizontalTextPosition(0);
				Order.setText(String.valueOf(i / 2 + 1));
				Order.setPreferredSize(new Dimension(55, 54));
				Order.setBorder(BorderFactory.createEtchedBorder(1));

				JLabel T00 = new JLabel();
				T00.setHorizontalAlignment(0);
				T00.setHorizontalTextPosition(0);
				T00.setText(i / 2 + 9 + ":00");
				T00.setPreferredSize(new Dimension(55, 27));
				T00.setBorder(BorderFactory.createEtchedBorder(1));

				JLabel T30 = new JLabel();
				T30.setHorizontalAlignment(0);
				T30.setHorizontalTextPosition(0);
				T30.setText(i / 2 + 9 + ":30");
				T30.setPreferredSize(new Dimension(55, 27));
				T30.setBorder(BorderFactory.createEtchedBorder(1));

				add(Order, gridBagConstraintsOrder);
				add(T00, gridBagConstraintsT00);
				add(T30, gridBagConstraintsT30);
			}
		}

		public LeftPanel() {
			this(0, 18);
		}
	}

	static class TopPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public TopPanel(int width) {
			setLayout(new GridBagLayout());

			for (int i = 0; i < width; i++) {
				GridBagConstraints gridBagConstraints = new GridBagConstraints();
				gridBagConstraints.fill = 1;
				gridBagConstraints.gridx = i;
				gridBagConstraints.gridy = 0;
				gridBagConstraints.ipadx = 0;
				gridBagConstraints.insets = new Insets(0, 0, 0, 0);

				JLabel jLabel = new JLabel();
				jLabel.setHorizontalAlignment(0);
				jLabel.setText(Week.values()[i].toString());
				jLabel.setBorder(BorderFactory.createEtchedBorder(1));
				jLabel.setPreferredSize(new Dimension(110, 35));
				jLabel.setBorder(BorderFactory.createEtchedBorder(1));
				jLabel.setHorizontalTextPosition(0);
				add(jLabel, gridBagConstraints);
			}
		}

		public TopPanel() {
			this(6);
		}
	}

	static class DaySchedulePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		private final Color odd = new Color(255, 255, 255);
		private final Color even = new Color(225, 225, 225);
		private int ys;

		public DaySchedulePanel(int width, int ys, int ye) {
			GridBagLayout layout = new GridBagLayout();
			this.ys = ys;
			layout.columnWeights = new double[width];
			layout.columnWidths = new int[width];
			layout.rowHeights = new int[ye - ys];
			layout.rowWeights = new double[ye - ys];
			for (int i = 0; i < width; i++) {
				layout.columnWeights[i] = 1.0D;
				layout.columnWidths[i] = 110;
			}
			for (int i = 0; i < ye - ys; i++) {
				layout.rowHeights[i] = 27;
				layout.rowWeights[i] = 1.0D;
			}
			setLayout(layout);
			setBorder(BorderFactory.createEtchedBorder(1));
			setPreferredSize(new Dimension(110 * width, 27 * (ye - ys)));
		}

		public DaySchedulePanel() {
			this(6, 0, 18);
		}

		public void paint(Graphics g) {
			int h = getHeight();
			int w = getWidth();
			g.setColor(this.odd);
			for (int i = 0; i < h; i += 54) {
				g.fillRect(0, i, w, 26);
			}
			g.setColor(this.even);
			for (int i = 27; i < h; i += 54) {
				g.fillRect(0, i, w, 26);
			}
			g.setColor(Color.GRAY);
			paintChildren(g);
			for (int i = 109; i < w; i += 110) {
				g.drawLine(i, 0, i, h);
			}
			paintBorder(g);
		}

		Random rand = new Random();

		public void setDatas(List<Lecture> lectureList, List<Time> timeList) {
			removeAll();

			for (Lecture lecture : lectureList) {
				int lec_no = lecture.getLectureNumber();
				List<Time> tList = new ArrayList<Time>();
				for (Time t : timeList) {
					if (t.getLectureNumber() == lec_no) {
						tList.add(t);
					}
				}
				for (Time time : tList) {
					GridBagConstraints gridBagConstraints = new GridBagConstraints();
					gridBagConstraints.gridx = time.week.ordinal();
					gridBagConstraints.gridheight = time.getInteval();
					gridBagConstraints.fill = 1;
					gridBagConstraints.gridy = (time.periodStart - this.ys);
					gridBagConstraints.insets = new Insets(0, 0, 0, 0);
					add(new TimePanel(lecture, time), gridBagConstraints);
				}
			}
		}

		static class TimePanel extends JTextArea {
			public final Time time;
			public final Lecture lecture;

			private static final long serialVersionUID = 1L;

			public TimePanel(Lecture lecture, Time time) {
				this.lecture = lecture;
				this.time = time;

				Color color = new Color(lecture.getColorR(), lecture.getColorG(), lecture.getColorB());
				System.out.println(color);
				append(lecture.getLectureName() + "\n");
				if (time.getInteval() > 1) {
					append(time.getLectureNumber() + "\n");
				}
				if (time.getInteval() > 3) {
					append(lecture.getLocation());
				}
				setEditable(false);
				setSelectionColor(color);
				setSelectedTextColor(Color.BLACK);
				setBackground(color);
				setForeground(Color.BLACK);
				setMaximumSize(new Dimension(110, time.getInteval() * 27));
				setMinimumSize(new Dimension(110, time.getInteval() * 27));
				setBorder(BorderFactory.createEtchedBorder(1));
				setLineWrap(true);
				addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						try {
							System.out.println("lecture no:" + lecture.getLectureNumber());
							timeMainFrame.changePanel("lecturePanel", lecture);

						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				});

			}

		}
	}

}
