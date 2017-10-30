
public class Band {
	int nrOfMembers = 0;
	String name;
	Instrument[] bandInstruments;
	Musician[] musicians;

	public void addMusician(Musician musician) {
		nrOfMembers++;
		this.bandInstruments[nrOfMembers] = musician.getInstrument();
		this.musicians[nrOfMembers] = musician;
		//return musician;
	}

	public Instrument[] getMissingIntruments() {
		return this.bandInstruments;
	}

}
