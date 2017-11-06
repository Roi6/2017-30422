
public enum Instrument {
	GUITAR("Guitar"), DRUMS("Drums"), BASS("Bass"), PIANO("Piano"), VOICE("Voice");

	private String name;

	private Instrument(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
