package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelMenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanelMenuFrame frame = new JPanelMenuFrame();
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
	public JPanelMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image\\w.png"));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Color.YELLOW);
		panel.add(menuPanel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("메일");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image\\default1.png"));
		menuPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("카페");
		btnNewButton_1.setIcon(new ImageIcon("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image\\koreanfood.png"));
		menuPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("블로그");
		btnNewButton_2.setIcon(new ImageIcon("C:\\JAVA_BACKEND\\01.JAVA_FUNDMENTAL\\99.image\\weather.png"));
		menuPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("지식");
		menuPanel.add(btnNewButton_3);
	}

}
