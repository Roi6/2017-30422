package javasmmr.zooswome.models.animals;

public class Parrot extends Bird {

	public Parrot() {
		this.setNrOfLegs(2);
		this.setName("Iago");
		this.setAvgFlightAltitude(5);
		this.setMigrates(false);
	}

	public Parrot(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
}
