import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Band {
	
	private String bname; //band name not to be changed once created.
	private List<Instrument> bandInstruments = new ArrayList<Instrument>(); // this is optional. we could get the instruments working on the Musicians list.
	private List<Musician> Musicians = new ArrayList<Musician>();
	
	public Band(String name){
		bname = name;
	}
	
	public String getBandName() { 
		return bname;
	}
	
	public int getNrMembers() {
		return Musicians.size();
	}
	
	public void addMusician(Musician musician) { //check if it already exists
		if(!Musicians.contains(musician)) {
			Musicians.add(musician);
			bandInstruments.add(musician.getInstrument());
			musician.setBand(this);
		}
		else {
			System.out.println("Musician already exists");
		}
	}
	
	public void removeMusician(Musician musician) { //check if it actually exists
		if(Musicians.contains(musician)) {
			bandInstruments.remove(Musicians.indexOf(musician)); // or simply musician.getInstrument
			Musicians.remove(musician);
			musician.removeBand(this);
		}
		else {
			System.out.println("Musician does not exist");
		}
	}
	
	public List<Instrument> getMissingInstrument() {
		
		List<Instrument> missingI = new ArrayList<Instrument>();
		
		for(Instrument instruments : Instrument.values()) {
			if(!bandInstruments.contains(instruments))
				missingI.add(instruments);
		}
		
		return missingI;
	}
}
