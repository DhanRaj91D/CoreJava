
public class Dateofbirth {
	
		private int day;
		private int month;
		private int year;

	public Dateofbirth(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
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

	
	public String toString() {
		String str = "" + day + "/" + Getmonth(month) + "/" +year;
		return str;
	}
	
	private String Getmonth(int m)
	{
		String Month = "";
		switch(m)
		{
		
		
		case 1:
				Month = "Jan";
				break;
		
		case 2:
				Month = "Feb";
				break;
		case 3:
				Month = "Mar";
				break;
		case 4:
				Month = "Apr";
				break;
		case 5:
				Month = "May";
				break;
		case 6:
				Month = "Jun";
				break;
		case 7:
				Month = "Jul";
				break;
		case 8:
				Month = "Aug";
				break;
		case 9:
				Month = "Sep";
				break;
		case 10:
				Month = "Oct";
				break;
		case 11:
				Month = "Nov";
				break;
		case 12:
				Month = "Dec";
				break;
		}
		return Month;
	}
	

}
