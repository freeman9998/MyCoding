package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NorthButtonHandler implements ActionListener{
    private int count;
    /*
    private ActionEventJFrame frame;
    public NorthButtonHandler(ActionEventJFrame frame) {
    	this.frame=frame;
    }
    */
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("이벤트발생시실행 쓰레드:"+Thread.currentThread().getName());
		//System.out.println("이벤트객체:"+e);
		/*
		 * 이벤트객체로부터 이벤트쏘스객체참조얻기
		 */
		JButton sourceBtn= (JButton)e.getSource();
		count++;
		sourceBtn.setText("click count:"+count);
		int r=(int)(Math.random()*256);
		int g=(int)(Math.random()*256);
		int b=(int)(Math.random()*256);
		sourceBtn.setBackground(new Color(r,g,b));
		/*
		 * ActionEventJFrame[JFrame] 의 타이틀변경
		 */
		/*
		frame.setTitle("click count:"+count);
		frame.getContentPane().setBackground(new Color(b,r,g));
		*/
	}

}
