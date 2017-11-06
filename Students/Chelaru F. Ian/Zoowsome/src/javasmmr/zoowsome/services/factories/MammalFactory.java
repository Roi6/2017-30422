package javasmmr.zoowsome.services.factories;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory
{

	public Animal getAnimal(String type)
	{
		Random random = new Random();
		String[] cowNames = { "Poiana", "Viorica", "Ionuta", "Lexi", "Olive" };
		String[] monkeyNames = { "Chita", "Gorrila", "Coco", "Mundo", "Marcel" };
		String[] tigerNames = { "Drogon", "Jules", "Dean", "Mirel", "John" };

		int temp = random.nextInt(10) / 10;
		int hair = random.nextInt(25);

		if (Constants.Animals.Mammals.Cow.equals(type))
		{
			int select = random.nextInt(cowNames.length);
			return new Cow(4, cowNames[select], 38 + temp, 70 + hair);
		} else if (Constants.Animals.Mammals.Monkey.equals(type))
		{
			int select = random.nextInt(monkeyNames.length);
			return new Monkey(4, monkeyNames[select], 38 + temp, 70 + hair);
		} else if (Constants.Animals.Mammals.Tiger.equals(type))
		{
			int select = random.nextInt(tigerNames.length);
			return new Tiger(4, tigerNames[select], 38 + temp, 70 + hair);
		} else
		{
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}

}
