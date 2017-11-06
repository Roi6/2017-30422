package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import java.util.Random;
import javasmmr.zoowsome.models.animals.Piranha;
import javasmmr.zoowsome.models.animals.Seahorse;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.WaterType;

public class AquaticFactory extends SpeciesFactory
{

	public Animal getAnimal(String type)
	{

		Random random = new Random();
		String[] piranhaNames = { "Craig", "Sandu", "Vicentiu", "Samuela", "Gonzalez" };
		String[] seahorseNames = { "Liviu", "Sam", "Ronaldo", "Rafa", "Philadephia" };
		String[] sharkNames = { "Happy", "Stefan", "Falci", "Felipe", "Florica" };

		int depth = random.nextInt(25);

		if (Constants.Animals.Aquatics.Piranha.equals(type))
		{
			int select = random.nextInt(piranhaNames.length);
			return new Piranha(0, piranhaNames[select], 20 + depth, WaterType.FRESHWATER);
		} else if (Constants.Animals.Aquatics.Seahorse.equals(type))
		{
			int select = random.nextInt(seahorseNames.length);
			return new Seahorse(0, seahorseNames[select], 40 + depth, WaterType.SALTWATER);
		} else if (Constants.Animals.Aquatics.Shark.equals(type))
		{
			int select = random.nextInt(sharkNames.length);
			return new Shark(0, sharkNames[select], 2000, WaterType.SALTWATER);
		} else
		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}

}
