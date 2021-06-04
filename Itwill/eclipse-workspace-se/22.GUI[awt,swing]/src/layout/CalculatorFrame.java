package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.JButton;

public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	private JPanel buttonPanel;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton plusBtn;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton minusBtn;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton mulBtn;
	private JButton btn0;
	private JButton equalBtn;
	private JButton clearBtn;
	private JButton divBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
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
	public CalculatorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel displayLabel = new JLabel("0");
		displayLabel.setBackground(SystemColor.activeCaption);
		displayLabel.setForeground(new Color(105, 105, 105));
		displayLabel.setFont(new Font("굴림체", Font.BOLD, 33));
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(displayLabel, BorderLayout.NORTH);
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.ORANGE);
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn3);
		
		plusBtn = new JButton("+");
		plusBtn.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(plusBtn);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn6);
		
		minusBtn = new JButton("-");
		minusBtn.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(minusBtn);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn9);
		
		mulBtn = new JButton("x");
		mulBtn.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(mulBtn);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(btn0);
		
		equalBtn = new JButton("=");
		equalBtn.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(equalBtn);
		
		clearBtn = new JButton("C");
		clearBtn.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(clearBtn);
		
		divBtn = new JButton("/");
		divBtn.setFont(new Font("굴림", Font.BOLD, 20));
		buttonPanel.add(divBtn);
	}

}
