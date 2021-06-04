class CreateCustomThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("가."+Thread.currentThread().getName()+" 쓰레드 실행");
			System.out.println("나."+Thread.currentThread().getName()+" 쓰레드 return");
		}
	}
}
public class CreateCustomThreadMain {
	public static void main(String[] args) {
		System.out.println("1.main thread");
		//3. Thread 객체를 생성한다.
		CreateCustomThread cct=new CreateCustomThread();
		cct.setName("myThread");
		//4. Thread 객체를통해서 새로운 Thread를 시작시킨다
		cct.start();
		/*
		<< public void start() >>
		 Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
		 	- The result is that two threads are running concurrently: 
		 	 	the current thread (which returns from the call to the start method) and 
		 	 	the other thread (which executes its run method).
			- It is never legal to start a thread more than once. 
				In particular, a thread may not be restarted once it has completed execution.
		 */
		//cct.run();
		/*
		 
		 */
		while(true) {
			System.out.println("2.main thread");
		}
	}

}
