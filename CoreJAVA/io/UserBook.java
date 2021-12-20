 package study.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import TestCollection.MyDate3;

public class UserBook {
	public static void main(String[] args) {

		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\13\\book.bingo"));
			Book b = new Book("ddddd", "sssss", 500, new MyDate3(11, 11, 2011));
			out.writeObject(b);
			Book b1 = new Book("fff", "ggg", 2000, new MyDate3(5, 11, 2021));
			out.writeObject(b1);
			Book b2 = new Book("ss", "gggg", 6000, new MyDate3(11, 1, 2016));
			out.writeObject(b2);
			Book b3 = new Book("kkkk", "rfr", 6300, new MyDate3(11, 6, 2011));
			out.writeObject(b3);
			Book b4 = new Book("gghh", "kkkk", 900, new MyDate3(6, 11, 2022));
			out.writeObject(b4);
			out.flush();
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
