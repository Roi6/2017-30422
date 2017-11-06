package javasmmr.zooswome.services.factories;

import javasmmr.zooswome.models.animals.Animal;
import javasmmr.zooswome.models.animals.Crocodile;
import javasmmr.zooswome.models.animals.Snake;
import javasmmr.zooswome.models.animals.Tortoise;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else if (Constants.Animals.Reptiles.Tortoise.equals(type)) {
			return new Tortoise();
		} else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
