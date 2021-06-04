import java.util.Scanner;

import javax.swing.JOptionPane;

class ControlStopThread extends Thread{
	private boolean isPlay;
	private int count;
	public ControlStopThread() {
		isPlay=true;
		count=0;
	}
	
	public boolean isPlay() {
		return isPlay;
	}

	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}

	@Override
	public void run() {
		
		while (isPlay) {
			
			System.out.print("A");
			System.out.print("B");
			System.out.print("C");
			System.out.print("D");
			System.out.print("E");
			System.out.print("F");
			System.out.print("G");
			System.out.print("H");
			System.out.print("I");
			System.out.print("J");
			System.out.print("K");
			System.out.print("L");
			System.out.print("M");
			System.out.print("N");
			System.out.print("O");
			System.out.print("P");
			System.out.print("Q");
			System.out.print("R");
			System.out.print("S");
			System.out.print("T");
			System.out.print("U");
			System.out.print("V");
			System.out.print("W");
			System.out.print("X");
			System.out.print("Y");
			System.out.print("Z");
			System.out.println();
			count++;
			if(count==1000) {
				//isPlay=false;
			}
		}
		return;//쓰레드가 JVM반환
	}
}





public class ControlStopThreadMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1.main");
		ControlStopThread cst=new ControlStopThread();
		cst.setName("stop쓰레드");
		System.out.println("2.main");
		cst.start();
		String inputNo = JOptionPane.showInputDialog("쓰레드를 죽일방법을선택하세요[1.stop 2.isPlay변수변경]");
		int stopNo = Integer.parseInt(inputNo);
		switch (stopNo) {
		case 1:
			/*
			 * case 1
			 *  - 호출한순간종료 
			 */
			cst.stop();
			
			break;

		case 2:
			/*
			 * case 2
			 *   - 조건변경으로 종료(isPlay-->false)
			 *   - 현재진행중인 작업을 마무리하고 종료
			 */
			cst.setPlay(false);
			
			break;
		}
		
		//System.out.println("99.main return");

	}

}










