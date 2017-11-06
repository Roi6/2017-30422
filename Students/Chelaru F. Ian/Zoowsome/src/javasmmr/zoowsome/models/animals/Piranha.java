package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic{
	
	public Piranha() {
		this.setNrOfLegs(0);
		this.setName("Craig");
		this.setAvgSwimDepth(50);
		this.setWaterType(WaterType.FRESHWATER);
	}

	public Piranha(int nrOfLegs, String name, int depth, WaterType type) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(type);
	}

}
