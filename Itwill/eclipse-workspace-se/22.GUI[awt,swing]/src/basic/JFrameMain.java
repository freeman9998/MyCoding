package basic;

import java.awt.Color;

import javax.swing.JFrame;

/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)
 *   2.  컨테이너클래스객체생성
 *   3.  컨테이너객체의 크기설정
 *   6.  컨테이너객체 보여주기
 */
public class JFrameMain {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("나의 첫번째프레임");
		frame.getContentPane().setBackground(new Color(0,0,255));
		frame.setSize(300, 400);
		frame.setVisible(true);
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
