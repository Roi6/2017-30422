package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {

	private boolean migrates;
	private int avgFlightAltitude;
	
	public boolean migrates() {
		return migrates;
	}
	
	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}
	
	public int avgFlightAltitude () {
		return avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
}
