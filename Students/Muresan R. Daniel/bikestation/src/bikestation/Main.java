package bikestation;


public class Main {

	public static void main(String[] args) {
		Bike bike0 = new Bike(0);
		Bike bike1 = new Bike(1);
		Bike bike2 = new Bike(2);
		Bike bike3 = new Bike(3);
		Bike bike4 = new Bike(4);
		Bike bike5 = new Bike(5);
		Station station0=new Station();
		station0.addBike(bike0);
		station0.addBike(bike1);
		station0.addBike(bike2);
		station0.addBike(bike3);
		station0.addBike(bike4);
		System.out.println(station0.getBike());
		System.out.println(station0.addBike(bike5));
		

	}
}
