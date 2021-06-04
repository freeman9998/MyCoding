package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SouthButtonHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton sourceBtn=(JButton)e.getSource();
		int r=(int)(Math.random()*256);
		int g=(int)(Math.random()*256);
		int b=(int)(Math.random()*256);
		
		sourceBtn.setBackground(new Color(r,g,b));
		sourceBtn.setForeground(new Color(255-r,255-g,255-b));
		/*
		 * ActionEventJFrame[JFrame] 의 타이틀변경
		 */
	}
		
}
