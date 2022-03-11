package com.product.pojo;

import java.sql.Date;

public class productPoJO {
	
	private int id;
	
	private String productName;
	
	private String Description;
	
	private int price;
	
	private int unit;
	
	private Date Expire_date;

	public productPoJO() {
	
	}

	public productPoJO(int id, String productName, String description, int price, int unit, Date expire_date) {
		super();
		this.id = id;
		this.productName = productName;
		Description = description;
		this.price = price;
		this.unit = unit;
		Expire_date = expire_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public Date getExpire_date() {
		return Expire_date;
	}

	public void setExpire_date(Date expire_date) {
		Expire_date = expire_date;
	}

	@Override
	public String toString() {
		return "productPoJO [id=" + id + ", productName=" + productName + ", Description=" + Description + ", price="
				+ price + ", unit=" + unit + ", Expire_date=" + Expire_date + "]";
	}

	
	
}
