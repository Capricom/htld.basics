package at.biya.carsample;

public class Engine {
	private String fuelType;
	private double Power;
	
	public Engine(String fuelType, double power) {
		super();
		this.fuelType = fuelType;
		Power = power;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	public double getPower() {
		return Power;
	}
	
}
