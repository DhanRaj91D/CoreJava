 package TestCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserInvoice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Invoices> invoiceList = new ArrayList<>();

		invoiceList.add(new Invoices(new MyDatecollection(19, 11, 2021), 1000, "kkkkkk", "ABCD Ltd"));
		invoiceList.add(new Invoices(new MyDatecollection(15, 11, 2021), 900, "aaaaaaa", "ffff Ltd"));
		invoiceList.add(new Invoices(new MyDatecollection(19, 9, 2021), 500, "zzzzzz", "rrrrr Ltd"));
		invoiceList.add(new Invoices(new MyDatecollection(19, 11, 2020), 700, "ddddd", "mmmmm Ltd"));
		invoiceList.add(new Invoices(new MyDatecollection(19, 11, 2022), 200, "yyyyy", "qqqq Ltd"));

		for (Invoices i : invoiceList)
			System.out.println(i);

		while (true) {

			System.out.println("");
			System.out.println(
					"** MENU **\n1)showSortDate \n2)showSortAmmount \n3)showInvoiceGivenBy \n4)showInvoiceGivenTo\n5)showInvoiceMaxAmount\n6)showInvoicelatestdate\n7)Quit");
			System.out.println("Enter your choice:");
			sc.reset();
			int key = sc.nextInt();
			if(key==7)
			{
				break;
			}
			

			switch (key) {
			case 1:
				System.out.println("***************showSortDate****************");
				showSortDate(invoiceList);

				break;
			case 2:
				System.out.println("*************showSortAmmount******************");
				showSortAmmount(invoiceList);

				break;
			case 3:
				System.out.println("**************showInvoiceGivenBy*****************");
				showInvoiceGivenBy(invoiceList);

				break;
			case 4:
				System.out.println("**************showInvoiceGivenTo*****************");
				showInvoiceGivenTo(invoiceList);

				break;

			case 5:
				System.out.println("***************showInvoiceMaxAmount****************");
				showInvoiceMaxAmount(invoiceList);
				break;

			case 6:
				System.out.println("*************showInvoicelatestdate******************");
				showInvoicelatestdate(invoiceList);
				break;
			
			default:
				System.out.println("Wrong input");
				break;
			}

		}

	}

	private static void showInvoiceMaxAmount(List<Invoices> invoiceList) {
		System.out.println(Collections.max(invoiceList, new SortbyAmmount()));

	}

	private static void showInvoicelatestdate(List<Invoices> invoiceList) {
		System.out.println(Collections.max(invoiceList));

	}

	private static void showInvoiceGivenTo(List<Invoices> invoiceList) {
		Collections.sort(invoiceList, new SortInvoiceGivenTo());
		Enumeration<Invoices> in = Collections.enumeration(invoiceList);

		while (in.hasMoreElements()) {
			System.out.println(in.nextElement());
		}

	}

	private static void showInvoiceGivenBy(List<Invoices> invoiceList) {
		Collections.sort(invoiceList, new SortInvoiceGivenBy());
		int size = invoiceList.size();

		for (Invoices v : invoiceList)
			System.out.println(v);

	}

	private static void showSortAmmount(List<Invoices> invoiceList) {
		Collections.sort(invoiceList, new SortbyAmmount());
		int size = invoiceList.size();

		for (int i = 0; i < size; i++) {
			System.out.println(invoiceList.get(i));
		}

	}

	private static void showSortDate(List<Invoices> invoiceList) {
		Collections.sort(invoiceList);
		Iterator<Invoices> it = invoiceList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
