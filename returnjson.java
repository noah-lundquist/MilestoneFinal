package app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;


public class returnjson {

	public void returnJson()
	{
		
		try {
		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();

		    // convert JSON file to map
		    Map<?, ?> map = (Map<?, ?>) mapper.readValue(Paths.get("inventory.json").toFile(), Product.class);

		    // print map entries
		    for (Map.Entry<?, ?> entry : map.entrySet()) {
		        System.out.println(entry.getKey() + "=" + entry.getValue());
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
			
		}
	
			
			
		
		
		
	
	
	public void addProduct()
	{
		
		try {
		    // create book object
		    Product product = new Product("Pistol", 100, "Weapon", 1, 1, 500);

		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();

		    // convert object to JSON file
		    mapper.writeValue(Paths.get("inventory.json").toFile(), product);

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		
	
		
	}
}
