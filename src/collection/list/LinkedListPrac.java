package collection.list;

import java.util.LinkedList;

public class LinkedListPrac {
	
	public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> LinkList = new LinkedList<String>();
  
        // Adding elements to the linked list
        LinkList.add("A");
        LinkList.add("B");
        LinkList.addLast("C");
        LinkList.addFirst("D");
        LinkList.add(2, "E");
  
        System.out.println(LinkList);
  
        LinkList.remove("B");
        LinkList.remove(3);
        LinkList.removeFirst();
        LinkList.removeLast();
  
        System.out.println(LinkList);
        
        for (String str : LinkList) 
            System.out.print(str + " "); 
    }

}
