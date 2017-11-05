package javasmmr.zooswome.controllers;

import javasmmr.zooswome.services.factories.*;
import javasmmr.zooswome.models.animals.*;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		System.out.printf("The %s you created has the default name %s",Constants.Animals.Mammals.Cow,a1.getName());
	}
}
