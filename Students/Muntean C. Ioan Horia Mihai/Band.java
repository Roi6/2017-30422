
public class Band {
	private int noOfMembers;
	private String name;
	private Instrument[] bandInstruments;
	private Musician[] musicians = new Musician[20];

	public void setBandInstruments(Instrument[] instrument) {
		this.bandInstruments = instrument;
	}

	public void addMusician(Musician musicians) {
		this.musicians[noOfMembers] = musicians;
		noOfMembers++;
	}

	public Instrument[] getMissingInstruments() {
		int i, j, pos = 0;
		int[] frecvbi = new int[4], frecvm = new int[4], frecvdiff = new int[4];
		Instrument[] missingInstruments = new Instrument[bandInstruments.length];
		for (i = 0; i < bandInstruments.length; i++) {
			if (bandInstruments[i] == Instrument.GUITAR) {
				frecvbi[0]++;
			}
			if (bandInstruments[i] == Instrument.DRUMS) {
				frecvbi[1]++;
			}
			if (bandInstruments[i] == Instrument.VOICE) {
				frecvbi[2]++;
			}
			if (bandInstruments[i] == Instrument.BASS) {
				frecvbi[3]++;
			}
		}
		for (i = 0; i < noOfMembers; i++) {
			if (musicians[i].getInstrument() == Instrument.GUITAR) {
				frecvm[0]++;
			}
			if (musicians[i].getInstrument() == Instrument.DRUMS) {
				frecvm[1]++;
			}
			if (musicians[i].getInstrument() == Instrument.VOICE) {
				frecvm[2]++;
			}
			if (musicians[i].getInstrument() == Instrument.BASS) {
				frecvm[3]++;
			}
		}
		
		for (i=0;i<4;i++) {
			frecvdiff[i]=frecvbi[i]-frecvm[i];
			while(frecvdiff[i]>0) {
				if (i == 0) {
					missingInstruments[pos] = Instrument.GUITAR;
					pos++;
				}
				if (i == 1) {
					missingInstruments[pos] = Instrument.DRUMS;
					pos++;
				}
				if (i == 2) {
					missingInstruments[pos] = Instrument.VOICE;
					pos++;
				}
				if (i == 3) {
					missingInstruments[pos] = Instrument.BASS;	
					pos++;
				}
			frecvdiff[i]--;
			}
		}
			
		return missingInstruments;
	}
}
