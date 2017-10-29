
public class Bike {
	public int id;
	public String color;
	private boolean docked;
	public static int test; //static = declar resurse statice accesibile
	
	public Bike(int id){
		this.id = id;
		this.docked = false;
	}
	
	public boolean isDocked() {
		return this.docked;
	}
	
	
}
