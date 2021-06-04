package com.itwill.prm.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.itwill.prm.service.PayStubsService;
import com.itwill.prm.test.JDialogTest;
import com.itwill.prm.test.TestListMain;
import com.itwill.prm.vo.Members;
import com.itwill.prm.vo.PaystubsResultValue;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MonthPayStubList extends JPanel {
	private JScrollPane Mp_ListScroll;
	private JLabel Mp_name_L;
	private JButton Mp_back_btn;
	private PayStubsService paysubsService;
	private JList Mp_List;
	private MainPagePanel mainPagePanel;
	MainJFrame mainJFrame;
	Members member;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JPanel panel_3;
	
	/**
	 * Create the panel.
	 */
	public MonthPayStubList(MainJFrame mainJFrame) {
		setMainJFrame(mainJFrame);
		paysubsService = new PayStubsService();		
		setLayout(new BorderLayout(0, 0));
		
		Mp_ListScroll = new JScrollPane();
		add(Mp_ListScroll, BorderLayout.CENTER);
		
		Mp_List = new JList();
		Mp_List.addMouseListener(new MouseAdapter() {
			//리스트에 있는 데이터를 누르면 해당 데이터를 mainJFrame에 selectPayStubs메소드를 통해 해당 달에 속하는 명세서 출력
			@Override
			public void mouseClicked(MouseEvent e) {
					String selectedId = (String)Mp_List.getSelectedValue();
					selectedId=selectedId.trim().substring(0,4)+"/"+selectedId.trim().substring(6,8);
					System.out.println(selectedId);
					mainJFrame.selectPayStubs(selectedId);
			}
		});
		Mp_ListScroll.setViewportView(Mp_List);
		
		JPanel Mp_headMenu = new JPanel();
		add(Mp_headMenu, BorderLayout.NORTH);
		Mp_headMenu.setLayout(new BorderLayout(0, 0));
		
		Mp_back_btn = new JButton("뒤로");
		Mp_back_btn.setBackground(new Color(224, 255, 255));
		Mp_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainJFrame.selectPage(MainJFrame.MAINPAGE);
			}
		});
		Mp_headMenu.add(Mp_back_btn, BorderLayout.WEST);
		
		Mp_name_L = new JLabel(member.getMember_name()+"님 환엽합니다.");
		Mp_name_L.setBackground(Color.LIGHT_GRAY);
		Mp_name_L.setHorizontalAlignment(SwingConstants.CENTER);
		Mp_headMenu.add(Mp_name_L, BorderLayout.CENTER);
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(224, 255, 255));
		Mp_headMenu.add(btnNewButton, BorderLayout.EAST);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		Mp_headMenu.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel(" | 월별 조회");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("궁서", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblNewLabel);
		
		//해당 사원이 가지고 있는 급여명세서를 월별로 출력
		try {
			List<PaystubsResultValue> paysList = paysubsService.payFindByNo(member.getMember_no()); 
			DefaultListModel defaultListModel=new  DefaultListModel();
			for (PaystubsResultValue paystubsResultValue : paysList) {
				defaultListModel.addElement(paystubsResultValue.getIssuance_date().substring(0, 4)+" 년"+paystubsResultValue.getIssuance_date().substring(5, 7)+" 월 명세서");
			}
			Mp_List.setModel(defaultListModel);
			
			panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setHgap(100);
			add(panel, BorderLayout.WEST);
			
			panel_1 = new JPanel();
			panel_1.setBackground(Color.LIGHT_GRAY);
			FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
			add(panel_1, BorderLayout.SOUTH);
			
			panel_2 = new JPanel();
			panel_2.setBackground(Color.LIGHT_GRAY);
			FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
			flowLayout_2.setHgap(100);
			add(panel_2, BorderLayout.EAST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setMainJFrame(MainJFrame mainJFrame) {
		this.mainJFrame=mainJFrame;
		this.member=mainJFrame.member;
	}
}
