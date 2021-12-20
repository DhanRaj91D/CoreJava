package study.practiceExample;

public class ExpenseDetails {
	private String expenseDescription;
	private double expenseAmount; 
	private MyDate expenseDate;
	public ExpenseDetails() {
		
	}
	public String getExpenseDescription() {
		return expenseDescription;
	}
	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}
	public double getExpenseAmount() { 
		return expenseAmount;
	}
	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public MyDate getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(MyDate expenseDate) {
		this.expenseDate = expenseDate;
	}
	@Override
	public String toString() {
		return "ExpenseDetails [expenseDescription=" + expenseDescription + ", expenseAmount=" + expenseAmount
				+ ", expenseDate=" + expenseDate + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		ExpenseDetails temp=(ExpenseDetails)obj;
		
		if(temp.expenseDescription.equals(this.expenseDescription)&&temp.expenseAmount==this.expenseAmount&& temp.expenseDate.equals(this.expenseDate))
			return true;
		
		return false;
		
	}
	
	public void isSame(Object obj) {
		ExpenseDetails temp=(ExpenseDetails)obj;
		if(this.equals(temp)) {
			System.out.println("Duplicate expence........");
		}
	}
	

}
