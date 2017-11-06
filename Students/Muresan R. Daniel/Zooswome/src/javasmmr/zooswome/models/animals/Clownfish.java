package javasmmr.zooswome.models.animals;

public class Clownfish extends Aquatic {

	public Clownfish() {
		this.setNrOfLegs(0);
		this.setName("Nemo");
		this.setAvgSwimDepth(10);
		this.setWaterType(Water.Saltwater);
	}

	public Clownfish(int nrOfLegs, String name, int avgSwimDepth, Water waterType) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
}
