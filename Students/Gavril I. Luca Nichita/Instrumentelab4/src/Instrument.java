
public enum Instrument {

	GUITAR("Guitar"), DRUMS("Drums"), BASS("Bass"), PIANO("Piano"), VOICE("Singer");

	private String name;

	private Instrument(String name) {

		this.name = name;
	}

	private Instrument() { 
		 
	}
	public String getName() {

		return this.name;
	}

}
