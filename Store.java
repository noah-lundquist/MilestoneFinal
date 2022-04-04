package app;
import java.util.*;
import java.lang.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Store {
	
	
	
	public static void welcome()
	{
		double time;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Welcome to the store front our hours are between 900 and 1700(military time)");
		System.out.print("What Time is it(military time)? ");
		time = keyboard.nextInt();
		//if between 9 and 5 military time store is closed upon closed program exits
		if(time>=900 && time<=1700) {
			System.out.println("The store is open please proceed");
		}
		else {
			System.out.println("the store is closed");
			System.exit(0);
		}
	}
	
	

			
			
	
		
	
	
	
	public static void purchase()
	{
		//creates objects
		Weapons Shotgun = new Weapons("Shotgun", 150, "Weapon", 1, 1, 500);
		Weapons Sword = new Weapons("Sword", 220, "Weapon", 1, 4, 500);
		Armor Shield = new Armor("Shield", 300, "Armor", 2, 35, 500);
		Armor Helmet = new Armor("Helmet", 400, "Armor", 1, 20, 500);
		Heals health = new Heals("Health", 600, "Health", 1, 100, 500);
		
		//sets player object
		Player player1 = new Player("Player 1", 1000.00, 200);
		double total = 0;
		double price;
		
		//determinds size of cart
		Scanner keyboard = new Scanner(System.in);
		System.out.println("how many products would you like to purchase today?");
		int numofproducts = keyboard.nextInt();
		if(numofproducts == 0)
		{
			System.exit(0);
		}
		//determinds which product to purchase
		for(int i =0; i<numofproducts;i++)
		{
			System.out.println("enter product number: ");
			int prodnum = keyboard.nextInt();
			
			System.out.println("enter product quanity: ");
			int quan = keyboard.nextInt();
			
			
			
			//decides which product to purchase and quanity 
			switch (prodnum)    {
			
			            case 1:
			
			                price = Shotgun.getPrice()*quan;
			                
			                total = total + price;
			                Weapons Shotgun2 = new Weapons("Shotgun", 150, "Weapon", 1, 1, 500 - quan);
			                
			                Shotgun = Shotgun2;
			
			                break;
			
			            case 2:
			
			                price = Sword.getPrice()*quan;  
			                total = total + price;
			                Weapons Sword2 = new Weapons("Sword", 220, "Weapon", 1, 4, 500 - quan);
			                
			                Sword = Sword2;
			
			                break;
			
			            case 3:
			
			                price = Shield.getPrice()*quan;
			                total = total + price;
			                Armor Shield2 = new Armor("Shield", 300, "Armor", 2, 35, 500 - quan);
			                Shield = Shield2;
			                
			                break;
			
			            case 4:
			
			                price = Helmet.getPrice()*quan;
			                total = total + price;
			                Armor Helmet2 = new Armor("Helmet", 400, "Armor", 1, 20, 500 - quan);
			                Helmet = Helmet2;
			                
			                break;
			
			            case 5:
			
			                price =  health.getPrice()*quan;
			                total = total + price;
			                Heals health2 = new Heals("Health", 600, "Health", 1, 100, (int) (500 - quan));
							  
							
							health = health2;
			                
			                break;
			
			           
			        } 
			
			

		}
		//gets total, and prints out how much if you would have left if you would like to purchase
		System.out.println("total: "+total);
		double remaining = player1.getBank()-total;
		System.out.println("You will have: "+remaining+ " remaining");
		
		//prints inventory stock after cart fills
		System.out.println("----------Current inventory:--------------");
		System.out.println( Shotgun.getName()+" "+" "+Shotgun.getinStock());
		System.out.println( Sword.getName()+" "+" "+Sword.getinStock());
		System.out.println( Shield.getName()+" "+" "+Shield.getinStock());
		System.out.println( Helmet.getName()+" "+" "+Helmet.getinStock());
		System.out.println( health.getName()+" "+" "+health.getinStock());
		System.out.println("-------------------------------------------");
		
		//gets whether you would to continue
		System.out.println("would you like to continue? 1 for yes, 0 for remove a product from cart");
		int remove = keyboard.nextInt();
		
		
		//if you would like to continue, if not cart empties and starts over
		if(remove == 1)
		{
			System.out.println("You have: "+remaining+ " remaining");
			System.exit(1);
		}
		if(remove == 0 )
		{
			
			System.out.println("Please refill your cart");
			purchase();
	           
	       
			
			
		}
		
		
	
		
		
		
		
	}
	//if you would not like to purchase program closes
	static void storeClosed()
	{
		System.out.println("have a nice day");
		System.exit(0);
	}
	
	
	 public static void showallInventory()
	{
		//Gets current objects
		Weapons Shotgun = new Weapons("Shotgun", 150, "Weapon", 1, 1, 500);
		Weapons Sword = new Weapons("Sword", 220, "Weapon", 1, 4, 500);
		Armor Shield = new Armor("Shield", 300, "Armor", 2, 35, 500);
		Armor Helmet = new Armor("Helmet", 400, "Armor", 1, 20, 500);
		Heals health = new Heals("Health", 600, "Health", 1, 100, 500);
	
		//Shows Current inventory
		System.out.println("Current Inventory: \n");
		System.out.println(Shotgun.name + " price: " + Double.toString(Shotgun.price)+ " Damage: " + Integer.toString(Shotgun.damage)+ "In stock: "+Integer.toString(Shotgun.inStock)+" Product Number 1");
		System.out.println(Sword.name + " price: " + Double.toString(Sword.price) + " Damage: " + Integer.toString(Sword.damage)+ "In stock: "+Integer.toString(Sword.inStock)+ " Product Number 2");
		System.out.println(Shield.name + " price: " + Double.toString(Shield.price) + " addition to health: " + Integer.toString(Shield.damage)+ "In stock: "+Integer.toString(Shield.inStock)+  " Product Number 3");
		System.out.println(Helmet.name + " price: " + Double.toString(Helmet.price) + " addition to health: " + Integer.toString(Helmet.damage)+ "In stock: "+Integer.toString(Helmet.inStock)+ " Product Number 4");
		System.out.println(health.name + " price: " + Double.toString(health.price) + " addition to health: " + Integer.toString(health.damage)+ "In stock: "+Integer.toString(health.inStock)+ " Product Number 5");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to purchase today? enter 1 for yes, 0 for no");
		int rply = keyboard.nextInt();
		
		if(rply == 0)
		{
			System.out.println("have a nice day");
			System.exit(0);
		}
		
		if(rply == 1)
		{
			purchase();
		}
	

	
}
	}
