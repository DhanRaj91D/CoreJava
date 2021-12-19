package HashmapExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Usermap {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Integer, String> map=new HashMap<>();
		
		
		boolean flag = true;
		while (flag) {

			System.out.println("Operations available: ");
			System.out.println("********************************");
			System.out.println("1. Add pairs to map\r\n" + "2.Show all roll no\r\n" + "3. Show all names\r\n"+"4. Quit\\r\\n"
					);
			System.out.println("********************************");

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				populatemap(map,sc);
				break;
			case 2:
				showallRollno(map);
				break;
			case 3:
				showAllNames(map);
				break;
			case 4:
				flag=false;
				break;

			default:
				System.out.println("wrong entry.....");
				break;
			}// end of switch

		} // end of while
		
		
		
		
	

	
		
		
	}//end of main

	private static void populatemap(HashMap<Integer, String> map, Scanner sc) {
		System.out.println("How many pairs you want to save : ");
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the rollnumber :");
			int key=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name :");
			String value =sc.nextLine();
			map.put(key, value);
		}
		
	}

	private static void showAllNames(HashMap<Integer, String> map) {
		System.out.println("All names are : ");
		Collection<String> names =map.values();
		for(String name : names )
			System.out.println(name);
		
	}

	private static void showallRollno(HashMap<Integer, String> map) {
		
		System.out.println("All RollNos are :");
		Set<Integer> keys=map.keySet();
		Iterator<Integer> it=keys.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}//end of usermap
