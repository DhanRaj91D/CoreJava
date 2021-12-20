package exeption;

public class MyDateExeptry {
	private int day;
	private int month;
	private int year;

	public MyDateExeptry() {

		day = 1;
		month = 1;
		year = 2000;
	}

	public MyDateExeptry(int day, int month, int year) throws WrongMonthException {

		if(day>31) {
			throw new WrongDayException();
		}
		else {
			this.day = day;
		}
		if (month > 12) {
			throw new WrongMonthException();
			
		}
		else {
			this.month = month;
		}
		
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>31) {
			throw new WrongDayException();
		}
		else {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws WrongMonthException {
		if (month > 12) {
			throw new WrongMonthException();
			
		}
		else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof MyDateExeptry) {
			MyDateExeptry temp = (MyDateExeptry) obj;
			if (this.day == temp.day && this.month == temp.month && this.year == temp.year) {
				return true;
			} else
				return false;
		} else
			return false;

	}

	@Override
	public String toString() {
		String str = "";
		return str += "" + day + "/" + month + "/" + year + ".";
	}

}
