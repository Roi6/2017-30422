package javasmmr.zooswome.models.animals;

public abstract class Reptile extends Animal {
	private boolean layEggs;

	public boolean getLayEggs() {
		return this.layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
}
