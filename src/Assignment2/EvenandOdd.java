package Assignment2;

public class EvenandOdd {
	
	 public static void main(String[] args)
	    {
	       for(int num = 1; num<=100; num++)
	       {
	  
	        // If condition to check if the remainder is zero
			        if (num % 2 == 0) {
			  
			            // If remainder is zero then this number is even
			            System.out.println("Number is Even : " +num);
			        }
			        else {
			  
			            // If remainder is not zero then this number is
			            // odd
			            System.out.println("Number is Odd : " +num);
			         }
	       }
	    }
	}

