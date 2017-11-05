package javasmmr.zooswome.services.factories;

import javasmmr.zooswome.models.animals.Animal;
import javasmmr.zooswome.models.animals.Butterfly;
import javasmmr.zooswome.models.animals.Cockroach;
import javasmmr.zooswome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
