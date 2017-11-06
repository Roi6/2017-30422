package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(int nrOfLegs, String name, Boolean laysEggs) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setlaysEggs(laysEggs);

	}

	public Snake() {
		this.setlaysEggs(false);
		this.setNrOfLegs(0);
		this.setName("Sarpe");
	}
}
