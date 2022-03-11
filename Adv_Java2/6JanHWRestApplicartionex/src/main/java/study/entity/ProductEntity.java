package study.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {
	
	@Id
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_cost")
	private int cost;
	
	@Column(name = "product_desc")
	private String description;
	
	@Column(name = "product_expiry_date")
	private Date expirydate;

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(int id, String name, int cost, String description, Date expirydate) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.expirydate = expirydate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public Date getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", cost=" + cost + ", description=" + description
				+ ", date=" + expirydate + "]";
	}
	

}
