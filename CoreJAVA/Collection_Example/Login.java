package TestCollection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> log = new HashMap<>();

		log.put("a1", "aaa");
		log.put("a2", "bbb");
		log.put("a3", "ccc");
		log.put("a4", "ddd");
		log.put("a5", "eee");
		log.put("a6", "fff");
		log.put("a7", "ggg");
		log.put("a8", "hhh");
		
		login(log);

		/*while (true) {
			System.out.println("********Operations available********** ");
			System.out.println("**************************************");
			System.out.println("1.Login \n2.show All login pass\n3.Reset Password\n4.Quit");
			System.out.println("**************************************");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			if (choice == 4) {
				break;
			}
			switch (choice) {

			case 1: {
				System.out.println("Enter login ID and Password :");
				String uname = sc.next();
				String pass = sc.next();
				if (log.get(uname) != null) {

					if (pass.equals(log.get(uname))) {
						System.out.println("welcome " + log.get(uname));
					} else {
						System.out.println("wrong password");
					}

				} else {

					System.out.println("wrong username");

				}

				break;
			}

			case 2: {
				Set<String> keys = log.keySet();
				for (String key : keys)
					System.out.println("User Name : " + key + " Password : " + log.get(key));
				break;
			}

			case 3: {
				System.out.println("To reset password \nEnter the login Id ");
				String key = sc.next();
				System.out.println("Enter the old password ");
				String oldValue = sc.next();
				System.out.println("Enter the new Password ");
				String newValue = sc.next();
				if (log.replace(key, oldValue, newValue)) {
					System.out.println("Password set successfull");
				} else {
					System.out.println("Error password not set try again");
				}

				break;
			}

			}
		}*/

	}

	/*private static void showContain(HashMap<String, String> log) {
		Set<String> keys = log.keySet();
		for (String key : keys)
			System.out.println("User Name : " + key + " Password : " + log.get(key));
	}*/

	private static void login(HashMap<String, String> log) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter login ID and Password :");
		String uname = sc.next();
		String pass = sc.next();
		if (log.get(uname) != null) {

			if (pass.equals(log.get(uname))) {
				System.out.println("welcome " + log.get(uname));
				while (true) {
					System.out.println("********Operations available********** ");
					System.out.println("**************************************");
					System.out.println("1.show login pass\n2.Reset Password\n3.Logout");
					System.out.println("**************************************");
					System.out.println("Enter your choice");
					int choice = sc.nextInt();

					if (choice == 3) {
						break;
					}
					switch (choice) {

					case 1: {
						System.out.println("User Name : " + uname + " Password : " + log.get(uname));
						break;
					}

					case 2: {
						System.out.println("To reset password ");
						System.out.println("Reconform old password ");
						String oldValue = sc.next();
						System.out.println("Enter the new Password ");
						String newValue = sc.next();
						if (log.replace(uname, oldValue, newValue)) {
							System.out.println("Password set successfull");
						} else {
							System.out.println("Error password not set try again !!!");
						}

						break;
					}

					}
				}

			} else {
				System.out.println("wrong password!!! Try again");
				login(log);
			}

		} else {

			System.out.println("wrong username !!!! try again");
			login(log);

		}

	}

}
