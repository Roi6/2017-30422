package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow() {
		this.setNrOfLegs(4);
		this.setName("Olive");
		this.setNormalBodyTemp(38.5f);
		this.setPercBodyHair(20.3f);
	}

	public Cow(int nrOfLegs, String name, float temp, float perc) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(temp);
		this.setPercBodyHair(perc);
	}

}
