package Assignment2;

public class PrimeNumber {

	
	public static void main(String[] args)   
    {  
		int ct=0,n=0,i=1,j=1;  
		while(n<25)  
		{  
			j=1;  
			ct=0;  
		
			
			while(j<=i)  
			{  
			if(i%j==0)  
				ct++;  //Got this program from internet, primary logic is to divide the no from 1 to that specific no. If counter is more than 2, its not prime.
				j++;   
			}  
			
			if(ct==2)  
			{  
				System.out.printf("%d ",i);  
				n++;  
				}  
		i++;  
		}    
		}  
}
