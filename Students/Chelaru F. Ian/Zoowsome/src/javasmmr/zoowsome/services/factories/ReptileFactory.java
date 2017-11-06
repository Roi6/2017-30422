package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import java.util.Random;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.Viper;

public class ReptileFactory extends SpeciesFactory
{

	public Animal getAnimal(String type)
	{

		Random random = new Random();
		String[] crocodileNames = { "Frank", "Sharky", "Vladut", "Deathwing", "Mirabela" };
		String[] turtleNames = { "Joe", "Ed", "Edd", "Eddie", "Ninja" };
		String[] viperNames = { "Cersei", "Isabela", "Bellatrix", "Bianca", "Radu" };

		if (Constants.Animals.Reptiles.Crocodile.equals(type))
		{
			int select = random.nextInt(crocodileNames.length);
			return new Crocodile(4, crocodileNames[select], true);
		} else if (Constants.Animals.Reptiles.Turtle.equals(type))
		{
			int select = random.nextInt(turtleNames.length);
			return new Turtle(4, turtleNames[select], true);
		} else if (Constants.Animals.Reptiles.Viper.equals(type))
		{
			int select = random.nextInt(viperNames.length);
			return new Viper(0, viperNames[select], false);
		} else
		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}

}
