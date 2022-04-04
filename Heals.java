package app;

public class Heals extends Product{

	public Heals(String name, double price, String category, int quanity, int damage, int inStock) {
		super(name, price, category, quanity, damage, inStock);
		// TODO Auto-generated constructor stub
	}
	
	public String getName()
	{
		return name;
	}
	//gets price
	public double getPrice()
	{
		price = quanity * price;
		return price;
	}
	//get category
	public String getCategory()
	{
		return category;
	}
	// gets quanity
	public int getQuanity()
	{
		quanity = quanity *1;
		return quanity;
	}
	public int getDamage()
	{
		damage = damage + - 100;
		return damage;
	}
	
	public int getinStock()
	{
		
		return inStock;
	}


}
