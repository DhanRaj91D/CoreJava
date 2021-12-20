package User.inheretance;
import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;
import study.hasarelation.MyDate;
import study.inheretance.Patient;

public class User3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of patient : ");
		int size = sc.nextInt();
		Patient[] arr = new Patient[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = populatePatient(sc);
		}
		

		System.out.println("**********************************");
		showPatientnamediseasedesc(arr);
		System.out.println("**********************************");
		showChildren(arr);
		System.out.println("**********************************");

	}

	private static void showChildren(Patient[] arr) {
		GregorianCalendar obj = new GregorianCalendar(10, 11, 2021);
		System.out.println(obj.getCalendarType());
		int todaysYear = obj.get(Calendar.YEAR);
		for (int i = 0; i < arr.length; i++) {
			MyDate temp = arr[i].getDob();

			int ageY = todaysYear - temp.getYear();
			if (ageY < 18) {
				System.out.println("Patient is Children : " + arr[i].getName());
			}
		}

	}

	private static void showPatientnamediseasedesc(Patient[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(
					"Name of patient : " + arr[i].getName() + ", Disesase Description : " + arr[i].getDisesaseDesc());
		}
	}

	private static Patient populatePatient(Scanner sc) {
		System.out.println("Enter the name of patient : ");
		sc.next();
		String name = sc.nextLine();
		System.out.println("enter the Date of Birth in dd mm yyyy format : ");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		MyDate dob = new MyDate(day, month, year);
		System.out.println("Enter the Disesase Description : ");
		sc.next();
		String disesaseDesc = sc.nextLine();

		Patient p = new Patient(name, dob, disesaseDesc);

		return p;
	}

}
