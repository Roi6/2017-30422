
public class Band {
	private int nrOfMembers = 0;
	private String name;
	//private Instrument[] bandInstrument;
	private Musician[] musicians;

	public Band(String name, int nrOfMembers)
	{
		this.name = name;
		this.nrOfMembers = nrOfMembers;
		
	}
	public String getName()
	{
		return this.name;
	}
	public void addMusician(Musician musician) {
		this.nrOfMembers++;
		//this.bandInstrument[nrOfMembers] = musician.getInstrument();
		this.musicians[nrOfMembers] = musician;
		//this.musicians[nrOfMembers] = musician;
	}
	public void getNrOfMembers()
	{
		System.out.println(this.nrOfMembers);
	}
	public void printMembers()
	{
		for (int i=1;i<this.nrOfMembers;i++)
		{
			System.out.println(this.musicians[i].getUsername());
		}
	}
}
