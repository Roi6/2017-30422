package javasmmr.zooswome.models.animals;

public class Snake extends Reptile {

	public Snake() {
		this.setName("Kaa");
		this.setNrOfLegs(0);
		this.setLayEggs(true);
	}

	public Snake(int nrOfLegs, String name, boolean layEggs) {
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLayEggs(layEggs);
	}

}
