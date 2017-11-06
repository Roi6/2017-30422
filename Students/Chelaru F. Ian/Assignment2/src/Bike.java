
public class Bike {
	public int id;
	public String color;
	private boolean docked;
		
	public Bike(int id, String colour)
	{
		this.id=id;
		this.color=colour;
		this.docked=false;
	}
	
	public boolean isDocked()
	{
		return this.docked;
	}
	
	public void dock()
	{
		this.docked=true;
	}
	
	public void undock()
	{
		this.docked=false;
	}
	
	public void changeColor(String colour)
	{
		this.color=colour;
	}
}
