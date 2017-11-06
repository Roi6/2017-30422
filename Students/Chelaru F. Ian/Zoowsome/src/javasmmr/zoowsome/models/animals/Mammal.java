package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal 
{
	
	private float normalBodyTemp;
	private float percBodyHair;
	
	public float getNormalBodyTemp()
	{
		return this.normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float temp)
	{
		this.normalBodyTemp = temp;
	}
	
	public float getPercBodyHair()
	{
		return this.percBodyHair;
	}
	
	public void setPercBodyHair(float percentage)
	{
		this.percBodyHair = percentage;
	}

}
