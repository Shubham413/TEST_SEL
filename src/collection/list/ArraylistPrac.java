package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistPrac {

	public static void main(String[] args) {	
		
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
  
        
        // Creating elements of arraylist
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
        	
        	arrlist.add(i);
        }
        // Printing elements

        for(int arrval: arrlist){
        	System.out.println(arrval);
        }
        
        System.out.println(arrlist);
  
        // Remove element at index 3
        arrlist.remove(3);
  
        // Displaying the ArrayList
        // after deletion
        System.out.println(arrlist);
        System.out.println(arrlist.size());
        arrlist.add(arrlist.size(), 6);
  
        // Printing elements one by one

        for (int i = 0; i < arrlist.size(); i++)
            System.out.print(arrlist.get(i) + " ");
        
        //arrlist.clear();
        
        System.out.println("\nIndex of value 2 is --> " +arrlist.indexOf(2));
        
        //Iterator
        
        Iterator<Integer> Itr = arrlist.iterator();
        
        while(Itr.hasNext()) {
        	System.out.println(Itr.next());
        }

		
	}
		
    }
		

