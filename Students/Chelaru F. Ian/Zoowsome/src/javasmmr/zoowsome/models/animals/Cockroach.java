package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	
	public Cockroach() {
		this.setNrOfLegs(6);
		this.setName("Vasilica");
		this.setCanFly(false);
		this.setIsDangerous(false);
	}
	
	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}

}
