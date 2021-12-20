package study.polymorphism;

public class Dress extends Product {
	private String name;
	private String material;
	private String size;
	private int price;
	
	
	public Dress(String name, String material, String size) {
		super();
		this.name = name;
		this.material = material;
		this.size = size;
		price = 250;
	}


	public Dress(String name, String material, String size, int price) {
		
		this.name = name;
		this.material = material;
		this.size = size;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Dress [name=" + name + ", material=" + material + ", size=" + size + ", price=" + price + "]";
	}


	@Override
	public String getDesc() {
		String str="";
		str="Dress Name : " + name + ", material : " + material + ", size : " + size + ", price : " + price + " ";
		return str;
	}


	@Override
	public int getFinalCost() {
		int finalCost=price-(price/100)*10;
		return finalCost;
	}
	
	
	

}
