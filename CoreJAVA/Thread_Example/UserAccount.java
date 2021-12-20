package study.thread;

public class UserAccount {
	
	public static void main(String[] args) {
		
		Account ac= new Account();/* as we are using ac to do operation 
		of withdrow and diposit using threads and the object account is 
		created on heape it is shared data in both thread and hence the race 
		condition setuation get started there to avoid it we need to do syncronization 
		on critical secton so the operation become thread safe so we make fuction wreeten in acoount clase thread safe by
		using syncronized key word
		*/
		
		
		Thread deposite =new Thread(new DepositeThread(ac));
		Thread withdraw =new Thread(new WithdrawThread(ac));
		
		deposite.start();
		withdraw.start();
		
		System.out.println("Main ends.........");
		
		
		
	}

}
