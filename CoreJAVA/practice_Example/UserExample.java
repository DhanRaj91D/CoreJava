package study.practiceExample;

public class UserExample {
	
	public static void main(String[] args) {
		Example.sample1();//static method can be called by just usinnfg class name 
		
		Example e1=new Example();
		e1.sample2();//we can calll non static method only by creating object of that class 
		
		new Example().sample2();//lambda method to call nonstatic method
		
		
	}

}
