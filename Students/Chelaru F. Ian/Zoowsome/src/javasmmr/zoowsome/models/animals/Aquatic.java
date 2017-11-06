package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	
	private int avgSwimDepth;
	private WaterType waterType;
	
	public int getAvgSwimDepth()
	{
		return this.avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int depth)
	{
		this.avgSwimDepth = depth;
	}
	
	public WaterType getWaterType()
	{
		return this.waterType;
	}
	
	public void setWaterType(WaterType type)
	{
		this.waterType = type;
	}

}
