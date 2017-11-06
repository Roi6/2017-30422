package javasmmr.zoowsome.models.animals;

public abstract class Animals {
	private int nrOfLegs;
	private String name;

	public int getNrOfLegs() {
		return this.nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs=nrOfLegs;
	}
    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name=name;
    }
}
