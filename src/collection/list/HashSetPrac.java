package collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac {
	
	public static void main(String[] args)
    {
        HashSet<String> HSET = new HashSet<String>();
  
        // Adding elements into HashSet usind add()
        HSET.add("India");
        HSET.add("Australia");
        HSET.add("South Africa");
        HSET.add("India"); // adding duplicate elements
  
        // Displaying the HashSet
        System.out.println(HSET);
        System.out.println("HSET contains India or not:"+ HSET.contains("India"));
  
        // Removing items from HashSet using remove()
        HSET.remove("Australia");
        System.out.println("HSET after removing Australia:" + HSET);
        HSET.add("UNITED KINGDOM");
  
        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = HSET.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

}
