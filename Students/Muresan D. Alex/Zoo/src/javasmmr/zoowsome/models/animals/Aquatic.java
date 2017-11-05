package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animals{
	private int avgSwimDepth;
	private WaterType waterType;

	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAbgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public WaterType getWaterType() {
		return this.waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}
}
