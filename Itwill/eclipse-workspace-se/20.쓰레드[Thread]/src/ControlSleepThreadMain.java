import java.awt.Toolkit;
import java.util.Date;



class ControlSleepClockThread extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				Date now =new Date();
				System.out.println(now.toLocaleString());
				/*
				 * 현재실행중인 쓰레드를 1000 ms동안 sleep시킨다(실행중지)
				 */
				/*
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				toolkit.beep();
				*/
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
public class ControlSleepThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("1.main");
		System.out.println("2.main 쓰레드 3초간 sleep");
		Thread.sleep(3000);
		
		ControlSleepClockThread clockThread=new ControlSleepClockThread();
		clockThread.setName("Clock Thread");
		clockThread.start();
		
		
		System.out.println("3.main 쓰레드 10초간 sleep");
		Thread.sleep(10000);
		System.out.println("4.main 쓰레드 10초간 sleep후 깨어나서 실행");
		
		System.out.println("99.main return --> JVM");

	}

}
