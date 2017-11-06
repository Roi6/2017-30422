
public enum Instrument {
	
	GUITAR("Air Guitar"),
	DRUMS("Air Drums"),
	VOICE("Singer"),
	BASS("Air Bass Guitar");
	
	private String name;
	
	private  Instrument (String name ) {
		this.name = name ;	
	}
	private Instrument() {
		
	}
	
	public String getInstrument() {
		return this.name;
	}

}
