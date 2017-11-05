package javasmmr.zooswome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile() {
		this.setName("Croco");
		this.setNrOfLegs(4);
		this.setLayEggs(true);
	}

	public Crocodile(int nrOfLegs, String name, boolean layEggs) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLayEggs(layEggs);
	}
}
