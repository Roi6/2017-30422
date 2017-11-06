
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Station station0=new Station(200,"CFR");
		Station station1=new Station(201,"Mihai Viteazu");
		Bike bike0=new Bike(100,"blue");
		Bike bike1=new Bike(101,"blue");
		Bike bike2=new Bike(102,"red");
		Bike bike3=new Bike(103,"black");
		Bike bike4=new Bike(104,"blue");
		Bike bike5=new Bike(105,"black");
		Bike bike6=new Bike(106,"green");
		
		station0.addBike(bike1);
		station0.addBike(bike2);
		station0.addBike(bike3);
		station0.addBike(bike6);
		station1.addBike(bike4);
				
		
		boolean ok=station0.addBike(bike0);
		if (ok==true)
		{
			System.out.print("Bike ");
			System.out.print(bike0.id);
			System.out.print(" has been added to the station ");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			System.out.print("Station ");
			System.out.print(station0.name);
			System.out.print("is full");
			System.out.print("\n\n");
		}
		
		
		
		
		
		
		if (station0.emptyStation()==true) // show the bikes which are docked in station0
		{
			System.out.print("No bike in the station");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			int i;
			System.out.print("Bikes in the station ");
			System.out.print(station0.name);
			System.out.print(":\n");
			for (i=0; i<station0.emptySlotIndex; i++)
			{
				System.out.print(station0.bikes[i].id);
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		if (station1.emptyStation()==true) //  show the bikes which are docked in station1
		{
			System.out.print("No bike in the station");
			System.out.print(station1.name);
			System.out.print("\n\n");
		}
		else
		{
			int i;
			System.out.print("Bikes in the station ");
			System.out.print(station1.name);
			System.out.print(":\n");
			for (i=0; i<station1.emptySlotIndex; i++)
			{
				System.out.print(station1.bikes[i].id);
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		ok=station0.addBike(bike5); // we try to add a bike in station 'CFR' which is full
		if (ok==true)
		{
			System.out.print("Bike ");
			System.out.print(bike0.id);
			System.out.print(" has been added to the station ");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			System.out.print("Station ");
			System.out.print(station0.name);
			System.out.print(" is full or the bike ");
			System.out.print(bike5.id);
			System.out.print(" is already docked in a station");
			System.out.print("\n\n");
		}
		
		
		
		
		
		System.out.print(bike5.color); // we verify if the method changeColor works properly
		System.out.print("\n");
		bike5.changeColor("red");
		System.out.print(bike5.color);
		System.out.print("\n\n");
		
		
		
		
		
		ok=station0.removeBike(bike2); // we remove the bike 'bike0' from the station 'CFR'
		if (ok==true)
		{
			System.out.print("Bike ");
			System.out.print(bike2.id);
			System.out.print(" has been removed from the station ");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			System.out.print("Bike ");
			System.out.print(bike2.id);
			System.out.print(" is not docked in this station");
			System.out.print("\n\n");
		}
		
		
		
		
		
		if (station0.emptyStation()==true) // show the bikes which are docked in station0
		{
			System.out.print("No bike in the station");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			int i;
			System.out.print("Bikes in the station ");
			System.out.print(station0.name);
			System.out.print(":\n");
			for (i=0; i<station0.emptySlotIndex; i++)
			{
				System.out.print(station0.bikes[i].id);
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		ok=station0.removeBike(bike4); // we try to remove the bike 'bike4', which is docked in the station 'Mihai Viteazu', from the station 'CFR'
		if (ok==true)
		{
			System.out.print("Bike ");
			System.out.print(bike4.id);
			System.out.print(" has been removed from the station ");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			System.out.print("Bike ");
			System.out.print(bike4.id);
			System.out.print(" is not docked in this station");
			System.out.print("\n\n");
		}
		
		
		
		
		
		ok=station0.addBike(bike4); // we try to add the bike 'bike4', which is docked in the station 'Mihai Viteazu', to the station 'CFR'
		if (ok==true)
		{
			System.out.print("Bike ");
			System.out.print(bike4.id);
			System.out.print(" has been added to the station ");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			System.out.print("Station ");
			System.out.print(station0.name);
			System.out.print(" is full or the bike ");
			System.out.print(bike4.id);
			System.out.print(" is already docked in a station");
			System.out.print("\n\n");
		}
		
		
		
		
		
		if (station0.emptyStation()==true) // show the bikes which are docked in station0 to verify that nothing changed
		{
			System.out.print("No bike in the station");
			System.out.print(station0.name);
			System.out.print("\n\n");
		}
		else
		{
			int i;
			System.out.print("Bikes in the station ");
			System.out.print(station0.name);
			System.out.print(":\n");
			for (i=0; i<station0.emptySlotIndex; i++)
			{
				System.out.print(station0.bikes[i].id);
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		System.out.print(station0.bikePosInStation(bike3)); // we verify if the method bikePosInStation works properly
		System.out.print("\n");
		System.out.print(station1.bikePosInStation(bike3));
		System.out.print("\n\n");
		
	}

}
