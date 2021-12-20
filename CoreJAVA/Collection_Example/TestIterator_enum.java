package TestCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestIterator_enum {
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("red","green","blue","white","orange","purple");
		List<Integer> listint= Arrays.asList(10,20,30,40,50,60,70);
		Iterator<Integer> it=listint.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		
		}
		it.next();
		it.remove();
		
		/*Enumeration<String> enumer = Collections.enumeration(list);
		
		//list.add("aaa");//collection is class having methoid enumeration study on it

		Vector<String> v= new Vector();
		v.add("earth");
		v.add("moon");
		v.add("jupiter");
		v.add("str");
			
		Enumeration<String> enumeration = v.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
			
		}*/
		

	}
}
