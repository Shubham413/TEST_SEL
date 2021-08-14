package collection.list;

import java.util.LinkedHashSet;

public class LinkedHsetPrac {
	
	public static void main(String[] args) 
    {  
        LinkedHashSet<String> linkedHashset = new LinkedHashSet<String>();  
  
        // Adding element to LinkedHashSet  
        linkedHashset.add("A");  
        linkedHashset.add("B");  
        linkedHashset.add("C");  
        linkedHashset.add("D"); 
  
        // This will not add new element as A already exists 
        linkedHashset.add("A"); 
        linkedHashset.add("E");  
  
        System.out.println("Size of LinkedHashSet = " +linkedHashset.size());  
        System.out.println("Original LinkedHashSet:" + linkedHashset);  
        System.out.println("Removing D from LinkedHashSet: " +linkedHashset.remove("D"));  
        System.out.println("Trying to Remove Z which is not "+"present: " + linkedHashset.remove("Z"));  
        System.out.println("Checking if A is present=" + linkedHashset.contains("A"));
        System.out.println("Updated LinkedHashSet: " + linkedHashset);  
    }

}
