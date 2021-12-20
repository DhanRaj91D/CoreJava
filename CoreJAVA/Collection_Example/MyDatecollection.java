package TestCollection;

import java.util.Collection;
import java.util.Iterator;

public class MyDatecollection implements Comparable<MyDatecollection> {

	private int day, month, year;

	public MyDatecollection(int day, int month, int year) {

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
	public String toString() {
		return "MyDatecollection [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public int compareTo(MyDatecollection o) {
		if (this.year > o.year)
			return 1;
		if (this.year < o.year)
			return -1;
		else {
			if (this.month > o.month)
				return 1;
			if (this.month < o.month)
				return -1;
			else {
				if (this.day > o.day)
					return 1;
				if (this.day < o.day)
					return -1;
				else
					return 0;
			}

		}

	}

}
