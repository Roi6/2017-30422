package javasmmr.zoowsome.models.animals;

public class Colibri extends Bird {
	public Colibri(int nrOfLegs, String name, Boolean migrates, int avgFlightAltitude) {
		this.setNrOfLegs(nrOfLegs);
		this.setavgFlightAltitude(avgFlightAltitude);
		this.setName(name);
		this.setMigrates(migrates);
	}

	public Colibri() {
		this.setNrOfLegs(2);
		this.setMigrates(true);
		this.setName("Colibri");
	}
}
