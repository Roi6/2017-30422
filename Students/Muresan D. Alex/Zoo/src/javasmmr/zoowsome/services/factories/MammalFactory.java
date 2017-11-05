package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;

import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;
import java.util.Random;

public class MammalFactory extends SpeciesFactory {
	public Animals getAnimal(String type) {
		String name[]=new String[5];
		name[0]="Kornel";
		name[1]="Milka";
		name[2]="John";
		name[3]="Sherkan";
		name[4]="Cita";
		Random random=new Random();
		int n=random.nextInt(4);
		float Temperature=random.nextFloat();
		float Hair=random.nextFloat();
		
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(4,name[n],Temperature,Hair);
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(4,name[n],Temperature,Hair);
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(4,name[n],Temperature,Hair);
		} else
			return null;
	}

}
