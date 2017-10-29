
public class Station {

	public String name;
	public final int SLOTS = 5;
	public int emptySlotIndex; //trebuie initializat ori aici ori in constructor 
	
	Bike[] bikes = new Bike[SLOTS];
	
	public Station(String name) //constructor
	{
		this.name = name;
		this.emptySlotIndex = 0;
	}
	
	public boolean addBike(Bike bike)
	{
		if(emptySlotIndex<SLOTS) 
			{
				bikes[emptySlotIndex] = bike;
				emptySlotIndex++;
				return true;
			}
		else return false;
	}
}
