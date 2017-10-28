
public class Band {

	private int noOfMembers;
	private String name;
	private Instrument[] bandInstruments = new Instrument[10];
	private Musician[] musicians = new Musician[10];
	private Instrument[] neededInstruments = new Instrument[10];
	private boolean needed;

	public boolean addMusician(Musician musician) {
		// Check if musician is needed
		this.getMissingInstrument();
		needed = false;
		for (int indexI = 0; indexI < neededInstruments.length; indexI++) {
			if (musician.getInstrument() == neededInstruments[indexI]) {
				needed = true;
			}
		}
		// if he is needed add on the first available spot in the musicians array
		if (needed) {
			for (int indexM = 0; indexM < musicians.length; indexM++) {
				if (musicians[indexM] == null) {
					this.musicians[indexM] = musician;
					return true;
					// when musician successfully added returns true
				}
			}
		}
		// if musicians array is full or musician is not needed returns false
		return false;
	}

	// Finds musician in the array and replaces him with null
	public void removeMusician(Musician musician) {
		for (int index = 0; index < musicians.length; index++) {
			if (this.musicians[index].equals(musician)) {
				this.musicians[index] = null;
				break;
			}
		}
	}

	// clones the band instruments array
	// deletes all taken instruments from the cloned array
	public Instrument[] getMissingInstrument() {
		neededInstruments = bandInstruments;
		for (int compIndexM = 0; compIndexM < musicians.length; compIndexM++) {
			if (musicians[compIndexM] != null) {
				for (int compIndexI = 0; compIndexI < neededInstruments.length; compIndexI++) {
					if (neededInstruments[compIndexI] != null) {
						if (neededInstruments[compIndexI].equals(musicians[compIndexM].getInstrument())) {
							neededInstruments[compIndexI] = null;
							break;
						}
					}
				}
			}
		}
		return neededInstruments;
	}

	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}

	public int getNoOfMembers() {
		return this.noOfMembers;
	}

	public void setBandName(String name) {
		this.name = name;
	}

	public String getBandName() {
		return this.name;
	}

	public Instrument[] getBandInstruments() {
		return bandInstruments;
	}

	public void addBandInstruments(Instrument instrument) {

		for (int indexI = 0; indexI <= bandInstruments.length; indexI++) {
			if (bandInstruments[indexI] == null) {
				this.bandInstruments[indexI] = instrument;
				break;
			}
		}
	}

	public void setBandInstruments(Instrument[] instruments) {
		this.bandInstruments = instruments;
	}

}
