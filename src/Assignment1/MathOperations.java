package Assignment1;

public class MathOperations {
	
	public static void main(String args[])
    {
	int a = 10; //variable declaration
	int b = 20; //variable declaration
	
	int Sum = a + b; //Values Added
	int Subtract = b - a; //Values Subtracted
	int Multiply = a*b; //Values Multiplied
	double Division = (double)b/(double)a; // values Divided
	int Modulus = b%a; //remainder
	
	
	
	//Printing values
	 System.out.println("Sum of a and b is: " + Sum);
	 System.out.println("Subtraction of a and b is: " + Subtract);
	 System.out.println("Multiplication of a and b is: " + Multiply);
	 System.out.println("Division of a and b is: " + Division);
	 System.out.println("Remainder of a and b is: " + Modulus);
	 
	 int Incrementedvalue = ++a;
	 int Decrementedvalue = --b;
	 
	 System.out.println("Incremented value of a is : " + Incrementedvalue);
	 System.out.println("Decremented value of a is : " + Decrementedvalue);
	
    }
	

}
