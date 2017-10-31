
public class Musician {
	private Instrument instrument = Instrument.NONE;
	private String username;
	private Band band;
	private int nrOfBands;
	
	public Musician(Instrument instrument, String username, Band band, int nrOfBands) {
		super();
		this.instrument = instrument;
		this.username = username;
		this.band = band;
		this.nrOfBands = nrOfBands;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Band getBand() {
		return band;
	}
	public void setBand(Band band) {
		this.band = band;
	}
	public int getNrOfBands() {
		return nrOfBands;
	}
	public void setNrOfBands(int nrOfBands) {
		this.nrOfBands = nrOfBands;
	}

	
}
