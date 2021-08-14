package Assignment4_06Jun;

import java.util.Scanner;

public class Method_Overriding {

	public void Result() {
		
		System.out.println("Enter Exam Percentage");
		Scanner sc = new Scanner(System.in);
		double Percentage = sc.nextDouble();
		sc.close();
		if(Percentage>100) {
			System.out.println("Invalid Percentage as it is greater than 100");
		}
		else if(Percentage>=60){
        	System.out.println("Passed with first division");	
        }
		else if(Percentage<60 && Percentage >=33) {
			System.out.println("Passed with Second Division");
		}
		else {
			System.out.println("Failed as Percentage is "+ Percentage);
		}
	}
}


class Ovrriding extends Method_Overriding{
	
	 public void Result() {
		 
		 System.out.println("Enter Exam Percentage");
			Scanner sc = new Scanner(System.in);
			double Percentage = sc.nextDouble();
			sc.close();
			if(Percentage>100) {
				System.out.println("Invalid Percentage as it is greater than 100");
			}
			else if(Percentage>=60){
	        	System.out.println("Passed with first division");	
	        	
	        	if(Percentage>=75) 
	        	{
	        		System.out.println("Achievement: Distinction");
	        	}
	        }
			else if(Percentage<60 && Percentage >=33) {
				System.out.println("Passed with Second Division");
			}
			else {
				System.out.println("Failed as Percentage is "+ Percentage);
			}
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ovrriding obj = new Ovrriding();
		obj.Result();
		
	}
}