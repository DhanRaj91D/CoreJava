package exeption;

public class WrongDayException extends RuntimeException {
	
	public WrongDayException() {
		super("Date are in only 1 to 31");
	}

}
