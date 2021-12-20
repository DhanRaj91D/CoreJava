package TestCollection;

import java.io.Serializable;

public class MyDate3 implements Comparable<MyDate3>,Serializable {
		private int day, month, year;

		@Override
		public boolean equals(Object obj) {
			MyDate3 temp = (MyDate3) obj;
			if (temp.day == this.day && temp.month == this.month && temp.year == this.year)
				return true;
			return false;
		}

		@Override
		public int hashCode() {
			String s = day + "" + month + "" + year; // 10102001
			int hc = Integer.parseInt(s);
			return hc;
		}

		public MyDate3() {
			// TODO Auto-generated constructor stub
		}

		public MyDate3(int day, int month, int year) {
			super();
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
			return "MyDate3 [" + day + "-" + month + "-" + year + "]";
		}

		@Override
		public int compareTo(MyDate3 o) {

			System.out.println("compare to called for " + this + " and " + o);

			if (this.year > o.year)
				return 1;
			if (this.year < o.year)
				return -1;
			else // year is same
			{
				if (this.month > o.month)
					return 1;
				if (this.month < o.month)
					return -1;
				else // month is same
				{
					if (this.day > o.day)
						return 1;
					if (this.day < o.day)
						return -1;
					else // day is same
						return 0;
				}
			}

		}

	}



