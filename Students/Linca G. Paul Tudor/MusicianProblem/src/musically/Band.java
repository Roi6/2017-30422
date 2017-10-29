package musically;

public class Band
{
	private int noOfMembers = 0;
	private String name;
	private Instrument[] bandInstruments = new Instrument[10];
	private Musician[] musicians = new Musician[10];
	
	public Band(String name)
	{
		this.name = name;
		this.noOfMembers = 0;
	}
	
	public void addMusician(Musician musician)
	{
		this.musicians[this.noOfMembers] = musician;
		this.noOfMembers++;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Instrument[] getMissingInstrument()
	{
		Instrument[] missingInstruments = new Instrument[this.noOfMembers];
		missingInstruments = bandInstruments;
		for(int j = 0; j < this.noOfMembers; j++)
			{
			Instrument musicianInstrument = this.musicians[j].getInstrument();
			}
		return missingInstruments;
	}
	
	public void getInstruments()
	{
		System.out.print("The instruments played in band " + this.getName() + " are: ");
		for(int j = 0; j < this.noOfMembers; j++)
		{
			System.out.print(this.musicians[j].getInstrument().getName() + ", ");
		}
		System.out.print("\n");
	}
	
	public void addInstrument(Musician musician)
	{
		this.bandInstruments[this.noOfMembers] = musician.getInstrument();
	}
	
	public void getMusicians()
	{
		System.out.print("The musicians in band " + this.getName() + " are: ");
		for(int j = 0; j < this.noOfMembers; j++)
		{
			System.out.print(this.musicians[j].getUsername() + ", ");
		}
		System.out.print("\n");
	}
	
	public void deleteMusician(Musician musician)
	{
		if(this.noOfMembers > 0)
		{
			outer: for(int i = 0; i <= this.noOfMembers; i++)
			{
				if(this.musicians[i] == musician)
				{
					for(int j = i; j <= this.noOfMembers; j++)
					{
						this.musicians[j] = this.musicians[j+1];
					}
					this.noOfMembers--;
					break outer;
				}
			}
		}
	}
	
	public void deleteInstrument(Instrument instrument)
	{
		if(this.noOfMembers > 0)
		{
			outer: for(int i = 0; i <= this.noOfMembers; i++)
			{
				if(this.bandInstruments[i] == instrument)
				{
					for(int j = i; j <= this.noOfMembers; j++)
					{
						this.bandInstruments[j] = this.bandInstruments[j+1];
					}
					break outer;
				}
			}
		}
	}
	
	public void disband()
	{
		/*this = null;
		delete this;*/
		//idk how
	}
}