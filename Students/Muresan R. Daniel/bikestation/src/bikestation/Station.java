package bikestation;

public class Station {
	public final int SLOTS = 5;
	public Bike[] bikes = new Bike[SLOTS];
	private int emptySlotIndex;
	private boolean isEmpty;
	private boolean isFull;
	
	
	public Station() {
		this.isEmpty= true;
		this.emptySlotIndex=0;
		this.isFull= false;
	}
	
	public boolean 	addBike(Bike bike) {
		if(this.isFull == true) {
			return false;
		}
		else {
			this.bikes[this.emptySlotIndex] = bike;
			this.emptySlotIndex++;
			this.isEmpty = false;
			return true;
			
		}
		
	}
	
	public boolean 	getBike() {
		if(this.isEmpty == true) {
			return false;
		}
		else {
			this.emptySlotIndex--;
			return true;
		}

		
	}
	
	
	
	

}
