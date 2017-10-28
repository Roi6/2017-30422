
public class Main {
	
	public static void main(String[] args) {
		
		Bike bike0 = new Bike(0);
		Bike bike1 = new Bike(1);
		 int n ; 
		
		Station station0 = new Station();
		for(n = 0 ;n < 7; n++) {
		
			if( station0.addBike(bike0)) {
				System.out.print("Bike ");
				System.out.print(bike0.id);
				System.out.println(" added to station0 ");
			}
			else{
				System.out.println("OMFG Stop dude!!! it's full!!");
			}
		}
	
	}

}
