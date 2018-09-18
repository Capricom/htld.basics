package at.biya.carsample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine e1 = new Engine("Diesel", 200);
		Manufacturer m1 = new Manufacturer("VW","Deutschland", 10);
		Car c1 = new Car("White", 150, 10000, 0.08, e1, m1, 100000);
		
		System.out.println(c1.getUsage());
		System.out.println(c1.getType());
		System.out.println(c1.getPrice());
		
	}

}
