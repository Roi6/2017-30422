package javasmmr.zooswome.models.animals;

public class Pigeon extends Bird {

	public Pigeon() {
		this.setNrOfLegs(2);
		this.setName("Sully");
		this.setAvgFlightAltitude(10);
		this.setMigrates(true);
	}

	public Pigeon(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
}
