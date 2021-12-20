package study.practiceExample;

import java.util.Comparator;

public class SortByCost implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getCost() > o2.getCost())
			return 1;
		else if (o1.getCost() < o2.getCost())
			return -1;
		else
			return 0;
	}
}
