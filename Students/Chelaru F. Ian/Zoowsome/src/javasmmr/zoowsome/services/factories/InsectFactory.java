package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import java.util.Random;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory
{

	public Animal getAnimal(String type)
	{

		Random random = new Random();
		String[] butterflyNames = { "Pan", "Barbie", "Marta", "Cornel", "Groot" };
		String[] cockroachNames = { "Skeleton", "Voldemort", "Patrocle", "Deadpool", "Vasilica" };
		String[] spiderNames = { "Vijelie", "Vali", "Hagrid", "Peter", "PatruOchi" };

		if (Constants.Animals.Insects.Butterlfy.equals(type))
		{
			int select = random.nextInt(butterflyNames.length);
			return new Butterfly(6, butterflyNames[select], true, false);
		} else if (Constants.Animals.Insects.Cockroach.equals(type))
		{
			int select = random.nextInt(cockroachNames.length);
			return new Cockroach(6, cockroachNames[select], false, false);
		} else if (Constants.Animals.Insects.Spider.equals(type))
		{
			int select = random.nextInt(spiderNames.length);
			return new Spider(8, spiderNames[select], false, true);
		} else
		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}

}
