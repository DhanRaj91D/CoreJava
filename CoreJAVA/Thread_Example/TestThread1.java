package study.thread;

public class TestThread1 {

	public static void main(String[] args) {
		
		Thread square=new SquareThread();
		square.setName("square...");
		square.start();
		
		Thread factorial = new FactorialThread();
		factorial.setName("factorial...");
		factorial.start();
		
		System.out.println("Main end here...");
	}// end of main

}// end of Testthread1

class SquareThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 50; i++) {

			System.out.println("Square of " + i + " : " + i * i+"  "+super.getName());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}

	}// end of run

}// end of class square

class FactorialThread extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 15; i++) {
			int fac = 1;

			for (int j = i; j > 0; j--) {

				fac = fac * j;

			} // end of inner for

			System.out.println("Factorial of "+i+" : "+fac+"  "+super.getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		} // end of outer for

	}// end of run

}// end of Factorial
