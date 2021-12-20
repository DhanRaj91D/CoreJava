package study.hasarelation;

public class Product {
	private String productName;
	private String discription;
	private int cost;
	private MyDate dateOfExpiry;
	
	

	public Product() {
		
		productName = "";
		discription = "";
		cost = 0;
		dateOfExpiry = new MyDate();
	}

	public Product(String productName, String discription, int cost, MyDate dateOfExpiry) {

		this.productName = productName;
		this.discription = discription;
		this.cost = cost;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public MyDate getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(MyDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public String toString() {
		String str = "";
		str += "Product [productName=" + productName + ", discription=" + discription + ", cost=" + cost
				+ ", dateOfExpiry=" + dateOfExpiry + "]";
		return str;
	}

}
