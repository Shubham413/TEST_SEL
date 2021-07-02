/*
abstract class Base {
    abstract void fun();
}
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}
class Main {
	
    public static void main(String args[])
    {
  
        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();
  
        // We can have references of Base type.
        Derived b = new Derived();
        System.out.println("Derived method is about to call");
        b.fun();
    }
}
*/

//An abstract class with constructor
abstract class Base {
 Base()
 {
     System.out.println("Base Constructor Called");
 }
 abstract void fun();
 void run() {
	 System.out.println("Non Abstract Method");
 }
}
class Derived extends Base {
	
 Derived()
 {
     System.out.println("Derived Constructor Called");
 }
 void fun()
 {
	 System.out.println("Derived fun() called");
 }

}
class Main {
	static
    {
        System.out.println("Hello User");
    }
 public static void main(String args[])
 {
	 
	 System.out.println("Derived class object creation");
	 //Derived d = new Derived();
	 Base b = new Derived();
	 b.run();
 }
}