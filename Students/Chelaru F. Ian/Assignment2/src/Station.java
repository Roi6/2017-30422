
public class Station {
	public int idS; // it should be unique
	public String name;
	public final int SLOTS=5;
	public int emptySlotIndex;
	public Bike[] bikes=new Bike[SLOTS];
	
	public Station (int idS, String name)
	{
		this.idS=idS;
		this.name=name;
		this.emptySlotIndex=0;
	}
	
	public void renameStation(String name)
	{
		this.name=name;
	}
	
	public boolean fullStation() // it returns true if the station is full
	{
		if (this.emptySlotIndex>=this.SLOTS)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean emptyStation() // it returns true if the station is empty
	{
		if (this.emptySlotIndex==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean bikeInStation(Bike bike) // it returns true if the bike 'bike' is docked in the station
	{
		int i;
		for (i=0; i<this.emptySlotIndex; i++)
		{
			if (this.bikes[i].id==bike.id)
			{
				return true; //bike found in the station
			}
		}
		return false;
	}
	
	public int bikePosInStation(Bike bike) // it returns the index of the bike 'bike' in the station or -1 if the bike is not docked in this station
	{
		int i;
		for (i=0; i<this.emptySlotIndex; i++)
		{
			if (this.bikes[i].id==bike.id)
			{
				return i; //bike found in the station
			}
		}
		return -1;
	}
	
	public boolean addBike(Bike bike)
	{
		if (this.fullStation()==true || bike.isDocked()==true)
		{
			return false; //no empty slot for the bike or the bike is already docked in a station
		}
		else
		{
			bikes[this.emptySlotIndex]=bike;
			this.emptySlotIndex++;
			bike.dock();
			return true;
		}
	}
	
	public boolean removeBike(Bike bike)
	{
		if (this.bikeInStation(bike)==false)
		{
			return false; //the bike 'bike' is not docked in this station
		}
		else
		{
			int index;
			index=this.bikePosInStation(bike);
			this.emptySlotIndex--;
			this.bikes[index]=this.bikes[this.emptySlotIndex];
			this.bikes[this.emptySlotIndex]=null;
			bike.undock();
			return true;
		}
	}
	
	
}
