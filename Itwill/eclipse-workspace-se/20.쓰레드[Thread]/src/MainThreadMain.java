/*
쓰레드(thread)(실행흐름): 
   - 프로그램코드를 실행시키는 힘 
   - 메인쓰레드,AWT(GUI) 쓰레드,사용자정의 쓰레드
   - 언제 만드냐--> 두가지일을 동시에 해야할때..
 
 
- 쓰레드객체 만드는 방법(형식) 

	Type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
	  메쏘드원형:public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
	
    Type B:
	1. Runnable interface를 implements 한다.
	2. Runnable interface를 implements 한객체를
	   Thread 클래스의 생성자에 넣어서 Thread 객체를 생성한다
    3. Thread 를 시작시킨다.

   형식>>
    1. Thread 클래스를 상속받아서 만든다..
      ex> public class ThreadEx extends Thread{
          		// run 메쏘드를 재정의 해야한다.
          		 public void run(){
          		 	//사용자가만든 쓰레드 가 실행할코드
          		 }
          } 
    2. Runnable interface를 implements 해서만든다
      ex>  public class ThreadImpl implements Runnable{
           		public void run(){
          		 }
           } 
┏(^_^)┛

└(^_^)┓
*/
class MainThreadCalled{
	public void main_thread_called_method() {
		System.out.println("\t A."+Thread.currentThread().getName()+" 쓰레드 실행");
		System.out.println("\t B."+Thread.currentThread().getName()+" 쓰레드 반환");
		return;
	}
}
public class MainThreadMain {
	public static void main(String[] args) {
		/*
		 현재코드를 실행시키는 쓰레드의 쓰레드객체얻기
		 */
		Thread mainThread = Thread.currentThread();
		String currentThreadName = mainThread.getName();
		int priority = mainThread.getPriority();
		System.out.println("main thread name:"+currentThreadName);
		System.out.println("main thread priority:"+priority);
		MainThreadCalled mtc=new MainThreadCalled();
		System.out.println("1."+Thread.currentThread().getName()+" 쓰레드");
		mtc.main_thread_called_method();
		System.out.println("2."+Thread.currentThread().getName()+" 쓰레드");
		
		
		
	}

}


















