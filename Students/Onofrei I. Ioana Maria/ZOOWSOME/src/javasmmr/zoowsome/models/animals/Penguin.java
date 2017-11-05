package javasmmr.zoowsome.models.animals;

public class Penguin extends Aquatic{

	public Penguin() {
		this.setName("Penguin");
		this.setNrOfLegs(2);
		this.setWaterType(WaterType.saltWater);
		this.setAvgSwimDept(900);
	}
	
}
