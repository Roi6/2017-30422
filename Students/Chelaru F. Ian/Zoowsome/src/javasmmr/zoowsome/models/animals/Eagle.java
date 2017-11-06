package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle() {
		this.setNrOfLegs(2);
		this.setName("Vultur");
		this.setMigrates(false);
		this.setAvgFlightAltitude(11300);
	}

	public Eagle(int nrOfLegs, String name, boolean migrates, int altitude) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(altitude);
	}

}
