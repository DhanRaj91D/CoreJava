package study.thread;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestThread2 {

	public static void main(String[] args) {
		Thread table = new Thread(new TableThread());
		table.setName("table...");
		table.start();

		Thread pattern = new Thread(new PatternThread());
		pattern.setName("pattern...");
		pattern.start();

		System.out.println("End of main ");

	}// end of main

}// end of TestThread2

class TableThread implements Runnable {

	@Override
	public void run() {

		try {
			OutputStream out = new FileOutputStream("D:\\CDAC\\IET\\Modules\\Classnotes\\Java_oop\\13\\table.txt");
			PrintWriter pwtable = new PrintWriter(out);

			for (int i = 2; i <= 50; i++) {
				pwtable.println("Table of : " + i);
				for (int j = 1; j <= 10; j++) {
					pwtable.println(i + " * " + j + " : " + i * j);
				}

				try {
					Thread.sleep(2000);

					System.out.println("thread name: " + Thread.currentThread().getName());
				} // end of inner try
				catch (InterruptedException e) {

					e.printStackTrace();
				} // end of catch
			} // end of forloop
			pwtable.flush();
			pwtable.close();
		} // end of first try

		catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}

	}

}// end of tableThread

class PatternThread implements Runnable {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		int k = 1;
		while (k <= 5) {
			System.out.println("Enter the no for pattern printing : ");
			int num = sc.nextInt();

			for (int i = 1; i <= num; i++) {

				for (int j = 1; j <= i; j++) {

					System.out.print(j);

				}
				
				System.out.println();

			}

			k++;

			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}*/
		}
		//sc.close();
	}

}// end of patternThread
