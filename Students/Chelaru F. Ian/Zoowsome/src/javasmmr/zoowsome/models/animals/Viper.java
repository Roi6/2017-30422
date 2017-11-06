package javasmmr.zoowsome.models.animals;

public class Viper extends Reptile{
	
	public Viper() {
		this.setNrOfLegs(0);
		this.setName("Cersei");
		this.setLaysEggs(false);
	}

	public Viper(int nrOfLegs, String name, boolean laysEggs) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}

}
