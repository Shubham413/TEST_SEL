package Assignment4_06Jun;

public abstract class AbstractClass {
	
	double Loan = 50000;
	double emi = 0;
	//System.out.println("Calculated EMI:"+ emi);
	double RemainingBal = 50000;
	
	
	void EMI()
	{
		//double emi = 0;
		emi= Loan/6;
		System.out.println("For a loan of Amount: "+Loan+" No Cost EMI will be:" + emi);
		
	}
    
	
	double RemainingBalance(double emi) 
	{   
		   
			RemainingBal= RemainingBal-emi;
			//return RemainingBal;
			System.out.println("Paid EMI: "+ emi);
			System.out.println("Remaining Balance: "+RemainingBal );
			return RemainingBal;
	}
		
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
		}

}

class FetchData extends AbstractClass{
	
	
	public static void main(String[] args) {
		
		FetchData dbobj = new FetchData();
		dbobj.EMI();
		dbobj.RemainingBalance(11000.00);
		
	}
}