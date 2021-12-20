package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadCity {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			List<String> list = new ArrayList<>();// array list created 
			FileInputStream str = new FileInputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\13\\citys.txt");// file input claass used to read the datra from file location 
			Scanner sc = new Scanner(str);//scanner is alwase used to read data from buffer 
			while (sc.hasNext()) {//to print alll element from file
				String str1=sc.next();
				System.out.println(str1);
				list.add(str1);// element come from file added to arry list 
			}
			
			System.out.println("***********************");
			Collections.sort(list);//using collection class function sort done on arry list 
			for(String st : list)
				System.out.println(st);// sorted arry list printed 
			

			sc.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
