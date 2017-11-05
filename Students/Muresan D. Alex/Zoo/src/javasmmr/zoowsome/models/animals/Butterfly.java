package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public Butterfly() {
		this.setNrOfLegs(6);
		this.setCanFly(true);
		this.setName("Fluture");
	}

}
