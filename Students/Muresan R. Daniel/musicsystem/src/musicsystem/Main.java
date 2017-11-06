package musicsystem;

public class Main {

	public static void main(String[] args) {
		Instrument[] metallicaInstruments = { Instrument.BASS, Instrument.DRUMS, Instrument.BASS };
		Band metallica = new Band(3, metallicaInstruments);
		Musician bob = new Musician("Bob", Instrument.DRUMS);
		Musician dylan = new Musician("Dylan", Instrument.BASS);
		Musician tyler = new Musician("Tyler", Instrument.BASS);
		metallica.addMember(bob);
		metallica.addMember(dylan);
		metallica.addMember(tyler);

	}

}
