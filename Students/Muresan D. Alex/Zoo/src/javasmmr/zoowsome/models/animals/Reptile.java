package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animals {
	private Boolean laysEggs;

	public Boolean getlaysEggs() {
		return this.laysEggs;

	}

	public void setlaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
