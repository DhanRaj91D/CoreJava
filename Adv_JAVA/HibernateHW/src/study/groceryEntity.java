package study;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="grocery_product")
public class groceryEntity {
	
	@Id
	@Column(name="product_id")
	private int product_id;
	
	@Column(name="product_name")
	private String product_name;
	
	@Column(name="product_desc")
	private String product_desc;
	
	@Column(name="unit")
	private int unit;
	
	@Column(name="cost")
	private int cost;
	
	@Column(name="expiry_date")
	private String expiry_date;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public groceryEntity(int product_id, String product_name, String product_desc, int unit, int cost,
			String expiry_date) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_desc = product_desc;
		this.unit = unit;
		this.cost = cost;
		this.expiry_date = expiry_date;
	}

	public groceryEntity() {
		
	}

	@Override
	public String toString() {
		return "groceryEntity [product_id=" + product_id + ", product_name=" + product_name + ", product_desc="
				+ product_desc + ", unit=" + unit + ", cost=" + cost + ", expiry_date=" + expiry_date + "]";
	}
	
	
	
	
	
	
	
	

}
