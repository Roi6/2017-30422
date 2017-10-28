
public class Main {

	public static void main(String[] args) {
		
		Musician[] musicians = new Musician[3];
		musicians[0] = new Musician("Eminem");
		musicians[0].setInstrument(Instrument.VOICE);
		
		musicians[1] = new Musician("Sponge Bob");
		musicians[1].setInstrument(Instrument.GUITAR);
		
		musicians[2] = new Musician("Some random Singger");
		musicians[2].setInstrument(Instrument.VOICE);

		Band band1 = new Band();
		band1.setNoOfMembers(2);
		band1.setBandName("Some totally random band name");
		band1.addBandInstruments(Instrument.VOICE);
		band1.addBandInstruments(Instrument.GUITAR);
		
		for(int count = 0; count < 3 ; count ++){
			System.out.print("Musician ");
			System.out.print(musicians[count].getUserName());
			
			if(band1.addMusician(musicians[count])){
				System.out.println(" was added Successfully!");
			}
			else {
				System.out.println(" was NOT added !");
			}
		}
		
		
		
//		band1.setBandInstruments(Instrument, Instrument.GUITAR);
//  	can i input directly the elements of the array like this  ^ ?... somehow
		
	}

}
