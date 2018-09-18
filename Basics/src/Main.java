
public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 3);
		Rectangle r2 = new Rectangle(7, 2);
		Rectangle r3 = r2;

		r1.SayHello();
		r2.SayHello();
		r3.SayHello();
		
		/////////////////////////////////////////
		System.out.println();
		
		Battery b1 = new Battery(100);
		Battery b2 = new Battery(0);
		Remote rm1 = new Remote(b1,b2);
		
		rm1.getState();
		rm1.turnOn();
		rm1.getState();
		rm1.hasPower();
	}

}
