package study.polymorphism;

public class Laptop implements Sellable{
	
	private String brand;
	private int RAM;
	private int HDD;
	private String CPU_type;
	private double cost;
	private double discount;
	
	
	public Laptop(String brand, double cost) {
		
		this.brand = brand;
		RAM = 16;
		HDD = 512;
		CPU_type = "i3 processere";
		this.cost = cost;
		
	}


	public Laptop(String brand, int rAM, int hDD, String cPU_type, double cost) {
		
		this.brand = brand;
		RAM = rAM;
		HDD = hDD;
		CPU_type = cPU_type;
		this.cost = cost;
		
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getRAM() {
		return RAM;
	}


	public void setRAM(int rAM) {
		RAM = rAM;
	}


	public int getHDD() {
		return HDD;
	}


	public void setHDD(int hDD) {
		HDD = hDD;
	}


	public String getCPU_type() {
		return CPU_type;
	}


	public void setCPU_type(String cPU_type) {
		CPU_type = cPU_type;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", RAM=" + RAM + ", HDD=" + HDD + ", CPU_type=" + CPU_type + ", Cost=" + cost
				+ ", discount=" + discount + "]";
	}


	@Override
	public void setDiscount(double discount) {
		this.discount = discount;
		
	}


	@Override
	public double getSellingPrice() {
		double sp = cost - (cost / 100) * discount;

		return sp;
	}
	
	
	
	
	
	
	
	

}
