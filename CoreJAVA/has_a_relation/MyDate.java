package study.hasarelation;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate() {

		day = 1;
		month = 1;
		year = 2000;
	}

	public MyDate(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof MyDate) {
			MyDate temp = (MyDate) obj;
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
