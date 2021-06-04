package com.itwill06.collection.student;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StudentServiceArrayListFrameMain  extends JFrame{
	private StudentServiceArrayList studentServiceArrayList;
	private JTextField noTF;
	private JTextField gradeTF;
	private JTextField nameTF;
	public StudentServiceArrayListFrameMain() {
		
		super("학생관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentServiceArrayList=new StudentServiceArrayList();
		setSize(800, 550);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1. 전체학생총점,평균,평점계산");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1. 전체학생총점,평균,평점계산");
				studentServiceArrayList.calculate();
			}
		});
		btnNewButton.setBounds(42, 34, 700, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. 전체학생 총점으로 석차계산");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2. 전체학생 총점으로 석차계산");
				studentServiceArrayList.calculateRank();
			}
		});
		btnNewButton_1.setBounds(42, 89, 700, 46);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3. 전체학생반환");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Student> studentList=
						studentServiceArrayList.getStudentList();
				Student.headerPrint();
				for (Student student : studentList) {
					student.print();
				}
				System.out.println("----------------------------------------------------");
			}
		});
		btnNewButton_2.setBounds(42, 150, 700, 40);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4.번호 입력하면 학생한명 반환");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("4.번호3번 학생한명 반환  ");
				String noStr = noTF.getText();
				int no =Integer.parseInt(noStr);
				Student findStudent=studentServiceArrayList.findByStudent(no);
				if(findStudent!=null) {
					findStudent.print();
				}else {
					System.out.println(no+ " 번 학생이 존재안함");
				}
			}
		});
		
		btnNewButton_3.setBounds(185, 205, 557, 39);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5. 학점A인 학생들 반환");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gradeStr=gradeTF.getText().toUpperCase();
				char grade=gradeStr.charAt(0);
			ArrayList<Student>studentList=studentServiceArrayList.findByGrade(grade);
				for (Student student : studentList) {
					student.print();
				}
			}
		});
		btnNewButton_4.setBounds(185, 259, 557, 40);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6.  이름KIM 인 학생들 반환");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameStr = nameTF.getText();
				ArrayList<Student>studentList=studentServiceArrayList.findByName(nameStr);
				for (Student student : studentList) {
					student.print();
				}
			}
		});
		btnNewButton_5.setBounds(185, 314, 557, 40);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7. 학생총점으로 오름차순정렬");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentServiceArrayList.sortByTotAsc();
				ArrayList<Student>studentList=studentServiceArrayList.getStudentList();
				for (Student student : studentList) {
					student.print();
				}
				System.out.println("----------------------------------------------------");
			}
		});
		btnNewButton_6.setBounds(42, 369, 700, 40);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8. 학생이름순으로 오름차순정렬");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentServiceArrayList.sortByNameAsc();
				ArrayList<Student> studentList=studentServiceArrayList.getStudentList();
				for (Student student : studentList) {
					student.print();
				}
				System.out.println("----------------------------------------------------");
			}
		});
		btnNewButton_7.setBounds(42, 424, 700, 41);
		getContentPane().add(btnNewButton_7);
		
		noTF = new JTextField();
		noTF.setFont(new Font("D2Coding", Font.BOLD, 18));
		noTF.setHorizontalAlignment(SwingConstants.CENTER);
		noTF.setBounds(42, 208, 131, 33);
		getContentPane().add(noTF);
		noTF.setColumns(10);
		
		gradeTF = new JTextField();
		gradeTF.setHorizontalAlignment(SwingConstants.CENTER);
		gradeTF.setBounds(42, 259, 131, 40);
		getContentPane().add(gradeTF);
		gradeTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setHorizontalAlignment(SwingConstants.CENTER);
		nameTF.setBounds(42, 314, 131, 38);
		getContentPane().add(nameTF);
		nameTF.setColumns(10);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentServiceArrayListFrameMain();
	}
}