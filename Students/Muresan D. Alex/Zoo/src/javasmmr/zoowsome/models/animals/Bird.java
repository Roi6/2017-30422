package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animals{
	private Boolean migrates;
	private int avgFlightAltitude;

	public Boolean getMigrates() {
		return this.migrates;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public int getavgFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void setavgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
