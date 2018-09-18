
public class Remote {
	private boolean bTurnedOn;
	private Battery battery1;
	private Battery battery2;
	
	public Remote(Battery battery1, Battery battery2) {
		bTurnedOn = false;
		this.battery1 = battery1;
		this.battery2 = battery2;
	}
	
	public void turnOn() {
		bTurnedOn=true;
	}	
	
	public void turnOff() {
		bTurnedOn=false;
	}
	
	public void hasPower() {
		if (battery1.getCharge() > 0 && battery2.getCharge() > 0) System.out.println("Remote has power");
		else System.out.println("Remote doesn't have power");
	}
	
	public void getState() {
		if (bTurnedOn) System.out.println("The remote is on");
		else System.out.println("The remote is off");
	}
	
	public void switchBatteries(Battery battery1, Battery battery2) {
		this.battery1 = battery1;
		this.battery2 = battery2;
	}
	
}
