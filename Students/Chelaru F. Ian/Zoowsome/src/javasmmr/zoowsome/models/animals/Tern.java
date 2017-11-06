package javasmmr.zoowsome.models.animals;

public class Tern extends Bird {

	public Tern() {
		this.setNrOfLegs(2);
		this.setName("Gabe");
		this.setMigrates(true);
		this.setAvgFlightAltitude(4500);
	}

	public Tern(int nrOfLegs, String name, boolean migrates, int altitude) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(altitude);
	}

}
