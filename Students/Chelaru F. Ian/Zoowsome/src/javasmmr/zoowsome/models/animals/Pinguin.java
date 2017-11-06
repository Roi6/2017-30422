package javasmmr.zoowsome.models.animals;

public class Pinguin extends Bird {

	public Pinguin() {
		this.setNrOfLegs(2);
		this.setName("Fishface");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
	}

	public Pinguin(int nrOfLegs, String name, boolean migrates, int altitude) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(altitude);
	}
}
