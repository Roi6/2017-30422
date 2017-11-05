package javasmmr.zoowsome.models.animals;

public class CatFish extends Aquatic {
	public CatFish(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setWaterType(waterType);
		this.setAbgSwimDepth(avgSwimDepth);
	}

	public CatFish() {
		this.setWaterType(WaterType.FRESHWATER);
		this.setNrOfLegs(0);
		this.setName("Somn");	}
}
