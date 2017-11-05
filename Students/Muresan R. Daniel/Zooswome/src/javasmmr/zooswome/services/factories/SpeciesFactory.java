package javasmmr.zooswome.services.factories;

import javasmmr.zooswome.models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;
}
