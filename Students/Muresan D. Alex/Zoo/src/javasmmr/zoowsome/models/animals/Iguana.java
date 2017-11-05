package javasmmr.zoowsome.models.animals;

public class Iguana extends Reptile {
	public Iguana(int nrOfLegs, String name, Boolean laysEggs) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setlaysEggs(laysEggs);

	}

	public Iguana() {
		this.setlaysEggs(true);
		this.setNrOfLegs(4);
		this.setName("Iguana");
	}

}
