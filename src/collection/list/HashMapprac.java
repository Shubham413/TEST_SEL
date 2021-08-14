package collection.list;

import java.util.HashMap;
import java.util.Map;

public class HashMapprac {


	 public static void main(String args[]){  
		 
	   HashMap<Integer,String> Hmap=new HashMap<Integer,String>();//Creating HashMap    
	   Hmap.put(1,"Mango");  //Put elements in Map  
	   Hmap.put(2,"Apple");    
	   Hmap.put(3,"Banana");   
	   Hmap.put(4,"Grapes");   
	       
	   System.out.println("Iterating Hashmap..." + Hmap);  
		
		  for(Map.Entry<Integer,String> entry: Hmap.entrySet())
		  { System.out.println(entry.getKey()+" "+entry.getValue()); }
		  
		  Hmap.forEach((k,v) -> System.out.println("Key = "
	                + k + ", Value = " + v));
		 
	}  
	  
}
