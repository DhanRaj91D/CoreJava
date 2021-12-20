package WrapperEx;

import java.util.Scanner;

/*1.	 Write a class WrapperExample
a. Write a main method  ----  accept a new password from user
				     pass that password to a verify(pwd)  , this method returns a boolean
					If password is valid then returned value is true  , else false
				     check if password is valid , if yes then say congratulations your password is set
					Else ask the user to reenter ---Loop for 5 times in case of invalid pwd
					
b. Write a method     boolean  verify(String p )  ( use charAt, length API of String class  ,
 use Character.isDigit, isLetter,isUpperCase,isLowerCase,……..   )
			Return true only if password satisfies the following condition , else return false
			1. The password length must be between 8 and 20
			2. The password must begin with a letter 
			3. The password must have at least one capital character
			4. The password must have at least one digit 
			5. The password must have at least one small character
			6. The password must have at least one special char ====>>>       _   -  #  $*/
public class WrapperExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i != 5) {
			System.out.println("Enter the passward : ");
			String pass = sc.next();
			boolean ch = verify(pass);
			if (ch == true) {
				System.out.println("congratulations your password is set");
				break;
			} else {
				System.out.println("Wrong passward pattern reenter password :");
				i++;
			}

		}
		sc.close();

	}

	private static boolean verify(String pass) {

		int len = pass.length();
		boolean firstLetter = Character.isLetter(pass.charAt(0));
		boolean capLetter = false;
		boolean smallLetter = false;
		boolean digit = false;
		boolean specialChar = false;
		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(pass.charAt(i))) {
				capLetter = true;
			}
			if (Character.isDigit(pass.charAt(i))) {
				digit = true;
			}
			if (Character.isLowerCase(pass.charAt(i))) {
				smallLetter = true;
			}
			if (pass.charAt(i) == '_' || pass.charAt(i) == '-' || pass.charAt(i) == '#' || pass.charAt(i) == '$') {
				specialChar = true;
			}
		}

		if ((len >= 8 && len <= 20) && firstLetter && capLetter && smallLetter && digit && specialChar) {
			return true;
		}
		return false;
	}

	/*
	 * if (pass.length() >= 8 && pass.length() <= 20) { if
	 * (Character.isLetter(pass.charAt(0))) { int u = 0; for (int i = 0; i <
	 * pass.length(); i++) {
	 * 
	 * if (Character.isUpperCase(pass.charAt(i))) { u++; }
	 * 
	 * } if (u >= 1) { int d = 0; for (int i = 0; i < pass.length(); i++) {
	 * 
	 * if (Character.isDigit(pass.charAt(i))) { d++; }
	 * 
	 * }
	 * 
	 * if (d >= 1) { int s = 0; for (int i = 0; i < pass.length(); i++) {
	 * 
	 * if (Character.isLowerCase(pass.charAt(i))) { s++; } }
	 * 
	 * if (s >= 1) { for (int i = 0; i < pass.length(); i++) {
	 * 
	 * if (pass.charAt(i) == '_' || pass.charAt(i) == '-' || pass.charAt(i) == '#'
	 * || pass.charAt(i) == '$') { return true; }
	 * 
	 * }
	 * 
	 * 
	 * } else { return false; }
	 * 
	 * } else { return false; }
	 * 
	 * } else { return false; }
	 * 
	 * }
	 * 
	 * return true; }
	 * 
	 * else return false;
	 * 
	 * }
	 */

}
