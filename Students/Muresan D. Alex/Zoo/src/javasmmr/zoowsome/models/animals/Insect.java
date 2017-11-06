package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animals {
	private Boolean canFly;
	private Boolean isDangerous;

	public Boolean getCanFly() {
		return this.canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

	public Boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
