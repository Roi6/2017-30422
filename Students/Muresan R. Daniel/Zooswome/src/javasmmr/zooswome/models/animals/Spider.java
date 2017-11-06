package javasmmr.zooswome.models.animals;

public class Spider extends Insect {

	public Spider() {
		this.setNrOfLegs(8);
		this.setName("Willy");
		this.setCanFly(false);
		this.setIsDangerous(true);
	}

	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}

}
