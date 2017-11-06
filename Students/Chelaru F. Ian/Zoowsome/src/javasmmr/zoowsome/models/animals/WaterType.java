package javasmmr.zoowsome.models.animals;

public enum WaterType {
	
	SALTWATER("saltwater"), FRESHWATER("freshwater");
	
	private String type;
	
	private WaterType(String type)
	{
		this.type = type;		
	}
	
	public String getType()
	{
		return this.type;
	}

}
