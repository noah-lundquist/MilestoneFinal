package app;

import java.util.ArrayList;

import java.util.Scanner;

public class Main extends Thread{

	public static void run1()
	{
		Scanner scanner = new Scanner(System.in);
	    String inputString = scanner.nextLine();
	    
	    if(inputString == "u") {
	    	
	    	returnjson returnjson = new returnjson();
		    
		    returnjson.returnJson();
	    	
	    }
	    
	    
	    		
		
	}
	
	public static void run2()
	{
		Scanner scanner = new Scanner(System.in);
	    String inputString = scanner.nextLine();
		   if(inputString == "r") {
		    	
		    	returnjson returnjson = new returnjson();
			    
			    
				returnjson.addProduct();
		    	
		    }
		
		
	}
	
	public static void run3()
	{
		Store store = new Store();
		
		//calls welcome store
		
		store.welcome();
		
		store.purchase();
		
		
	}
	
	public static void main(String [] args)
	{
		
		
		Thread t1 = new Main();
		t1.start();
		
	
	Inventory inventory = new Inventory();
		
		//inventory.printInventory();
		
		Store store = new Store();
		
		//calls welcome store
		
		store.welcome();
		
		//store.showallInventory();
		inventory.printInventory();
		store.purchase();
		
		
		
        

	}
	
}


