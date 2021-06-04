

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JLabel displayLabel;
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
		setBounds(100, 100, 318, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		displayLabel = new JLabel("0");
		displayLabel.setBackground(SystemColor.activeCaption);
		displayLabel.setForeground(new Color(105, 105, 105));
		displayLabel.setFont(new Font("굴림체", Font.BOLD, 33));
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(displayLabel, BorderLayout.NORTH);
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		buttonPanel.setLayout(new GridLayout(4, 4, 1, 1));
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn3);
		
		plusBtn = new JButton("+");
		plusBtn.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(plusBtn);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn6);
		
		minusBtn = new JButton("-");
		minusBtn.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(minusBtn);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn9);
		
		mulBtn = new JButton("x");
		mulBtn.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(mulBtn);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(btn0);
		
		equalBtn = new JButton("=");
		equalBtn.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(equalBtn);
		
		clearBtn = new JButton("c");
		clearBtn.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(clearBtn);
		
		divBtn = new JButton("/");
		divBtn.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(divBtn);
		/*********** event핸들러 등록**************/
		CalculatorButtonHandler calculatorButtonHandler=new CalculatorButtonHandler();
		btn0.addActionListener(calculatorButtonHandler);
		btn1.addActionListener(calculatorButtonHandler);
		btn2.addActionListener(calculatorButtonHandler);
		btn3.addActionListener(calculatorButtonHandler);
		btn4.addActionListener(calculatorButtonHandler);
		btn5.addActionListener(calculatorButtonHandler);
		btn6.addActionListener(calculatorButtonHandler);
		btn7.addActionListener(calculatorButtonHandler);
		btn8.addActionListener(calculatorButtonHandler);
		btn9.addActionListener(calculatorButtonHandler);
		plusBtn.addActionListener(calculatorButtonHandler);
		minusBtn.addActionListener(calculatorButtonHandler);
		divBtn.addActionListener(calculatorButtonHandler);
		mulBtn.addActionListener(calculatorButtonHandler);
		equalBtn.addActionListener(calculatorButtonHandler);
		clearBtn.addActionListener(calculatorButtonHandler);
	}//생성자의끝
	
	
	private String displayStr="";
	private String firstOpStr="";
	private String secondOpStr="";
	private String operatorStr="";
	private int firstOp=0;
	private int secondOp=0;
	private int result=0;
	
	/*
	 * status:
	 *   0 : 첫번째항의 숫자입력상태
	 *   1 : 두번째항의 숫자입력상태
	 */
	private int status=0;
	
	/*************************member inner class*********************/
	public class CalculatorButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(firstOpStr.equals("") && secondOpStr.equals("")&& operatorStr.equals("")|| displayStr.equals("0")) {
				displayStr="";
			}
			if(cmd.equals("1")) {
				displayStr+="1";
			}else if(cmd.equals("2")) {
				displayStr+="2";
			}else if(cmd.equals("3")) {
				displayStr+="3";
			}else if(cmd.equals("4")) {
				displayStr+="4";
			}else if(cmd.equals("5")) {
				displayStr+="5";
			}else if(cmd.equals("6")) {
				displayStr+="6";
			}else if(cmd.equals("7")) {
				displayStr+="7";
			}else if(cmd.equals("8")) {
				displayStr+="8";
			}else if(cmd.equals("9")) {
				displayStr+="9";
			}else if(cmd.equals("0")) {
				displayStr+="0";
			}else if(cmd.equals("-")||cmd.equals("x")||cmd.equals("/")||cmd.equals("+")) {
				status=1;
				firstOpStr=displayStr;
				System.out.println(firstOpStr+operatorStr+secondOpStr);
				if(cmd.equals("+")) {
					operatorStr="+";
				}else if(cmd.equals("-")) {
					operatorStr="-";
				}else if(cmd.equals("x")) {
					operatorStr="x";
				}else if(cmd.equals("/")) {
					operatorStr="/";
				}
				displayStr="0";
			}else if(cmd.equals("=")) {
				System.out.println(firstOpStr+operatorStr+secondOpStr);
				secondOpStr=displayStr;
				firstOp=Integer.parseInt(firstOpStr);
				secondOp=Integer.parseInt(secondOpStr);
				switch (operatorStr) {
				case "+":
					result = firstOp + secondOp;
					break;
				case "-":
					result = firstOp - secondOp;
					break;
				case "x":
					result = firstOp * secondOp;
					break;
				case "/":
					result = firstOp / secondOp;
					break;
				}
				displayStr = result+"";
				
				status=0;
				firstOpStr="";
				secondOpStr="";
				operatorStr="";
				
			}else if(cmd.equals("c")|| displayStr.equals("")) {
				displayStr="0";
			}
			displayLabel.setText(displayStr);
			
			
		}
	}
	
}//클래스의 끝













