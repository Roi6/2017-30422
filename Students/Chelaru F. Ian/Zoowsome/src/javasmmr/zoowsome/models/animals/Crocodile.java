package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile() {
		this.setNrOfLegs(4);
		this.setName("Frank");
		this.setLaysEggs(true);
	}

	public Crocodile(int nrOfLegs, String name, boolean laysEggs) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}

}
