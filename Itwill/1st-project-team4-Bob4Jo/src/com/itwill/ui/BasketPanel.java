package com.itwill.ui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.service.JumunService;
import com.itwill.vo.Card;
import com.itwill.vo.Food;
import com.itwill.vo.Jumun;
import com.itwill.vo.MemberInfo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasketPanel extends JPanel {
	private JTable basketTable;
	private JTextField totalTF;
	private JTextField requestTF;
	private JComboBox paymentCB;
	private JButton paymentBtn;
	private JButton returnBtn;
	
	JumunService jumunService;
	Bob4JoMainFrame bob4JoMainFrame;
	private JScrollPane scrollPane;
	FoodSelectPanel foodSelectPanel;
	private JButton deleteBtn;
	/**
	 * Create the panel.
	 */
	public BasketPanel() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				jumunListTable();
				List<Jumun> jumunList=null;
				try {
					jumunList = jumunService.selectByJumunTypeIsNull(bob4JoMainFrame.loginMember.getMember_no());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int sum = 0;
				for (Jumun jumun : jumunList) {
					sum+=jumun.getJumun_sum();
				}
				totalTF.setText(sum+"");
			}
		});
		setBackground(new Color(255, 204, 51));
		setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 208, 340, 99);
		add(scrollPane);
		
		basketTable = new JTable();
		scrollPane.setViewportView(basketTable);
		basketTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"\uC74C\uC2DD\uBA85", "\uC218\uB7C9", "\uAC00\uACA9"
			}
		));
		
		JLabel totalLb = new JLabel("?????????");
		totalLb.setFont(new Font("???????????????", Font.PLAIN, 12));
		totalLb.setHorizontalAlignment(SwingConstants.CENTER);
		totalLb.setBounds(38, 363, 62, 21);
		add(totalLb);
		
		totalTF = new JTextField();
		totalTF.setEditable(false);
		totalTF.setBounds(121, 363, 205, 21);
		add(totalTF);
		totalTF.setColumns(10);
		
		JLabel wonLb = new JLabel("???");
		wonLb.setFont(new Font("???????????????", Font.PLAIN, 12));
		wonLb.setHorizontalAlignment(SwingConstants.CENTER);
		wonLb.setBounds(338, 366, 31, 15);
		add(wonLb);
		
		JLabel requestLb = new JLabel("????????????");
		requestLb.setFont(new Font("???????????????", Font.PLAIN, 12));
		requestLb.setHorizontalAlignment(SwingConstants.CENTER);
		requestLb.setBounds(41, 412, 57, 15);
		add(requestLb);
		
		requestTF = new JTextField();
		requestTF.setBounds(118, 409, 251, 21);
		add(requestTF);
		requestTF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("????????????");
		lblNewLabel.setFont(new Font("???????????????", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 455, 57, 15);
		add(lblNewLabel);
		
		paymentCB = new JComboBox();
		paymentCB.setFont(new Font("???????????????", Font.PLAIN, 12));
		paymentCB.setModel(new DefaultComboBoxModel(new String[] {"????????????", "????????????"}));
		paymentCB.setBounds(119, 451, 251, 23);
		add(paymentCB);
		
		paymentBtn = new JButton("????????????");
		paymentBtn.setForeground(new Color(0, 0, 0));
		paymentBtn.setBackground(new Color(240, 240, 240));
		paymentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		paymentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String member_no = bob4JoMainFrame.loginMember.getMember_no();
				String jumun_request = requestTF.getText();
				int paymentTypeIndex = paymentCB.getSelectedIndex();
				if(paymentTypeIndex==0) {
					/*
					 * ???????????? ????????????
					 */
					try {
						Card card = jumunService.selectByCardMemberNo(member_no);
						if(card!=null) {
						CardPasswordCheckDialog cardPasswordCheckDialog = new CardPasswordCheckDialog();
						cardPasswordCheckDialog.setBob4JoMainFrame(bob4JoMainFrame);
						cardPasswordCheckDialog.setModal(true);
						cardPasswordCheckDialog.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(null, "????????? ????????? ????????????");
							return;
						}
						jumunService.updateByJumunTypeIsNull(jumun_request,"????????????",member_no);
						requestTF.setText("");
						bob4JoMainFrame.changePanel(2);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else if(paymentTypeIndex==1) {
					//????????????
					try {
						jumunService.updateByJumunTypeIsNull(jumun_request,"????????????",member_no);
						JOptionPane.showMessageDialog(null, "????????? ?????????????????????");
						requestTF.setText("");
						//????????????
						bob4JoMainFrame.changePanel(2);
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		paymentBtn.setFont(new Font("???????????????", Font.PLAIN, 12));
		paymentBtn.setBounds(35, 556, 132, 23);
		add(paymentBtn);
		
		returnBtn = new JButton("????????????");
		
		returnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bob4JoMainFrame.changePanel(0);
			}
		});
		
		returnBtn.setFont(new Font("???????????????", Font.PLAIN, 12));
		returnBtn.setBounds(237, 556, 132, 23);
		add(returnBtn);
		
		JLabel listLb = new JLabel("???????????? ??????");
		listLb.setForeground(new Color(0, 0, 0));
		listLb.setFont(new Font("???????????????", Font.PLAIN, 11));
		listLb.setHorizontalAlignment(SwingConstants.CENTER);
		listLb.setBounds(24, 25, 368, 25);
		add(listLb);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(BasketPanel.class.getResource("/com/itwill/ui/????????????.png")));
		lblNewLabel_1.setBounds(110, 49, 193, 140);
		add(lblNewLabel_1);
		
		deleteBtn = new JButton("??????");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRow = basketTable.getSelectedRow();
					if(selectedRow==-1) {
						return;
					}
					MemberInfo member = bob4JoMainFrame.loginMember;
					String member_no=member.getMember_no();
					List<Jumun> jumunList = jumunService.selectByJumunTypeIsNull(member_no);
					Jumun jumun = jumunList.get(selectedRow);
					int jumun_no=jumun.getJumun_no();
					int rowCount = jumunService.deleteByJumunNo(jumun_no);
					if(rowCount==1) {
						JOptionPane.showMessageDialog(null, "????????? ?????????????????????.");
						jumunListTable();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		deleteBtn.setBackground(Color.RED);
		deleteBtn.setBounds(319, 317, 62, 23);
		add(deleteBtn);
		
		//service?????? ??????
		jumunService = new JumunService();

	}//????????? ??????
	private void jumunListTable() {
		try {
			if(jumunService==null) {
				return;
			}
			List<Jumun> jumunList = jumunService.selectByJumunTypeIsNull(bob4JoMainFrame.loginMember.getMember_no());
			Vector jumunListVector = new Vector();
			for (Jumun jumun : jumunList) {
				Food food=jumunService.selectByFoodNo(jumun.getFood_no());
				Vector foodVector=new Vector();
				foodVector.add(food.getFood_name());
				foodVector.add(food.getFood_price());
				foodVector.add(jumun.getJumun_quantity());
				jumunListVector.add(foodVector);
			}
			Vector columnNames=new Vector();
			columnNames.add("?????????");
			columnNames.add("??????");
			columnNames.add("??????");
			
			DefaultTableModel defaultTableModel =
					new DefaultTableModel(jumunListVector, columnNames);
			basketTable.setModel(defaultTableModel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//????????????????????????
	public void setBob4JoMainFrame(Bob4JoMainFrame bob4JoMainFrame) {
		this.bob4JoMainFrame=bob4JoMainFrame;		
	}
}