package study.practiceExample;

public class MyDate  {

	private int day;
	private int month;
	private int year;

	public MyDate() {
		day = 31;
		month = 12;
		year = 2000;
	}

	public MyDate(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	@Override
	public boolean equals(Object obj) {
		MyDate temp=(MyDate)obj;
		if(temp.day==this.day && temp.month==this.month && temp.year==this.year)
		{
			return true;
		}
		return false;
		
		
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
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
	
	

}
