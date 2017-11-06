package musicsystem;

public class Musician {
	final int BANDS_LIMIT = 3;
	private String username;
	private Instrument musiciansInstrument;
	private Band[] musiciansBands = new Band[BANDS_LIMIT];
	private int bandsCounter;

	public Musician(String username, Instrument musiciansInstrument) {
		this.username = username;
		this.musiciansInstrument = musiciansInstrument;
		this.bandsCounter = 0;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String newUsername) {
		this.username = newUsername;
	}

	public Instrument getInstrument() {
		return this.musiciansInstrument;
	}

	public void setInstrument(Instrument newInstrument) {
		this.musiciansInstrument = newInstrument;
	}

	public void addBand(Band newBand) {
		if (this.bandsCounter < this.BANDS_LIMIT) {
			musiciansBands[bandsCounter] = newBand;
			bandsCounter++;
		}
	}

}
