package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	
	public Monkey(int nrOfLegs, String name, float bodyTemperature, float percBodyHair) {
		this.setBodyTemeprature(bodyTemperature);
		this.setpercBodyHair(percBodyHair);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Monkey() {
		this.setNrOfLegs(2);
		this.setName("Maimuta");
	}

}
