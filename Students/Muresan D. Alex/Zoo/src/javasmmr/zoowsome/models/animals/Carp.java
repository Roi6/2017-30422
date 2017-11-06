package javasmmr.zoowsome.models.animals;

public class Carp extends Aquatic {
	public Carp(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setWaterType(waterType);
		this.setAbgSwimDepth(avgSwimDepth);
	}

	public Carp() {
		this.setWaterType(WaterType.FRESHWATER);
		this.setNrOfLegs(0);
		this.setName("Crap");
	}
}
