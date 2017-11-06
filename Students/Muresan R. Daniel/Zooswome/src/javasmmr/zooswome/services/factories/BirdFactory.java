package javasmmr.zooswome.services.factories;

import javasmmr.zooswome.models.animals.Animal;
import javasmmr.zooswome.models.animals.Parrot;
import javasmmr.zooswome.models.animals.Pigeon;
import javasmmr.zooswome.models.animals.Stork;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		} else if (Constants.Animals.Birds.Stork.equals(type)) {
			return new Stork();
		} else if (Constants.Animals.Birds.Pigeon.equals(type)) {
			return new Pigeon();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
