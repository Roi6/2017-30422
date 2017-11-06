
public class Main {

	public static void main(String[] args) {
		
		
		Musician[] musicians = new Musician[7];
		musicians[0] = new Musician("Olof");
		musicians[0].setUsername("Olofmeister");
		musicians[0].setInstrument(Instrument.GUITAR);
		musicians[1] = new Musician("Paul");
		musicians[1].setUsername("Lika");
		musicians[1].setInstrument(Instrument.VOICE);
		musicians[2] = new Musician("Burda");
		musicians[2].setUsername("Turda");
		musicians[2].setInstrument(Instrument.PIANO);
		musicians[3] = new Musician("Jan");
		musicians[3].setUsername("Ian");
		musicians[3].setInstrument(Instrument.DRUMS);
		musicians[4] = new Musician("Dica");
		musicians[4].setUsername("Mica");
		musicians[4].setInstrument(Instrument.BASS);
		musicians[5] = new Musician("Paula");
		musicians[5].setUsername("Lisa");
		musicians[5].setInstrument(Instrument.DRUMS);
		musicians[6] = new Musician("Ana");
		musicians[6].setUsername("Anna");
		musicians[6].setInstrument(Instrument.VOICE);
		
	
		Band[] bands = new Band[2];
		bands[0] = new Band(5);
		bands[0].setBandName("Paussks");
		bands[0].addNeededInstrument(Instrument.GUITAR);
		bands[0].addNeededInstrument(Instrument.PIANO);
		bands[0].addNeededInstrument(Instrument.VOICE);
		bands[0].addNeededInstrument(Instrument.DRUMS);
		bands[0].addNeededInstrument(Instrument.BASS);
		bands[0].addMusician(musicians[0]);
		bands[0].addMusician(musicians[1]);
		bands[0].addMusician(musicians[2]);
		bands[0].addMusician(musicians[3]);
		bands[0].addMusician(musicians[4]);
		System.out.println(bands[0].getBandName());
		for(int i = 0; i < 5 ; i++) {
			System.out.println(bands[0].neededInstruments[i] );
		}
		System.out.println(bands[0].getIndexOfMember());
		
		
		bands[1] = new Band(3);
		bands[1].setBandName("Samba");
		bands[1].addNeededInstrument(Instrument.GUITAR);
		bands[1].addNeededInstrument(Instrument.DRUMS);
		bands[1].addNeededInstrument(Instrument.VOICE);
		bands[1].addMusician(musicians[0]);
		bands[1].addMusician(musicians[5]);
		bands[1].addMusician(musicians[6]);
		bands[1].addMusician(musicians[4]);
		System.out.println(bands[1].getBandName());
		for(int i = 0; i < 3 ; i++) {
			System.out.println(bands[1].neededInstruments[i] );
		}
		System.out.println(bands[1].getIndexOfMember());
	
		
	
		
		
		
	}
}
