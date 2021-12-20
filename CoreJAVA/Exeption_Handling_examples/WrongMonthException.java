package exeption;

public class WrongMonthException extends Exception {
	
	public WrongMonthException() {
		super("month are only in between 1 to 12");
	}

}
