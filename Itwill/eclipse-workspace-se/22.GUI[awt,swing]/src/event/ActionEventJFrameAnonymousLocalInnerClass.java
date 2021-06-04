package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ActionEventJFrameAnonymousLocalInnerClass extends JFrame{
	private JPanel contentPane;
	private JButton northBtn;
	private JButton southBtn;
	public ActionEventJFrameAnonymousLocalInnerClass() {
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("ActionEvent처리[익명클래스]");
		contentPane=new JPanel();
		this.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(new Color(34,56,124));
		
		northBtn=new JButton("이벤트소쓰[NORTH]");
		southBtn=new JButton("이벤트소쓰[SOUTH]");
		
		northBtn.setActionCommand("NB");
		southBtn.setActionCommand("SB");
		
		contentPane.add(northBtn,BorderLayout.NORTH);
		contentPane.add(southBtn,BorderLayout.SOUTH);
		
		setSize(300, 400);
		/********이벤트등록*************/
		northBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("north button click!!");
			}
		});
		southBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("south button click !!");
			}
		});
		
	}
	
	public static void main(String[] args) {
		ActionEventJFrameAnonymousLocalInnerClass f= new ActionEventJFrameAnonymousLocalInnerClass();
		f.setVisible(true);
	}

}