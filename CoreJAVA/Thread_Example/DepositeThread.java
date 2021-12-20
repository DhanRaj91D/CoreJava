package study.thread;

public class DepositeThread implements Runnable {

	Account acc;

	public DepositeThread(Account acc) {

		this.acc = acc;
	}

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			acc.deposit(1000);

			System.out.println("Balance after deposite : " + acc.getBalance());

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
