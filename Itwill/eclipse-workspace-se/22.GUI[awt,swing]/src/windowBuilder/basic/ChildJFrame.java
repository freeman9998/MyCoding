package windowBuilder.basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class ChildJFrame extends JFrame {

	private JPanel contentPane;
	private JButton confirmBtn;
	private JButton cancleBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ChildJFrame frame = new ChildJFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChildJFrame() {
		setTitle("윈도우빌더를사용한프레임생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		confirmBtn = new JButton("확인");
		confirmBtn.setBounds(61, 157, 97, 23);
		contentPane.add(confirmBtn);
		
		cancleBtn = new JButton("취소");
		cancleBtn.setBounds(223, 157, 97, 23);
		contentPane.add(cancleBtn);
	}
}
