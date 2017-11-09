import java.util.ArrayList;
import java.util.List;

public class Musician {

	private String username;
	private Instrument instrument;
	private List<Band> bands = new ArrayList<Band>();
	private int id; // no setter/getter to be used only when comparing to musicians perhaps ?

	public Musician(String username, Instrument instr, int id) {
		this.username = username;
		this.instrument = instr;
		this.id=id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public List<Band> getBand() {
		return bands;
	}

	public void setBand(Band band) {
		bands.add(band);
	}
	
	public void removeBand(Band band) {
		bands.remove(band);
	}
}
