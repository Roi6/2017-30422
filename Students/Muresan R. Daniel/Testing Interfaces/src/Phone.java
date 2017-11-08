
public class Phone implements Upgradable {
	private float displaySize;
	private int ramCapacity;
	private int cameraResolution;

	public Phone(float displaySize, int ramCapacity, int cameraResolution) {
		this.displaySize = displaySize;
		this.ramCapacity = ramCapacity;
		this.cameraResolution = cameraResolution;
	}

	public void upgrade() {
		this.cameraResolution += 5;
		this.displaySize += 1.2f;
		this.ramCapacity += 2;
	}

	public float getDisplaySize() {
		return this.displaySize;
	}

	public int getRamCapacity() {
		return this.ramCapacity;
	}

	public int getCameraResolution() {
		return this.cameraResolution;
	}

	public void setDisplaySize(float displaySize) {
		this.displaySize = displaySize;
	}

	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}

	public void setCameraResolution(int cameraResolution) {
		this.cameraResolution = cameraResolution;
	}
}
