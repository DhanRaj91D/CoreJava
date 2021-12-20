package study.thread;

public class ThreadjoinExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread hi=new Thread(new T1());
		hi.setPriority(Thread.MAX_PRIORITY);
		hi.setName("hi");
		
		Thread hello= new Thread(new T1());
		hello.setPriority(Thread.MIN_PRIORITY);
		hello.setName("hello");
		
		hi.start();
		hello.start();
		hi.join();/*join API : caller thread waits till the called thread running and
		 the n caller thjread exicte after running iof called thread */
		hello.join();// same here main will waits till the end of hello thread 
		
		System.out.println("Goodbye ..............");
	}

}


class T1 implements Runnable
{

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(" Say "+Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
		}
		
	}

	
	
	
}