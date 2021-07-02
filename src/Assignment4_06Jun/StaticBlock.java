package Assignment4_06Jun;

public class StaticBlock {
	
	static{
		System.out.println("Static block called before main method");
	}
	
	public static void display() {
		System.out.println("static method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	System.out.println("Main method Call");
	display();//Static method called without creating object
	}
    
}
