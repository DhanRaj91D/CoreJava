package TestCollection;

import java.util.Comparator;

public class SortInvoiceGivenBy implements Comparator<Invoices>  {

	

	@Override
	public int compare(Invoices o1, Invoices o2) {
		
		return o1.getInvoiceGivenBy().compareTo(o2.getInvoiceGivenBy());
	}
	

}
