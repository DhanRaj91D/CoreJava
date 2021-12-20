package exeption;

import java.io.IOException;
import java.util.InputMismatchException;

public class ThorwEx1 {

	public static void main(String[] args) {

		//f1(100);
		
		
		try {
			f2(555);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void f1(int i) {
		if(i>100) {
			throw new InputMismatchException();
		}
		else
			System.out.println("You entered right num");
		
	}

	private static void f2(int i) throws IOException {//compiler forces to use danger sign
		if(i>100) {
			throw new IOException();
		}
		else
			System.out.println("You entered right num");
		
	}

	
}
