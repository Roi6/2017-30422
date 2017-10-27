package musically;

public class Main {

	public static void main(String[] args)
	{
		Musician m1 = new Musician("Danny");
		System.out.println("Account created: " + m1.getUsername());
		
		Musician m2 = new Musician("Ben");
		System.out.println("Account created: " + m2.getUsername());
		
		Band b1 = new Band("AA");
		String v1 = b1.getName();
		System.out.println("Band created: " + v1);
	
		m1.setInstrument(Instrument.VOICE);
		System.out.println(m1.getUsername() + " plays " + m1.getInstrument().getName());

		m2.setInstrument(Instrument.GUITAR);
		System.out.println(m2.getUsername() + " plays " + m2.getInstrument().getName());
		
		m1.setUsername("DannyW");
		System.out.println(m1.alias() + " changed his/her name to " + m1.getUsername());
		
		
		
		
		//b1.addMusician(m1); nu merge. NullPointerException
		//b1.addMusician(m2);
	}

}
