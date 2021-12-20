package study.practiceExample;

import java.util.Random;

public class UserGame {
	
	public static void main(String[] args) {
		
		Random obj = new Random();
		int randomNo = obj.nextInt(100);
		
		System.out.println(randomNo);

	}

}
