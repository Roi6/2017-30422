package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	private boolean canFly;
	private boolean isDangerous;
	
	public boolean canFly () {
		return canFly;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public boolean isDangerous () {
		return isDangerous;
	}
	
	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	
	
}
