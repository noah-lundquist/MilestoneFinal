package app;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class test {

	@Test
	public void welcome() {
		Store store = new Store();


		store.welcome();
		
		
	}
	
	@Test
	public void printallInventory()
	{
		
			Inventory inventory = new Inventory();
			inventory.printInventory();
			
		
	}
	
	@Test
	public void purchase()
	{
		Store store = new Store();
		store.purchase();
	}

}
