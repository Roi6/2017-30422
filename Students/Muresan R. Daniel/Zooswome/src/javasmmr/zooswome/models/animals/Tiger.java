package javasmmr.zooswome.models.animals;

public class Tiger extends Mammal {

	public Tiger() {
		this.setNrOfLegs(4);
		this.setName("Shere Khan");
		this.setNormalBodyTemp(37.5f);
		this.setPercBodyHair(95f);
	}

	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
}
