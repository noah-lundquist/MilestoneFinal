package app;

public class Player {
	
	public String Name;
	public int health;
	public double bank;
	
	
	public Player(String Name, double bank, int health)
	{
		super();
		this.Name = Name;
		this.bank = bank;
		this.health = health;
		
		
		
		
			
	}
	public String getName()
	{
		return Name;
	}
	
	public int getHealth()
	{
		
		return health;
	}
	
	public double getBank()
	{
		
		return bank;
	}
	
	

}
