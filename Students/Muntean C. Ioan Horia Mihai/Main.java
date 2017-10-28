import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Band band = new Band();
		int nrOfMusicians = input.nextInt(), nrOfInstruments = input.nextInt(), i;
		Musician[] musicians = new Musician[nrOfMusicians];
		Instrument[] bandInstruments = new Instrument[nrOfInstruments];
		Instrument[] missingInstruments = new Instrument[nrOfInstruments];

		for (i = 0; i < nrOfMusicians; i++) {
			musicians[i] = new Musician(input.next(), Instrument.GUITAR);
		}
		for (i = 0; i < nrOfInstruments / 4; i++) {
			bandInstruments[i] = Instrument.GUITAR;
		}
		for (i = nrOfInstruments / 4; i < nrOfInstruments / 2; i++) {
			bandInstruments[i] = Instrument.BASS;
		}
		for (i = nrOfInstruments / 2; i < nrOfInstruments / 2 + nrOfInstruments / 4; i++) {
			bandInstruments[i] = Instrument.DRUMS;
		}
		for (i = nrOfInstruments / 2 + nrOfInstruments / 4; i < nrOfInstruments; i++) {
			bandInstruments[i] = Instrument.VOICE;
		}
		band.setBandInstruments(bandInstruments);
		for (i = 0; i < nrOfMusicians; i++) {
			band.addMusician(musicians[i]);
		}

		missingInstruments = band.getMissingInstruments();
		
		for (i = 0; i < missingInstruments.length; i++) {
			if (missingInstruments[i] == Instrument.GUITAR) {
				System.out.printf(" GUITAR");
			}
			if (missingInstruments[i] == Instrument.DRUMS) {
				System.out.printf(" DRUMS");
			}
			if (missingInstruments[i] == Instrument.VOICE) {
				System.out.printf(" VOICE");
			}
			if (missingInstruments[i] == Instrument.BASS) {
				System.out.printf(" BASS");
			}
		}
	}
}
