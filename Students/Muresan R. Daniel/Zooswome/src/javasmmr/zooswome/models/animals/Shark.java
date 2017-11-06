package javasmmr.zooswome.models.animals;

public class Shark extends Aquatic {

	public Shark() {
		this.setNrOfLegs(0);
		this.setName("Bruce");
		this.setAvgSwimDepth(30);
		this.setWaterType(Water.Saltwater);
	}

	public Shark(int nrOfLegs, String name, int avgSwimDepth, Water waterType) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
}
