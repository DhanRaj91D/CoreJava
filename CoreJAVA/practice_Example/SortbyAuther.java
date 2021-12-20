package study.practiceExample;

import java.util.Comparator;

public class SortbyAuther implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuther().compareTo(o2.getAuther());
	}

}
