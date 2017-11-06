package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger() {
		this.setNrOfLegs(4);
		this.setName("John");
		this.setNormalBodyTemp(37.5f);
		this.setPercBodyHair(90);
	}

	public Tiger(int nrOfLegs, String name, float temp, float perc) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(temp);
		this.setPercBodyHair(perc);
	}

}
