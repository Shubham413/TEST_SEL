package Assignment2;

import java.util.Scanner;

public class PallindromeTest {
	
	public static void main(String args[]){  
		
		  int r,sum=0,temp;    
		  Scanner Input = new Scanner(System.in);
		  System.out.println("Enter the no to check : ");
		  int num = Input.nextInt();
		  
		  temp=num;    
		  while(num>0){    
		   r=num%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

}
