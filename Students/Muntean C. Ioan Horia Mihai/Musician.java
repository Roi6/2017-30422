
public class Musician {
	private String username;
	private Instrument instrument;
	private Band[] bands;

	public Musician(String username, Instrument instrument) {
		this.username = username;
		this.instrument = instrument;
	}

	public String getUsername() {
		return username;
	}
	
	public Instrument getInstrument() {
		return instrument;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
