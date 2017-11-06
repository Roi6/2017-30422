package javasmmr.zooswome.models.animals;

public class Stork extends Bird {

	public Stork() {
		this.setNrOfLegs(2);
		this.setName("Sammy");
		this.setAvgFlightAltitude(50);
		this.setMigrates(true);
	}

	public Stork(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
}
