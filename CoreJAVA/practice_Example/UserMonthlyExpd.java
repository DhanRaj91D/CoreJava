package study.practiceExample;

import java.util.Scanner;

public class UserMonthlyExpd {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		MonthlyExpense m=new MonthlyExpense();
		System.out.println("How many expence do you want to add : ");
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			try {
				m.addNewExpense(populateExpenseDetails(sc));
			} catch (NotCurrentMonthException e) {
				i=i-1;
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("***********************************");
		
		m.showAll();
		
		System.out.println("***********************************");
		
		System.out.println(m.getTotalExpenditure());
		
		
		System.out.println("***********************************");
		
		
	}//end of main

	private static  ExpenseDetails populateExpenseDetails(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter the expenseDescription : ");
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

}//end of UserMonthlyExpd



