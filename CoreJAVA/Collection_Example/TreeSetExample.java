package TestCollection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> ts  = new TreeSet<Integer>();
		ts.add(34);
		ts.add(23);
		ts.add(1);
		ts.add(78);
		ts.add(65);
		ts.add(23);  //this entry is not made 
		/*
		for(int i=0;i<ts.size();i++)
		{
			System.out.println(ts.get(i));
		}*/
		
		//traverse in INORDER 
		for(Integer num : ts)
			System.out.println(num);
		
		
		TreeSet<MyDate3>  ts2 = new TreeSet<MyDate3>(); // Natural ordering
		ts2.add(new MyDate3(1,1,2001));
		ts2.add(new MyDate3(10,12,2002));
		ts2.add(new MyDate3(11,1,2004));
		ts2.add(new MyDate3(13,12,2001));
		ts2.add(new MyDate3(10,12,2002));  //compareTo says that this node is already there
		
		for(MyDate3 d : ts2)
			System.out.println(d); //sorted order
		
		
		//TreeSet<Person2> ts3 = new TreeSet<>(new SortOnDOBBasis()); //order by the comparator
		
		
		
		
	}

}
