package Assignment1;

public class PrefixandPostfixoperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = a++;
		
		System.out.println("Assigned Value of a after a++ is : " +c);
		
		System.out.println("Value of a after ++a is : " +a);
		
		c = ++a;

		System.out.println("Value of a after ++a is : " +c);
		
        
		c+=3;
		System.out.println("Value of c after c+=3 is : " +c);
		
		c-=3;
		
		System.out.println("Value of c after c-=3 is : " +c);
	}

}
