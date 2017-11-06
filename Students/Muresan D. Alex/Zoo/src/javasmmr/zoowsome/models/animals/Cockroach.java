package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public Cockroach() {
		this.setNrOfLegs(6);
		this.setCanFly(true);
		this.setName("Gandac");
	}
}
