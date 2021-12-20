package study.thread;

public class Account {

	private int balance;

	private static final int MAX_BALANCE = 15000;
	private static final int MIN_BALANCE = 800;

	public Account() {

		balance = 10000;
	}

	public Account(int balance) {

		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {

		synchronized (this) {
			this.balance = this.balance - amount;
			System.out.println("Withdrow is notifying.....");
			this.notifyAll();
		}

	}

	public void deposit(int amount) {

		while ((this.balance + amount) > MAX_BALANCE) {

			
			try {
				System.out.println("Deposit Waiting.......Balance is more than 15000");
				this.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		synchronized (this) {
			this.balance = this.balance + amount;

		}

	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

}
