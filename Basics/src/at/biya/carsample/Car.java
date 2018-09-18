package at.biya.carsample;

public class Car {
	private String color;
	private double maxSpeed;
	private double basePrice;
	private double baseFuelUse;
	private double distanceTraveled;
	
	private Engine engine;
	private Manufacturer manufacturer;
	
	public Car(String color, double maxSpeed, double basePrice, double baseFuelUse, Engine engine, Manufacturer manufacturer, double distanceTraveled) {
		super();
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.basePrice = basePrice;
		this.baseFuelUse = baseFuelUse;
		this.engine = engine;
		this.manufacturer = manufacturer;
		this.distanceTraveled = distanceTraveled;
	}
	
	public String getColor() {
		return color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public double getBaseFuelUse() {
		return baseFuelUse;
	}
	public Engine getEngine() {
		return engine;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	public double getPrice() {
		return this.basePrice * (100 - manufacturer.getDiscount()) / 100;
	}
	
	public String getType() {
		return engine.getFuelType();
	}
	
	public double getUsage() {
		if (this.distanceTraveled < 50000) return this.distanceTraveled * this.baseFuelUse; 
		else {
			return (this.baseFuelUse * 50000) + (this.distanceTraveled - 50000) * (this.baseFuelUse * 1.098) ; 
		}
	}
	
	
	
}
