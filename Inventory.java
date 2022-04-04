package app;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
	public static HashMap<String, Integer> sortByValuehightolow(HashMap<String, Integer> hm)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer> > list =
			new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
			public int compare(Map.Entry<String, Integer> o1,
							Map.Entry<String, Integer> o2)
			{
				return (o2.getValue()).compareTo(o1.getValue());
				//return (o2.getValue()).compareTo(01.getValue());
			}
		});
		
		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}


	// function to sort hashmap by values
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer> > list =
			new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
			public int compare(Map.Entry<String, Integer> o1,
							Map.Entry<String, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	
	public void printInventory()
	{
		int sort;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("press 1 to print inventory high to low, 2 for low to high");
		sort = keyboard.nextInt();
		

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		HashMap<String, Integer> bm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Shotgun", 150);
		hm.put("Sword", 220);
		hm.put("Shield", 300);
		hm.put("Helmet", 400);
		hm.put("Health", 600);
		
		bm.put("Shotgun", 150);
		bm.put("Sword", 220);
		bm.put("Shield", 300);
		bm.put("Helmet", 400);
		bm.put("Health", 600);
		
		Map<String, Integer> hm1 = sortByValuehightolow(hm);
		
		
		
		Map<String, Integer> bm1 = sortByValue(hm);
		
		
		if(sort == 1)
		{
			System.out.println("ok big baller");
			for (Map.Entry<String, Integer> en : hm1.entrySet()) {
				System.out.println("Product: " + en.getKey() +
							", Price: " + en.getValue());
			}
			
		}
		
		if(sort ==2)
		{
			
			for (Map.Entry<String, Integer> en : bm1.entrySet()) {
				System.out.println("Product: " + en.getKey() +
							", Price: " + en.getValue());
			}
			
		}
		
	}
}


