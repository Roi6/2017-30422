package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Colibri;
import javasmmr.zoowsome.models.animals.Crow;
import javasmmr.zoowsome.models.animals.Eagle;


public class BirdFactory extends SpeciesFactory {
	public Animals getAnimal(String type) {
		
		String name[]=new String[5];
		name[0]="Charlie";
		name[1]="Skittles";
		name[2]="Coco";
		name[3]="Max";
		name[4]="Sunny";

		Random random=new Random();
		int n=random.nextInt(4);
		int Altitude=random.nextInt(2000);
		if (Constants.Animals.Birds.Colibri.equals(type)) {
			return new Colibri(2,name[n],true,Altitude);
		} else if (Constants.Animals.Birds.Crow.equals(type)) {
			return new Crow(2,name[n],true,Altitude);
		} else if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle(2,name[n],false,Altitude);
		} else
			return null;
	}
}
