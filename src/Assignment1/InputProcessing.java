package Assignment1;

import java.util.*;

public class InputProcessing {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter value of first no i.e. a ");
		int a = Input.nextInt();
		
		System.out.println("Enter value of first no i.e. b ");
		int b = Input.nextInt();
		Input.close();
		int Sum = a + b; //Values Added
		int Subtract = b - a; //Values Subtracted
		int Multiply = a*b; //Values Multiplied
		double Division = (double)b/(double)a; // values Divided
		
		 System.out.println("Sum of a and b is: " + Sum);
		 System.out.println("Subtraction of a and b is: " + Subtract);
		 System.out.println("Multiplication of a and b is: " + Multiply);
		 System.out.println("Division of a and b is: " + Division);
		
	
	}

}
