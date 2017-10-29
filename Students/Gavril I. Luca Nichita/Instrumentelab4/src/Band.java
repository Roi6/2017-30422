
public class Band {

	private int noOfMembers;
	public Instrument[] neededInstruments = new Instrument[10];
	private Musician[] musicians = new Musician[10];
	private int indexOfMember;
	private String name;
	private int indexOfInstrument;
	private int noOfMembersaux;

	public Band(int nrOfMembers) {
		this.noOfMembers = nrOfMembers;
		this.indexOfMember = 0;
		this.indexOfInstrument = 0;
		this.noOfMembersaux = nrOfMembers;
		
	}

	public void addNeededInstrument(Instrument instrument) {

		neededInstruments[indexOfInstrument] = instrument;
		indexOfInstrument++;
	}

	public int getIndexOfMember() {
		return this.indexOfMember;
	}

	public void setBandName(String name) {
		this.name = name;
	}

	public String getBandName() {
		return this.name;
	}

	public void addMusician(Musician musician) {

		int instrumentNeeded = 0;
		int indexInstruments = 0;
		for (int i = 0; i < noOfMembersaux; i++) {
			if (neededInstruments[i] == musician.getInstrument()) {
				instrumentNeeded = 1;
				indexInstruments = i;
			}
		}
		if (instrumentNeeded == 1) {
			this.musicians[indexOfMember] = musician;
			indexOfMember++;
			musician.addBand(this);
			neededInstruments[indexInstruments] = null;
			noOfMembers--;
		} else {
			System.out.println("This instrument is not needed");
			
		}

	}

	public Instrument[] getNeededInstruments() {

		return this.neededInstruments;
	}

}
