package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	//this is like a class
	public enum WaterType{
		saltWater,
		freshWater;
	}
	
	private WaterType waterType;
	private int avgSwimDept;

	public int getAvgSwimDept() {
		return avgSwimDept;
	}
	
	public void setAvgSwimDept(int avgSwimDept) {
		this.avgSwimDept = avgSwimDept;
	}
	
	public WaterType getWaterType() {
		return waterType;
	}
	
	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
	
}
