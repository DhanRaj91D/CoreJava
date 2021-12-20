package study.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUser {
	
	public static void main(String[] args)  {
		
		ObjectInputStream oin=null;
		try {
			oin = new ObjectInputStream(new FileInputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\13\\try.bingo"));
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		Object obj=null;
		try {
			obj = oin.readObject();
		} catch (ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(obj);
		
	}

}
