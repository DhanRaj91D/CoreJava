package study.practiceExample;

import java.io.Serializable;

public class Product implements Serializable {
	private String productname;
	private double cost;
	private String description;
	private String brand;
	
	public Product(String productname, double cost, String description, String brand) {
		
		this.productname = productname;
		this.cost = cost;
		this.description = description;
		this.brand = brand;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [productname=" + productname + ", cost=" + cost + ", description=" + description + ", brand="
				+ brand + "]";
	}
	
	
	
	
	

}
