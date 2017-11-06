package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle() {
		this.setNrOfLegs(4);
		this.setName("Joe");
		this.setLaysEggs(true);
	}

	public Turtle(int nrOfLegs, String name, boolean laysEggs) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}

}
