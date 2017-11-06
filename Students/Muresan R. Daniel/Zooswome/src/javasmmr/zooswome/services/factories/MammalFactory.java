package javasmmr.zooswome.services.factories;

import javasmmr.zooswome.models.animals.Animal;
import javasmmr.zooswome.models.animals.Cow;
import javasmmr.zooswome.models.animals.Monkey;
import javasmmr.zooswome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		} else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
