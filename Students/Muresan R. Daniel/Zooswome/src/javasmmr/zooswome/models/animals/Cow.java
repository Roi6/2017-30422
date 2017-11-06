package javasmmr.zooswome.models.animals;

public class Cow extends Mammal{
	
	public Cow() {
		this.setNrOfLegs(4);
		this.setName("Milka");
		this.setNormalBodyTemp(38.6f);
		this.setPercBodyHair(87f);
	}
	
	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}

}
