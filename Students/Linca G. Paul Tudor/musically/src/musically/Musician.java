package musically;

public class Musician 
{
	private Instrument instrument;
	private int noOfBands = 0;
	private String username;
	private Band[] bands;
	private String prevUsername = null;
	
	public Musician(String username)
	{
		this.username = username;
	}
	
	public String alias()
	{
		return this.prevUsername;
	}
	
	public Instrument getInstrument()
	{
		return this.instrument;
	}
	
	public void setInstrument(Instrument instrument)
	{
		this.instrument = instrument;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String username)
	{
		this.prevUsername = this.username;
		this.username = username;
	}
	
	public Band[] getBands()
	{
		return bands;
	}
	
	public void addBand(Band band)
	{
		this.bands[noOfBands] = band;
		this.noOfBands++;
	}
	
	public void deleteBand(Band band)
	{
		if(this.noOfBands > 0)
		{
			outer: for(int i = 0; i <= this.noOfBands; i++)
			{
				if(this.bands[i] == band)
				{
					for(int j = i; j <= this.noOfBands; j++)
					{
						this.bands[j] = this.bands[j+1];
					}
					this.noOfBands--;
					break outer;
				}
			}
		}
	}
	
	public void deleteAccount()
	{
		//same
	}

}
