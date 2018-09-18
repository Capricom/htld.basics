package at.biya.carsample;

public class Manufacturer {
	private String name;
	private String country;
	private double discount;
	
	public Manufacturer(String name, String country, double savings) {
		super();
		this.name = name;
		this.country = country;
		this.discount = savings;
	}
	
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public double getDiscount() {
		return discount;
	}
}
