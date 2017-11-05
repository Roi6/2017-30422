package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setWaterType(waterType);
		this.setAbgSwimDepth(avgSwimDepth);
	}

	public Shark() {
		this.setWaterType(WaterType.SALTWATER);
		this.setNrOfLegs(0);
		this.setName("Rechin");
	}

}
