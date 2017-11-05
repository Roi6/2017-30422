package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		
		//i can'y access methods from the Insect class :(
		//SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		//Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Insects.Cockroach);
		//System.out.printf("I have a new animl made by me, wohoo! But, can it fly? ->  %b \n",a2.canFly());
	
		
	
	}

}
