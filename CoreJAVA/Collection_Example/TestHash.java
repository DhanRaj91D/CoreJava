package TestCollection;

import java.util.HashSet;

public class TestHash {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(34);
		hs.add(23);
		hs.add(1);
		hs.add(78);
		hs.add(65);

		for (Integer num : hs)
			System.out.println(num); // bucket order

		HashSet<MyDate3> hs2 = new HashSet<MyDate3>();

		hs2.add(new MyDate3(1, 1, 2001));
		MyDate3 d1 = new MyDate3(10, 12, 2002);
		hs2.add(d1);
		hs2.add(new MyDate3(11, 1, 2004));
		hs2.add(new MyDate3(13, 12, 2001));
		MyDate3 d2 = new MyDate3(10, 12, 2002);
		hs2.add(d2);

		System.out.println("Equals" + d1.equals(d2));
		System.out.println("Hashcode of d1 " + d1.hashCode());
		System.out.println("Hashcode of d2 " + d2.hashCode());

		for (MyDate3 d : hs2)
			System.out.println(d);

	}

}

