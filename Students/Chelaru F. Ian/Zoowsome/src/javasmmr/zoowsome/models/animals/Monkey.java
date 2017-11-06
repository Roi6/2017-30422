package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

	public Monkey() {
		this.setNrOfLegs(4);
		this.setName("Marcel");
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(91.5f);
	}

	public Monkey(int nrOfLegs, String name, float temp, float perc) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(temp);
		this.setPercBodyHair(perc);
	}

}
