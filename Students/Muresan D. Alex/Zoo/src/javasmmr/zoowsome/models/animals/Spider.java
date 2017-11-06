package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
	}

	public Spider() {
		this.setNrOfLegs(8);
		this.setCanFly(false);
		this.setName("Paianjen");
	}

}
