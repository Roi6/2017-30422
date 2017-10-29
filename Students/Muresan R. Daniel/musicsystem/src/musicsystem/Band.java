package musicsystem;

public class Band {
	final int MEMBERS_LIMIT = 10;
	private int nrOfMembers;
	private int membersCounter;
	private Musician[] bandMembers = new Musician[MEMBERS_LIMIT];
	private Instrument[] bandInstruments = new Instrument[MEMBERS_LIMIT];

	public Band(int nrOfMembers, Instrument[] bandInstruments) {
		this.nrOfMembers = nrOfMembers;
		this.membersCounter = 0;
		this.bandInstruments = bandInstruments;

	}

	public void addMember(Musician newMember) {
		if (this.membersCounter > this.nrOfMembers) {
			System.out.println("Band is full");
		} else {
			boolean musicianIsNeeded = false;
			int indexInInstrumentsArray = 0;
			for (int i = 0; i < this.nrOfMembers; i++) {
				if (this.bandInstruments[i] == newMember.getInstrument()) {
					musicianIsNeeded = true;
					indexInInstrumentsArray = i;
				}

			}
			if (musicianIsNeeded == true) {
				this.bandMembers[membersCounter] = newMember;
				membersCounter++;
				newMember.addBand(this);
				for (int j = indexInInstrumentsArray; j < nrOfMembers - 1; j++) {
					this.bandInstruments[j] = this.bandInstruments[j + 1];
					this.nrOfMembers--;
				}
			} else {
				System.out.println("Musician is not needed");
			}

		}

	}

	public Instrument[] getMissingInstruments() {
		return this.bandInstruments;
	}

}
