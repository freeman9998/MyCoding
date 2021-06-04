package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton sourceBtn=(JButton)e.getSource();
		
		String command = sourceBtn.getActionCommand();
		if(command.equals("SB")) {
			System.out.println("south button click!!!");
		}else if(command.equals("NB")) {
			System.out.println("north button click!!!");
			
		}
	}
	
}
