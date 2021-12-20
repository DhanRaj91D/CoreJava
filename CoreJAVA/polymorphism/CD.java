package study.polymorphism;

public class CD implements Sellable {

	private String name;
	private String type;
	private double cost;
	private double duration;
	private String artist;
	private double discount;

	public CD(String name, double duration, String artist) {
		super();
		this.name = name;
		type = "audio";
		cost = 50;
		this.duration = duration;
		this.artist = artist;
	}

	public CD(String name, String type, double cost, double duration, String artist) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "CD [name=" + name + ", type=" + type + ", cost=" + cost + ", duration=" + duration + ", artist="
				+ artist + "]";
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

	

}// end of CD
