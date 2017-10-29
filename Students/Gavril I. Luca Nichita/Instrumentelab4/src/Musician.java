
public class Musician {

	private Instrument instrument;
	private String username;
	private Band[] bands = new Band[10];
	private int bandsIndex = 0;
	

	public Musician(String username) {

		this.username = username;
	} 
 
	public Instrument getInstrument() {

		return this.instrument;

	}

	public void setInstrument(Instrument instrument) {

		this.instrument = instrument;
	}

	public String getUsername() {

		return this.username;
	}

	public void setUsername(String username) {

		this.username = username;
	}
	
	public void addBand (Band band) {
		bands[bandsIndex] = band;
		bandsIndex++;
	}

	public Band[] getBands() {
		
		return bands;

	}
}
