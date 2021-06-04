package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ChatFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatFrame frame = new ChatFrame();
					frame.setVisible(true);
					frame.chatTF.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatFrame() {
		setTitle("아이티윌 채팅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea chatTA = new JTextArea();
		chatTA.setFont(new Font("Monospaced", Font.BOLD, 20));
		chatTA.setEditable(false);
		scrollPane.setViewportView(chatTA);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.PINK);
		contentPane.add(southPanel, BorderLayout.SOUTH);
		
		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * TextField에입력한 문자를 TextArea에 보여준다.
				 */
				String chatStr = chatTF.getText();
				if(chatStr.trim().equals("")) {
					chatTF.requestFocus();
					return;
				}
				chatTA.append("김래원:"+chatStr+"\n");
				chatTF.setText("");
				chatTF.requestFocus();
			}
		});
		chatTF.setFont(new Font("굴림", Font.BOLD, 16));
		southPanel.add(chatTF);
		chatTF.setColumns(25);
		
		JButton sendBtn = new JButton("전송");
		sendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * TextField에입력한 문자를 TextArea에 보여준다.
				 */
				String chatStr = chatTF.getText();
				if(chatStr.trim().equals("")) {
					chatTF.requestFocus();
					return;
				}
				chatTA.append("김래원:"+chatStr+"\n");
				chatTF.setText("");
				chatTF.requestFocus();
				
			}
		});
		southPanel.add(sendBtn);
	}

}
