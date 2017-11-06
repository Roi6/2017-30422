package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle(int nrOfLegs, String name, Boolean migrates, int avgFlightAltitude) {
		this.setNrOfLegs(nrOfLegs);
		this.setavgFlightAltitude(avgFlightAltitude);
		this.setName(name);
		this.setMigrates(migrates);
	}

	public Eagle() {
		this.setNrOfLegs(2);
		this.setMigrates(false);
		this.setName("Vultur");
	}

}
