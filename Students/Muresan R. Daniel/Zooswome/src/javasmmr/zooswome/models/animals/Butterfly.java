package javasmmr.zooswome.models.animals;

public class Butterfly extends Insect {

	public Butterfly() {
		this.setNrOfLegs(6);
		this.setName("Tinkerbell");
		this.setCanFly(true);
		this.setIsDangerous(false);
	}

	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}

}
