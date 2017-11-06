
public class Station {
	public final int SLOTS = 5;
	public Bike[] bikes = new Bike[SLOTS];
	private int emptySlotIndex = 0;
	
	public boolean addBike(Bike bike) {
		if(emptySlotIndex > 4) return false;
		else { 
			this.bikes[emptySlotIndex]= bike;
			emptySlotIndex ++;
			return true;
		}
	}
	
	public boolean removeBike(Bike bike) {
		if(emptySlotIndex == 0) return false;
		else { 
			this.bikes[emptySlotIndex]= bike;
			emptySlotIndex --;
			return true;
		}
	}
	

}
