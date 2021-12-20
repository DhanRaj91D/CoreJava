package study.thread;

public class WithdrawThread implements Runnable {

	Account acc;

	public WithdrawThread(Account acc) {
	
		this.acc = acc;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			acc.withdraw(100);
			System.out.println("Balance after withdrwal : "+acc.getBalance());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}

}
