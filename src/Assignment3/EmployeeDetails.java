package Assignment3;

import java.util.Scanner;

public class EmployeeDetails {
	
	
	 
	
	public static void main(String[] args) {
		
		int empid;
		
		Double empsalary;
		String empdept = null;
		
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the Employee ID : ");
			empid = scn.nextInt();
			scn.nextLine();
			
			System.out.println("Enter the Employee Name : ");
			String empname = scn.nextLine();
			
			System.out.println("Enter the Employee Salary : ");
			empsalary = scn.nextDouble();
			scn.nextLine();

			System.out.println("Enter the Employee Dept : ");
			empdept = scn.nextLine();
		}
		
		if (empid == 1 )
	   {
		   
		   System.out.println("Employee is from First Batch ");  
	   }
	   else if (empid == 2) 
	   {
		   System.out.println("Employee is from Second Batch ");  
		  
	   }
	   else if (empid == 3) 
	   {
		   
		   System.out.println("Employee is from Third Batch ");  
		
	   }
	   else {
		   System.out.println(" Employee is from Other Batch ");
	   }
	   
	   while(empsalary!=null) {
		   
		   if(empsalary<=300000)
		   {   	   
		   System.out.println("Code Continue");
		   continue;     
		   }
		    
		   if(empsalary>300000)
		   {   
			   System.out.println("Salary is > 300000 : Actual salary is " +empsalary);
			   break;		     
		   }
		   
	   }
	   System.out.println("Code End"); 
	}

}
