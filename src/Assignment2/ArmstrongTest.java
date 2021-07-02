package Assignment2;

import java.util.Scanner;

public class ArmstrongTest {

	
		  public static void main(String[] args)  {  
		    int c=0,a,temp;  
		    
		      Scanner Input = new Scanner(System.in);
			  System.out.println("Enter the no to check : ");
			  int num = Input.nextInt();
		    
		    temp= num;  
		    while(num>0)  
		    {  
		    a=num%10;  
		    num=num/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		}  

