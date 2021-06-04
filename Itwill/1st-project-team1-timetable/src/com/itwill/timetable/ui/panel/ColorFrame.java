package com.itwill.timetable.ui.panel;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;

import com.itwill.timetable.ui.TimeMainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorFrame extends JFrame implements ActionListener {
	
	public static int r;
	public static int g;
	public static int b;
	protected JColorChooser jc;
	protected JLabel lab1;
	TimeMainFrame timeMainFrame;

	ColorFrame() {
		setTitle("색상선택기");
		setSize(820, 420);
		JPanel jp = new JPanel();
		jc = new JColorChooser();
		jc.setBounds(71, 5, 614, 318);
		lab1 = new JLabel("\"rgb        테스트\"");
		lab1.setBounds(690, 156, 45, 15);
		jp.setLayout(null);
		jp.add(jc);
		jp.add(lab1);
		getContentPane().add(jp);

		JButton colorAdd = new JButton("등록");
		colorAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color myColor = jc.getColor();
				System.out.println(myColor);
				r = myColor.getRed();
				g = myColor.getGreen();
				b = myColor.getBlue();
				lab1.setText("r= " + r + "/g=" + g + "/b=" + b);
				dispose();
			}
		});
		colorAdd.setBackground(Color.WHITE);
		colorAdd.setBounds(218, 333, 91, 23);
		jp.add(colorAdd);

		JButton cancle = new JButton("돌아가기");
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancle.setBackground(Color.WHITE);
		cancle.setBounds(419, 333, 91, 23);
		jp.add(cancle);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorFrame cs = new ColorFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}