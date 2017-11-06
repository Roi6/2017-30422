package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{

	private float normalBodyTemp;
	private float percBodyHair;
	
	public float normalBodyTemp () {
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(int normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float percBodyHair () {
		return percBodyHair;
	}
	
	public void setPercBodyHair(int percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	
	
	
}
