package study.polymorphism;

public class Toy extends Product {
	
	private String name;
	private String catagery;
	private int cost;
	
	
	public Toy(String name, int cost) {
	
		this.name = name;
		catagery = "";
		this.cost = cost;
	}


	public Toy(String name, String catagery, int cost) {
		
		this.name = name;
		this.catagery = catagery;
		this.cost = cost;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCatagery() {
		return catagery;
	}


	public void setCatagery(String catagery) {
		this.catagery = catagery;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	@Override
	public String getDesc() {
		String str="Toy name : " + name +", Catagery : "+ catagery+", Cost : "+cost+" ";
		
		return str;
	}


	@Override
	public int getFinalCost() {
		int finalCost=cost-(cost/100)*10;
		return finalCost;
	}


	@Override
	public String toString() {
		return "toy [name=" + name + ", catagery=" + catagery + ", cost=" + cost + "]";
	}
	
	
	
	

}
