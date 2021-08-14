
class Student{  
	String name; 
    String name1; 
  
  
   //constructor that takes the name of the food as an argument
   Student(String name, String name1){    
       System.out.println("Main Constructor initiated");
       name = name;
       name1 = name1;
      
   }
void display(){
	System.out.println("Eat " + name + " and " +name1 );}  
}  
  
class TestThis2{  
public static void main(String args[]){  
	Student s1 = new Student("MAAS","Chai");
	
	s1.display();  
	 
}}  