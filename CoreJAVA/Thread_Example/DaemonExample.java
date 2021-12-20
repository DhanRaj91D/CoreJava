package study.thread;

public class DaemonExample {

	public static void main(String[] args) {
		new Thread(new CompanyThread()).start();/*Lambda expression
		you can write it like 
		
		Thread company =new Thread(new CompanyThread());
		comapny,start();
		*
		*/
		Thread chai=new Thread(new ChaiwalaThread());
		chai.setDaemon(true);
		chai.start();
		System.out.println("Main ends.........");
	}//end of main

}//end of DaemonExample 

class CompanyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {

			System.out.println("Company working ..........");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}//end of for 

	}//end of run 

}//end of CompanyThread


class ChaiwalaThread implements Runnable{

	@Override
	public void run() {
		while(true) {
			
			System.out.println("Chiwala");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}