package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Carp;
import javasmmr.zoowsome.models.animals.CatFish;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.WaterType;

public class AquaticFactory extends SpeciesFactory {
	public Animals getAnimal(String type) {
		
		String name[]=new String[5];
		name[0]="Nemo";
		name[1]="Black";
		name[2]="Mike";
		name[3]="Fisherman";
		name[4]="Bubbles";
		Random random=new Random();
		int n=random.nextInt(4);
		int Depth=random.nextInt(1000);
		if (Constants.Animals.Aquatics.Carp.equals(type)) {
			return new Carp(0,name[n],Depth,WaterType.FRESHWATER);
		} else if (Constants.Animals.Aquatics.CatFish.equals(type)) {
			return new CatFish(0,name[n],Depth,WaterType.FRESHWATER);
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(0,name[n],Depth,WaterType.SALTWATER);
		} else
			return null;
	}
}
