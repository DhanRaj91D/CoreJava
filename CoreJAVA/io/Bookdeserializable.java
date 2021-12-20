package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bookdeserializable {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\13\\book.bingo"));
		List<Object> list = new ArrayList<Object>();
		while (true) {

			try {
				list.add(oin.readObject());
 
			} catch (Exception e) {
				System.out.println("End of object");
				break;// if you cannot break the loop loop remains true and bwlow code get out of  reach
			}

		}

		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		

	}
}
