package study.practiceExample;

import java.util.Scanner;

import javax.swing.tree.ExpandVetoException;

public class UserExpenseDetails {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		/*System.out.println("How many obj you want to create :");
		int qty=sc.nextInt();
		ExpenseDetails []arr=new ExpenseDetails[qty];
		
		for (int i = 0; i <=arr.length+1; i++) {
			
			populateExpenseDetails(arr,sc);
			
		}
		*/
		ExpenseDetails e1=populateExpenseDetails(sc);
		System.out.println(e1);
		ExpenseDetails e2=populateExpenseDetails(sc);
		System.out.println(e2);
		ExpenseDetails e3=populateExpenseDetails(sc);
		System.out.println(e3);
		
		e1.isSame(e2);
		
		
	}//end of main

	private static  ExpenseDetails populateExpenseDetails(Scanner sc) {
		
		System.out.println("Enter the expenseDescription : ");
		sc.next();
		String expenseDescription=sc.nextLine();
		System.out.println("Enter the expenseAmount : ");
		double expenseAmount =sc.nextDouble();
		
		System.out.println("Enter the expancedate ddmmyyyy: ");
		int day=sc.nextInt();
		int month =sc.nextInt();
		int year=sc.nextInt();
		
		ExpenseDetails e=new ExpenseDetails();
		e.setExpenseAmount(expenseAmount);
		e.setExpenseDescription(expenseDescription);
		e.setExpenseDate(new MyDate(day, month, year));
		
		return e ;
	}

	private static ExpenseDetails populateExpenseDetails(ExpenseDetails[] arr, Scanner sc) {//overlodade method
		sc.reset();
		System.out.println("Enter the expenseDescription : ");
		String expenseDescription=sc.nextLine();
		System.out.println("Enter the expenseAmount : ");
		double expenseAmount =sc.nextDouble();
		
		System.out.println("Enter the expancedate ddmmyyyy: ");
		int day=sc.nextInt();
		int month =sc.nextInt();
		int year=sc.nextInt();
		
		ExpenseDetails e=new ExpenseDetails();
		e.setExpenseDescription(expenseDescription);
		e.setExpenseAmount(expenseAmount);
		e.setExpenseDate(new MyDate(day, month, year));
		
		return e ;
		
		
	}

}//end of UserExpenseDetails
