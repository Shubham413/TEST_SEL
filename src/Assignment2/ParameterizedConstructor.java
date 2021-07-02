package Assignment2;

public class ParameterizedConstructor {
	
	String b;
	int a;


	ParameterizedConstructor(int a, String b){
		
		System.out.println("Parameterized constructor Constructor");
		this.a = a;
		this.b = b;
		
		
	}
	

	public static void main(String[] args) {
		
		ParameterizedConstructor obj = new ParameterizedConstructor(10, "String Parameter");
		System.out.println(obj.a);
		System.out.println(obj.b);
		

	}

}
