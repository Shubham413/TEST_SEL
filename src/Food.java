
public class Food {

    //field that stores the name of the food
    public String name = "Lahsun"; 
    public String name1 = "pakoda"; 
   
   
    //constructor that takes the name of the food as an argument
    public Food(String name, String name1){
      
        System.out.println("Main Constructor initiated");
        System.out.println(name);
        System.out.println(name1);
    }
   
}

class Meat extends Food 
{
public Meat(String a, String b) {
	 super(a,b);

       System.out.println("Derived constructor created");
    
}
    public String getName() {
        return name;
    }
    public String getName1() {
        return name1;
    }



	
	public static void main(String[] args) 
	{
	     //Wolf wolfExample = new Wolf();
	     Meat meatExample = new Meat("MAAS","Chai");  
	     //System.out.println("************Wolf\"************");
	     System.out.println("Wolves eat " + meatExample.getName() +"\t"+ meatExample.getName1());
	    }
}