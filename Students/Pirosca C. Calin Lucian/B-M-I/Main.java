import java.awt.List;
import java.util.Arrays;

public class Main {
	
	public static void main(String args[]) {
		
		Musician m1 = new Musician("George1", Instrument.BASS,1);
		Musician m2 = new Musician("Alex", Instrument.DRUMS,2);
		Musician m3 = new Musician("Mihai", Instrument.VOICE,3);
		
		System.out.println(m1.getUsername() + " " + m1.getInstrument());
		System.out.println(m2.getUsername() + " " + m2.getInstrument());
		System.out.println(m3.getUsername() + " " + m3.getInstrument());
		
		Band b1 = new Band("Dinozaurii");
		Band b2 = new Band("Rolling");
		
		System.out.println(b1.getBandName());
		System.out.println(b2.getBandName());
		
		b1.addMusician(m1);
		b1.addMusician(m2);
		b2.addMusician(m3);
		b2.addMusician(m1);
		
		System.out.println("\n\n\n");
		for(Instrument instrument : b2.getMissingInstrument()) {
			System.out.println(instrument);
		}
	}

}
