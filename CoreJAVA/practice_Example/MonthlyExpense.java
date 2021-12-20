package study.practiceExample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class MonthlyExpense {

	private ArrayList<ExpenseDetails> list;

	public MonthlyExpense() {

		list = new ArrayList<>();
	}

	public void addNewExpense(ExpenseDetails obj) throws NotCurrentMonthException {
		GregorianCalendar cal = new GregorianCalendar();

		if (obj.getExpenseDate().getYear() == cal.get(Calendar.YEAR)
				&& obj.getExpenseDate().getMonth() == cal.get(Calendar.MONTH) + 1) {

			list.add(obj);
			System.out.println("Object added sucsefuly....");
		} else {

			throw new NotCurrentMonthException();

		}
	}

	public void showAll() {

		Iterator<ExpenseDetails> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public double getTotalExpenditure() {
		Iterator<ExpenseDetails> it = list.iterator();
		double totalExpense = 0;
		while (it.hasNext()) {
			totalExpense = it.next().getExpenseAmount() + totalExpense;

		}

		return totalExpense;

	}
}
