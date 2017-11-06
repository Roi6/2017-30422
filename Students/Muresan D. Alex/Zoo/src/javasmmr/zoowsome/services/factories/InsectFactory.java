package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

public class InsectFactory extends SpeciesFactory {
	public Animals getAnimal(String type) {
		
		String name[]=new String[5];
		name[0]="Glider";
		name[1]="Peepers";
		name[2]="Fidget";
		name[3]="Lightbuzzer";
		name[4]="Wippiyeu";

		Random random=new Random();
		int n=random.nextInt(4);
		
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(6,name[n],true,false);
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(6,name[n],true,false);
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(8,name[n],false,true);
		} else
			return null;
	}

}
