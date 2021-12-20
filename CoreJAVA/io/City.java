package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class City {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			OutputStream out=new FileOutputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\13\\citys.txt");
			PrintWriter pw=new PrintWriter(out);
			String str="";
			while (!str.equalsIgnoreCase("quit")) {
				System.out.println("(if want to exit enter quit ) \nEnter the city name:");
				str=sc.next();
				if(!str.equalsIgnoreCase("quit")) {
					pw.append(str);
					pw.println();
				}
				
			}
			
		pw.flush();
		pw.close();
		sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
