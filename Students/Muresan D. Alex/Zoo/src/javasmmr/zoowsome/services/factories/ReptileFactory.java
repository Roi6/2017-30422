package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Iguana;
import javasmmr.zoowsome.models.animals.KomodoDragon;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {
	public Animals getAnimal(String type) {
		
		String name[]=new String[5];
		name[0]="Apollo";
		name[1]="Earl";
		name[2]="Bruce";
		name[3]="Darwin";
		name[4]="Eddie";

		Random random=new Random();
		int n=random.nextInt(4);
		if (Constants.Animals.Reptiles.Iguana.equals(type)) {
			return new Iguana(4,name[n],true);
		} else if (Constants.Animals.Reptiles.KomodoDragon.equals(type)) {
			return new KomodoDragon(4,name[n],true);
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(0,name[n],false);
		} else
			return null;
	}

}
