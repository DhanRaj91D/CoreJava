package BookExapmle;

import java.util.Comparator;

public class SortbyCost implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getBookCost() > o2.getBookCost()) {
			return 1;
		} else if (o1.getBookCost() < o2.getBookCost()) {
			return -1;

		} else {
			return 0;
		}

	}

}
