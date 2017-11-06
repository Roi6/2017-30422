package javasmmr.zooswome.models.animals;

public class Monkey extends Mammal {

	public Monkey() {
		this.setNrOfLegs(2);
		this.setName("Wukong");
		this.setNormalBodyTemp(37.3f);
		this.setPercBodyHair(90f);
	}

	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
}
