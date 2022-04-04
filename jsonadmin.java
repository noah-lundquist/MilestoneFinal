package app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
public class jsonadmin {

	public void printjson() {
		// TODO Auto-generated method stub
		
		String jsonInventory = " {\r\n"
				+ "    \"Inventory\": {\r\n"
				+ "        \"Weapons\": {\r\n"
				+ "            \"Shotgun\": {\"Name\":\"Shotgun\", \"Price\": 150, \"Category\" : \"weapons\", \"quanity\" : 1, \"Damage\" : 1, \"inStock\" : 500},\r\n"
				+ "            \"Sword\": {\"Name\":\"Sword\", \"Price\": 220, \"Category\" : \"weapons\", \"quanity\" : 1, \"Damage\" : 4, \"inStock\" : 500}\r\n"
				+ "        },\r\n"
				+ "        \"Armor\": {\r\n"
				+ "            \"Shield\": {\"Name\":\"Shield\", \"Price\": 300, \"Category\" : \"Armor\", \"quanity\" : 2, \"Damage\" : 35, \"inStock\" : 500},\r\n"
				+ "            \"Helmet\": {\"Name\":\"Helmet\", \"Price\": 400, \"Category\" : \"Armor\", \"quanity\" : 1, \"Damage\" : 20, \"inStock\" : 500}\r\n"
				+ "        },\r\n"
				+ "           \"Health\": {\r\n"
				+ "            \"Health\": {\"Name\":\"Health\", \"Price\": 600, \"Category\" : \"Health\", \"quanity\" : 1, \"Damage\" : 100, \"inStock\" : 500},\r\n"
				+ "            \"Helmet\": {\"Name\":\"Helmet\", \"Price\": 400, \"Category\" : \"Armor\", \"quanity\" : 1, \"Damage\" : 20, \"inStock\" : 500}\r\n"
				+ "        }\r\n"
				+ "            \r\n"
				+ "        \r\n"
				+ "    }\r\n"
				+ "}";
		
		System.out.println(jsonInventory);
		
		
		
	   
	    
	    
	    
	    
	   
	    
	 
	    
	    
	    
	    


	}

}
