package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import TestCollection.MyDate3;

public class UserSerializable {

	public static void main(String[] args)   {

		ObjectOutputStream pstream=null;
		try {
			pstream = new ObjectOutputStream(
					new FileOutputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\13\\try.bingo"));
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		Student stud = new Student("Dhanraj", new MyDate3(10, 11, 2021), 1);
		
		try {
			pstream.writeObject(stud);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			pstream.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			pstream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
