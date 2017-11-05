package javasmmr.zooswome.models.animals;

public class Tortoise extends Reptile {

	public Tortoise() {
		this.setName("Crush");
		this.setNrOfLegs(4);
		this.setLayEggs(true);
	}

	public Tortoise(int nrOfLegs, String name, boolean layEggs) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLayEggs(layEggs);
	}
}
