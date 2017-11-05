package javasmmr.zooswome.services.factories;

import javasmmr.zooswome.models.animals.Animal;
import javasmmr.zooswome.models.animals.Clownfish;
import javasmmr.zooswome.models.animals.Frog;
import javasmmr.zooswome.models.animals.Shark;

public class AquaticFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.Clownfish.equals(type)) {
			return new Clownfish();
		} else if (Constants.Animals.Aquatics.Frog.equals(type)) {
			return new Frog();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
