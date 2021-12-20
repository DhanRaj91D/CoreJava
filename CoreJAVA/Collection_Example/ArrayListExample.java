package TestCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> myList = new LinkedList <Integer>();
		
		while(true) {
			int key;
		System.out.println("");
		System.out.println("** MENU **\n1)Populate list \n2)Showlist \n3)Sum \n4)remove element");
		System.out.println("Enter your choice:");
		sc.reset();
key = sc.nextInt();

		switch (key) {
		case 1:
			populateList(myList);

			break;
		case 2:
			showList(myList);

			break;
		case 3:
			System.out.println(sumAll(myList));

			break;
		case 4:
			removeElement(myList);

			break;
		default:
			break;
		}

		}

	}

	public static void showList(List<Integer> list) {

		for (int s : list) {
			System.out.println(s);
		}

	}

	public static int sumAll(List<Integer> list) {

		int sum = 0;
		int size=list.size();
		for (int i = 0; i < size ; i++) {
			sum = sum + list.get(i);
		}

		return sum;

	}

	public static void populateList(List<Integer> list) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Did you want to Insert or append?&enter no to exit :");
			String str = sc.next();
			if (str.equalsIgnoreCase("Insert")) {

				System.out.println("To insert enter the index and element: ");
				int index = sc.nextInt();
				if (index > list.size()) {
					System.out.println("you entered wrong position to insert");
					System.out.println("Enetr index less than" + list.size());

				} else {
					System.out.println(" enter the element: ");
					int element = sc.nextInt();
					list.add(index, element);
				}

			}

			else if (str.equalsIgnoreCase("append")) {

				System.out.println("Enter number you want to Insert");
				int num = sc.nextInt();
				list.add(num);
				

			} else if (str.equalsIgnoreCase("no")) {

				break;

			}

		}

		

	}

	public static void removeElement(List<Integer> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Did you want to remove by index or by value?");
		String str = sc.next();
		if (str.equalsIgnoreCase("index")) {
			int index = sc.nextInt();
			

			if (index > list.size()) {
				System.out.println("you entered wrong position to insert");
				System.out.println("Enetr index less than" + list.size());

			} else {
				System.out.println("Enter index you want to remove ");
				list.remove(index);
			
			}

		}

		else if (str.equalsIgnoreCase("value")) {

			System.out.println("Enter value you want to remove");
			int val = sc.nextInt();
			list.remove(val);

		}

		
	}
}
