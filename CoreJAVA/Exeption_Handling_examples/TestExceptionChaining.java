package exeption;

import java.io.IOException;
import java.util.Scanner;

public class TestExceptionChaining {

	public static void main(String[] args) {
		try {
			manager();
		} catch (NumberFormatException ne) {
			System.out.println("number dalna tha...cchodo no problem");
		}
		catch (Exception ne) {
			System.out.println("are exception aal");
		}
	}

	public static void supervisor() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();

	
			//throw new IOException();
		
			
		
		int x = Integer.parseInt(s);

	}

	public static void manager() throws Exception {
		supervisor();
	}
}
