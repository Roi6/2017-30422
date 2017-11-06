package javasmmr.zoowsome.models.animals;

public class KomodoDragon extends Reptile {
	public KomodoDragon(int nrOfLegs, String name, Boolean laysEggs) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setlaysEggs(laysEggs);

	}

	public KomodoDragon() {
		this.setlaysEggs(true);
		this.setNrOfLegs(4);
		this.setName("Dragon");
	}

}
