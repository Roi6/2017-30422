
public enum Instrument {
	
	GUITAR("guitar"),
	DRUMS("drums"),
	BASS("bass"),
	PIANO("piano"),
	NONE("none"),
	VOICE("voice");
	
	private String name;
	
	private Instrument(String name) {
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}
