package javasmmr.zoowsome.services.factories;

public class AnimalFactory {
	public SpeciesFactory getSpeciesfactory(String type) {
		if (Constants.Species.Mammals.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.Birds.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.Insescts.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.Reptiles.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.Aquatics.equals(type)) {
			return new AquaticFactory();
		} else
			return null;
	}
}
