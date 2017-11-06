package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animals {
	private float normalBodyTemperature;
	private float percBodyHair;

	public void setBodyTemeprature(float normalBodyTemperature) {
		this.normalBodyTemperature = normalBodyTemperature;
	}

	public float getBodyTemperature() {
		return this.normalBodyTemperature;
	}

	public void setpercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public float getpercBodyHair() {
		return this.percBodyHair;
	}
}
