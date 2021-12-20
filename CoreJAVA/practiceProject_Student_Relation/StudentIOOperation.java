package practiceProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentIOOperation implements Serializable {

	public static void writeToFile(List<Student> list) {
		
		
		ObjectOutputStream stud = null;
		try {
			stud = new ObjectOutputStream(new FileOutputStream("D:\\Student\\stud.db"));
			
				Iterator<Student> it = list.iterator();
				while (it.hasNext()) {
					Student obj=it.next();
					
					stud.writeObject(obj);
					
					//System.out.println(it.next());
					
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		
		
		finally
		{
			try {
				if(stud!=null)
				stud.flush();
			} catch (IOException e) {
				System.out.println(e);
			}
			try {
				if(stud!=null)
				stud.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

	public static List<Student> readFromFile() throws StudentDbNotfound {
		List<Student> list = new ArrayList<Student>();
		
		

		ObjectInputStream iobj = null;

		try {
			iobj = new ObjectInputStream(new FileInputStream("D:\\Student\\stud.db"));


			while(true) {
				
				Student oin = (Student)iobj.readObject();
				list.add( oin);
			}
		}
		catch (FileNotFoundException e) {
			throw new StudentDbNotfound();
		}
		catch (ClassNotFoundException | IOException e) {
			
		} 
		finally
		{
			try {
			  if(iobj!=null)
				iobj.close();
			} catch (IOException e) {
				
			}
		}
		
		
		return list;
	}
	
}
