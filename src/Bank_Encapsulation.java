import java.math.BigInteger;
import java.util.Arrays;

public class Bank_Encapsulation {
	
	private String AccountNumber = "058D07213";
	private double BankBalance = 550000;
	private String Name = "Swiss Bank";
	private String Address = "Switzerland";
	private int Phone = 2553371;
	
	public Object[] getDetails(){
		
		return new Object[] { AccountNumber, this.BankBalance, Name, Address, Phone };	
	}

	public void setDetails(double Balance) {
		this.BankBalance = Balance;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object[] person = getDetails();
		
		Bank_Encapsulation obj = new Bank_Encapsulation();
		System.out.println(obj.BankBalance);
		
		Object[] Arr = new Object[5];
		Arr = obj.getDetails();
       // System.out.println(Arr);
        for(Object temp: Arr) {
        	System.out.println(temp);
        }
        
       double Balance = 10000;
        obj.setDetails(Balance);
        
        //Bank_Encapsulation obj1 = new Bank_Encapsulation();
        Object[] Arr1 = new Object[5];
        Arr1 = obj.getDetails();
        
         for(Object temp1: Arr1) {
         	System.out.println(temp1);
         }
        }
	}


