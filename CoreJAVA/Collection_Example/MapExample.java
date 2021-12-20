package TestCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapExample {
	
	
	public static void main(String[] args) {
		
	
	//TreeMap<Integer, String>  tm = new TreeMap<Integer, String>();
	HashMap<Integer, String> tm = new HashMap<Integer, String>();
				
	tm.put(34,"sonal");
	tm.put(55,"raju");
	tm.put(3,"bandu");
	tm.put(36,"akka");
	tm.put(55,"sanju");
	
	Set<Integer> keys = tm.keySet();
	System.out.println("All the Keys are ");
	for(Integer key :keys)
		System.out.println(key);
	
	System.out.println("All the Values are ");
	Collection<String> names = tm.values();
	for(String n : names)
		System.out.println(n);
	
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the roll number");
		int roll = sc.nextInt();
		String name = tm.get(roll);
		System.out.println(roll+" "+name);
		

	}
}
