package TestCollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Invoices implements Comparable<Invoices> {
	private MyDatecollection dateOfInvoice;
	private double amount;
	private String invoiceGivenBy;
	private String invoiceGivenTo;
	public Invoices(double amount, String invoiceGivenBy, String invoiceGivenTo) {
		
		dateOfInvoice = new MyDatecollection(0, 0, 0);
		amount = 0;
		invoiceGivenBy = "";
		invoiceGivenTo = "";
	}
	public Invoices(MyDatecollection dateOfInvoice, double amount, String invoiceGivenBy, String invoiceGivenTo) {
		
		this.dateOfInvoice = dateOfInvoice;
		this.amount = amount;
		this.invoiceGivenBy = invoiceGivenBy;
		this.invoiceGivenTo = invoiceGivenTo;
	}
	public MyDatecollection getDateOfInvoice() {
		return dateOfInvoice;
	}
	public void setDateOfInvoice(MyDatecollection dateOfInvoice) {
		this.dateOfInvoice = dateOfInvoice;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getInvoiceGivenBy() {
		return invoiceGivenBy;
	}
	public void setInvoiceGivenBy(String invoiceGivenBy) {
		this.invoiceGivenBy = invoiceGivenBy;
	}
	public String getInvoiceGivenTo() {
		return invoiceGivenTo;
	}
	public void setInvoiceGivenTo(String invoiceGivenTo) {
		this.invoiceGivenTo = invoiceGivenTo;
	}
	@Override
	public String toString() {
		return "Invoices [dateOfInvoice=" + dateOfInvoice + ", amount=" + amount + ", invoiceGivenBy=" + invoiceGivenBy
				+ ", invoiceGivenTo=" + invoiceGivenTo + "]";
	}
	@Override
	public int compareTo(Invoices o) {
		
		return this.dateOfInvoice.compareTo(o.dateOfInvoice);
	}
	
	
	
	
	

}
