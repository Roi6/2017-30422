package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark() {
		this.setNrOfLegs(0);
		this.setName("Happy");
		this.setAvgSwimDepth(2000);
		this.setWaterType(WaterType.SALTWATER);
	}

	public Shark(int nrOfLegs, String name, int depth, WaterType type) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(type);
	}

}
