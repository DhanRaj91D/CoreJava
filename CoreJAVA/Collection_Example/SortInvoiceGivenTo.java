package TestCollection;

import java.util.Comparator;

public class SortInvoiceGivenTo implements Comparator<Invoices>{

	@Override
	public int compare(Invoices o1, Invoices o2) {
	
		return o1.getInvoiceGivenTo().compareTo(o2.getInvoiceGivenTo());
	}

}
