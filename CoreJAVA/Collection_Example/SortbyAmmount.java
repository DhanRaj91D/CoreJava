package TestCollection;

import java.util.Comparator;

public class SortbyAmmount implements Comparator<Invoices>
{

	@Override
	public int compare(Invoices o1, Invoices o2) {
		if(o1.getAmount()>o2.getAmount()) return 1;
		if(o1.getAmount()<o2.getAmount()) return -1;
		else
		return 0;
	}

}
