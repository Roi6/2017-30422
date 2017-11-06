package javasmmr.zoowsome.controllers;

import java.util.Scanner;
import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController
{

	public static void main(String[] args)
	{

		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		Animal[] animals = new Animal[100];

		String[] arr = { Constants.Animals.Insects.Butterlfy, Constants.Animals.Insects.Cockroach,
				Constants.Animals.Insects.Spider, Constants.Animals.Mammals.Cow, Constants.Animals.Mammals.Monkey,
				Constants.Animals.Mammals.Tiger, Constants.Animals.Reptiles.Crocodile,
				Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Viper, Constants.Animals.Aquatics.Piranha,
				Constants.Animals.Aquatics.Seahorse, Constants.Animals.Aquatics.Shark, Constants.Animals.Birds.Eagle,
				Constants.Animals.Birds.Pinguin, Constants.Animals.Birds.Tern };

		Random random = new Random();

		Scanner in = new Scanner(System.in);
		System.out.println("Give the number of how many animals you want to create = ");
		int nrOfAnimals = in.nextInt();

		for (int i = 0; i < nrOfAnimals; i++)
		{
			int select = random.nextInt(arr.length);
			if (arr[select].equals(Constants.Animals.Mammals.Cow)
					|| arr[select].equals(Constants.Animals.Mammals.Monkey)
					|| arr[select].equals(Constants.Animals.Mammals.Tiger))
			{
				animals[i] = speciesFactory1.getAnimal(arr[select]);
			}
			if (arr[select].equals(Constants.Animals.Reptiles.Crocodile)
					|| arr[select].equals(Constants.Animals.Reptiles.Turtle)
					|| arr[select].equals(Constants.Animals.Reptiles.Viper))
			{
				animals[i] = speciesFactory2.getAnimal(arr[select]);
			}
			if (arr[select].equals(Constants.Animals.Birds.Eagle) || arr[select].equals(Constants.Animals.Birds.Pinguin)
					|| arr[select].equals(Constants.Animals.Birds.Tern))
			{
				animals[i] = speciesFactory3.getAnimal(arr[select]);
			}
			if (arr[select].equals(Constants.Animals.Aquatics.Piranha)
					|| arr[select].equals(Constants.Animals.Aquatics.Seahorse)
					|| arr[select].equals(Constants.Animals.Aquatics.Shark))
			{
				animals[i] = speciesFactory4.getAnimal(arr[select]);
			}
			if (arr[select].equals(Constants.Animals.Insects.Butterlfy)
					|| arr[select].equals(Constants.Animals.Insects.Cockroach)
					|| arr[select].equals(Constants.Animals.Insects.Spider))
			{
				animals[i] = speciesFactory5.getAnimal(arr[select]);
			}
			System.out.println(arr[select]+" "+animals[i].getName() + " has " + animals[i].getNrOfLegs() + " legs");
		}

		in.close();

	}

}
