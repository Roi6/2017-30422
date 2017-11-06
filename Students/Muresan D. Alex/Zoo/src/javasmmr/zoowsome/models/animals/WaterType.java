package javasmmr.zoowsome.models.animals;

public enum WaterType {
	SALTWATER("SaltWater"), FRESHWATER("FreshWater");
	private String name;

	private WaterType(String name) {
		this.name = name;
	}

	public String getWaterType() {
		return this.name;
	}
}
