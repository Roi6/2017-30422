
public enum Instrument {
	GUITAR("electric guitar"),
	DRUMS("drums"),
	VOICE("voice"),
	BASS("bass");

	private String name;
	
	private Instrument(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
