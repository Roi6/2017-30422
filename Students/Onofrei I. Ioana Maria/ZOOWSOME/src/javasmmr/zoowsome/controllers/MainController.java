package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Animal a2 = (Cockroach) speciesFactory2.getAnimal(Constants.Animals.Insects.Cockroach);
		System.out.printf("I have a new animl made by me, wohoo! But, can it fly? ->  %s \n", ((Cockroach) a2).canFly());
		
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a3 = (Penguin) speciesFactory3.getAnimal(Constants.Animals.Aquatics.Penguin);
		System.out.printf("This awesome animal who lives in %s \n", ((Penguin)a3).getWaterType() );
		
	
		
	
	}

}
