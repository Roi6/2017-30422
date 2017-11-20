
public enum Instrument {

	GUITAR("electric guitar"), DRUMS("drums2"), VOICE("voice2"), BASS("bass2");
	private String name;

	private Instrument(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

// daca scriu instrument.Guitar.getName() -- o sa-mi dea ce am intre paranteze,
// adica electric guitar
