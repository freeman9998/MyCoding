package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JpanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPanel searchPanel;
	private JPanel joinPanel;
	private JPanel menuPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JpanelJFrame frame = new JpanelJFrame();
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
	public JpanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 590);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		menuPanel = new JPanel();
		menuPanel.setBackground(Color.GREEN);
		contentPane.add(menuPanel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("회원리스트");
		menuPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		menuPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원로그인");
		menuPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원찾기");
		menuPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회원삭제");
		menuPanel.add(btnNewButton_4);
		
		searchPanel = new JPanel();
		searchPanel.setBackground(new Color(123, 104, 238));
		contentPane.add(searchPanel, BorderLayout.CENTER);
		searchPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("회원이름을 입력하세요");
		textField.setBounds(170, 29, 146, 21);
		searchPanel.add(textField);
		textField.setColumns(15);
		
		JButton btnNewButton_5 = new JButton("검색");
		btnNewButton_5.setBounds(328, 28, 97, 23);
		searchPanel.add(btnNewButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(88, 91, 502, 361);
		searchPanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		joinPanel = new JPanel();
		joinPanel.setBackground(new Color(165, 42, 42));
		contentPane.add(joinPanel, BorderLayout.CENTER);
		joinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(81, 61, 57, 15);
		joinPanel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(219, 58, 116, 21);
		joinPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패쓰워드");
		lblNewLabel_1.setBounds(81, 106, 57, 15);
		joinPanel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(219, 103, 116, 21);
		joinPanel.add(passwordField);
		
		JButton btnNewButton_6 = new JButton("중복체크");
		btnNewButton_6.setBounds(372, 57, 97, 23);
		joinPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("가입");
		btnNewButton_7.setBounds(98, 376, 97, 23);
		joinPanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("취소");
		btnNewButton_8.setBounds(327, 376, 97, 23);
		joinPanel.add(btnNewButton_8);
		
		
		//contentPane.add(joinPanel, BorderLayout.CENTER);
		contentPane.add(searchPanel, BorderLayout.CENTER);
	}
}
