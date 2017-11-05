package javasmmr.zooswome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private Water waterType;

	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Water getWaterType() {
		return this.waterType;
	}

	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}
}
