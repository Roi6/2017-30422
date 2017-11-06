package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(int nrOfLegs, String name, float bodyTemperature, float percBodyHair) {
		this.setBodyTemeprature(bodyTemperature);
		this.setpercBodyHair(percBodyHair);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Cow() {
		this.setNrOfLegs(4);
		this.setName("Vaca");
	}
}
