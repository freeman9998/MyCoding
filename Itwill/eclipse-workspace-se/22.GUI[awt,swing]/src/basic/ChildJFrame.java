package basic;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */
public class ChildJFrame extends JFrame{
	private JButton confirmBtn;
	private JButton cancleBtn;
	private Container contentPane;
	
	public ChildJFrame() {
		contentPane=this.getContentPane();
		
		setSize(300, 400);
		contentPane.setBackground(new Color(128,128,0));
		setTitle("상속에의한JFrame준비");
		//4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
		confirmBtn=new JButton("확인");
		cancleBtn=new JButton("취소");
		confirmBtn.setBounds(40, 40, 80, 40);
		cancleBtn.setBounds(130, 40, 80, 40);
		
		contentPane.setLayout(null);
		
		// 5.  컨테이너(JFrame-->ContentPane)에 컴포넌트 부치기(add) 
		contentPane.add(confirmBtn);
		contentPane.add(cancleBtn);
		
	}
	
	public static void main(String[] args) {
		ChildJFrame cframe=new ChildJFrame();
		/*
		cframe.setSize(300, 400);
		cframe.getContentPane().setBackground(new Color(0,0,0));
		cframe.setTitle("상속에의한JFrame준비");
		*/
		cframe.setVisible(true);
		/*
		 * Container[JFrame].setVisible(true);
		 *   - 메인쓰레드가 호출하면[호출되면] JVM이 GUI쓰레드를 생성
		 *   - GUI쓰레드는 무한대기 하면서이벤트와 그래픽 처리를 담당
		 *   - Container[JFrame] 는 계속떠있다.
		 *      (JVM이 종료되지않는다)
		 */
		return;
	}
	
}
