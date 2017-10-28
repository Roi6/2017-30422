public class Musician {
	
	private String username;
	private Instrument instrument ;
	private Band[] bands = new Band[5];
	private int bandIndex = 0;
	
	//UserName related methods
	public Musician(String username) {	
		this.username = username;	
	}
	public String getUserName() {
		return this.username;
	}
	
	//Instrument related methods
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public Instrument getInstrument() {
		return  instrument;
	}
	
	//Band related methods
	public void addBand(Band band) {
		bands[bandIndex] = band;
		bandIndex ++ ;
	}
	public Band[] getBands() {
		return bands;
	}
	

}
