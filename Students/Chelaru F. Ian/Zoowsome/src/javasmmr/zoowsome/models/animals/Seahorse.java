package javasmmr.zoowsome.models.animals;

public class Seahorse extends Aquatic {

	public Seahorse() {
		this.setNrOfLegs(0);
		this.setName("Liviu");
		this.setAvgSwimDepth(32);
		this.setWaterType(WaterType.SALTWATER);
	}

	public Seahorse(int nrOfLegs, String name, int depth, WaterType type) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(type);
	}

}
