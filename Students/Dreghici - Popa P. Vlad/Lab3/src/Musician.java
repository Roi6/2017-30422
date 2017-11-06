
public class Musician {

	private Instrument instrument;
	private String username;
	private Band[] bands;

	public Musician(String username) {
		this.username = username;
	}

	public Instrument getInstrument() {
		return this.instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getUsername(String username) {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
