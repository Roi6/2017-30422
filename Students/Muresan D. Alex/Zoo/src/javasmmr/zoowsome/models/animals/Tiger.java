package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger(int nrOfLegs, String name, float bodyTemperature, float percBodyHair) {
		this.setBodyTemeprature(bodyTemperature);
		this.setpercBodyHair(percBodyHair);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Tiger() {
		this.setNrOfLegs(4);
		this.setName("Tigru");
	}

}
