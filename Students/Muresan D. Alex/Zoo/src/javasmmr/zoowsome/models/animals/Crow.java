package javasmmr.zoowsome.models.animals;

public class Crow extends Bird {
	public Crow(int nrOfLegs, String name, Boolean migrates, int avgFlightAltitude) {
		this.setNrOfLegs(nrOfLegs);
		this.setavgFlightAltitude(avgFlightAltitude);
		this.setName(name);
		this.setMigrates(migrates);
	}

	public Crow() {
		this.setNrOfLegs(2);
		this.setMigrates(true);
		this.setName("Cioara");
	}
}
