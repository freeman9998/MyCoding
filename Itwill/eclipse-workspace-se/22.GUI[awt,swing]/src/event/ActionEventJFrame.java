package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*
	1. 이벤트 소스 결정 :하나의 윈도우에는 여러 개의 컴포넌트가 존재할 수 있으므로
						 실제로 이벤트가 발생되면 처리할 컴포넌트를 결정한다. 
	2. 이벤트 핸들러(리스너) 클래스작성 : 
				이벤트를 실제적으로 처리할 수 있도록 
	            해당 이벤트를 처리할 이벤트 리스너 인터페이스를 
	            이용해서(구현) 이벤트 핸들러(리스너) 클래스를 작성한다. 
	
	3. 이벤트 소스객체와 이벤트 핸들러(리스너)객체 연결 :
	 				이벤트 리스너(핸들러)가 작성이되면 리스너(핸들러)와 이벤트 소스와 연결을 하여 
	 				이벤트 소스에서 실제적으로 이벤트가 발생이 되면 처리할수 있도록 
					addXXListener()함수를 통해 연결을 시켜준다.  
					XX부분은 해당 컴포넌트에 붙일 수 있는 리스너 이름을 의미한다.
		  
		  예를 들어 버튼에 ActionEvent을 처리하기 위하여 
		  버튼에다가 addActionListener를 붙이는 경우이다.
		  ex> 버튼객체.addActionListener(핸들러객체);
 */
public class ActionEventJFrame extends JFrame{
	private JPanel contentPane;
	private JButton northBtn;
	private JButton southBtn;
	public ActionEventJFrame() {
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("ActionEvent처리");
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
		//northBtn.addActionListener(new NorthButtonHandler(this));
		/************1.이벤트Source한개당 한개 이벤트핸들러[CASE1]********/
		/**************A.외부클래스를작성***************
		northBtn.addActionListener(new NorthButtonHandler());
		southBtn.addActionListener(new SouthButtonHandler());
		*/
		
		/**************B.내부클래스작성****************
		northBtn.addActionListener(new InnerNorthButtonHandler());
		southBtn.addActionListener(new InnerSouthButtonHandler());
		*/
		
		/************2.이벤트Source여러개를 이벤트핸들러한개처리[CASE2]********/
		/**************A.외부클래스를작성***************
		ButtonHandler bh=new ButtonHandler();
		northBtn.addActionListener(bh);
		southBtn.addActionListener(bh);
		*/
		/**************B.내부클래스를작성***************/
		/*
		 * 1.InnerClass객체생성
		 * 2.InnerClass객체멤버사용
		 */
		InnerButtonHandler bh=new InnerButtonHandler();
		northBtn.addActionListener(bh);
		southBtn.addActionListener(bh);
		
		
	}
	/****************************Inner Class****************************************/
	public class InnerButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			/*
			 InnerClass의 사용이유
			    - 내부클래스(객체)에서 외부클래스(객체)의
			      멤버변수,메쏘드 접근을 손쉽게하기위해서
			 */
			Object source=e.getSource();
			if(source==southBtn) {
				System.out.println("south button click");
			}else if(source==northBtn) {
				System.out.println("north button click");
			}
		}
	}
	
	public class InnerNorthButtonHandler implements ActionListener{
		int count;
		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			northBtn.setText("click count:"+count);
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			northBtn.setBackground(new Color(r,g,b));
			/*
			 * ActionEventJFrame[JFrame] 의 타이틀변경
			 */
			setTitle("click count:"+count);
			getContentPane().setBackground(new Color(b,r,g));
			
		}
	}
	public class InnerSouthButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			southBtn.setBackground(new Color(r,g,b));
			southBtn.setForeground(new Color(255-r,255-g,255-b));
			/*
			 * ActionEventJFrame[JFrame] 의 타이틀변경
			 */
			setTitle("SOUTH 버튼클릭");
			
		}
		
	}
	
	
	
	
	
	
	/**********************************************************************/
	public static void main(String[] args) {
		ActionEventJFrame f= new ActionEventJFrame();
		f.setVisible(true);
	}

}
