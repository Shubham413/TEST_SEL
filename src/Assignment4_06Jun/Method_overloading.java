package Assignment4_06Jun;

public class Method_overloading {
    
	
	void add(double a, double b) {
		double c = a + b;
		System.out.println("Value of addition with two parameters is " + c);
		
	}
	
	void add(double a, double b, double c) {
		double d = a + b + c;	
		System.out.println("Value of addition with three parameters is " + d);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Method_overloading obj = new Method_overloading();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		
	}

}
