package javasmmr.zooswome.models.animals;

public class Frog extends Aquatic {

	public Frog() {
		this.setNrOfLegs(4);
		this.setName("Crazyfrog");
		this.setAvgSwimDepth(1);
		this.setWaterType(Water.Freshwater);
	}

	public Frog(int nrOfLegs, String name, int avgSwimDepth, Water waterType) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
}
