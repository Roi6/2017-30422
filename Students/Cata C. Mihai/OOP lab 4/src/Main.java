
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Musician singer1 = new Musician(null, "Hetfield", null, 0);
		
		
		Musician guitarist1 = new Musician(null, "Hammett", null, 0);
		singer1.setInstrument(Instrument.VOICE);
		guitarist1.setInstrument(Instrument.GUITAR);
		Musician singer2 = new Musician(null, "Myles", null, 0);
		singer2.setInstrument(Instrument.VOICE);
		Musician guitarist2 = new Musician(null, "Slash", null, 0);
		guitarist2.setInstrument(Instrument.GUITAR);
		System.out.println(guitarist2.getInstrument().getName());
		
		Band met = new Band("Metallica",2);
		
		
		singer1.setBand(met);
		System.out.println(met.getName());
		met.addMusician(guitarist1);
		met.printMembers();
		
		
	}

}
