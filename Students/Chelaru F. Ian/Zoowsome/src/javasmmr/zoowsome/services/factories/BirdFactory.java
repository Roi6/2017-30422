package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import java.util.Random;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Pinguin;
import javasmmr.zoowsome.models.animals.Tern;

public class BirdFactory extends SpeciesFactory
{

	public Animal getAnimal(String type)
	{

		Random random = new Random();
		String[] eagleNames = { "Vultur", "Crivat", "Vestejila", "Mark", "Marcessa" };
		String[] pinguinNames = { "Ostapenko", "Paula", "Fishface", "Diego", "Leon" };
		String[] ternNames = { "Gabe", "Vanilia", "Violeta", "Matteo", "Simon" };
		int alt = random.nextInt(1000);

		if (Constants.Animals.Birds.Eagle.equals(type))
		{
			int select = random.nextInt(eagleNames.length);
			return new Eagle(2, eagleNames[select], false, 11000 + alt);
		} else if (Constants.Animals.Birds.Pinguin.equals(type))
		{
			int select = random.nextInt(pinguinNames.length);
			return new Pinguin(2, pinguinNames[select], false, 0);
		} else if (Constants.Animals.Birds.Tern.equals(type))
		{
			int select = random.nextInt(ternNames.length);
			return new Tern(2, ternNames[select], true, 4000 + alt);
		} else
		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}

}
