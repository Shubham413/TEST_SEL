package Assignment4_06Jun;

public class AbstractClassImplementation extends AbstractClass{
	
		
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
		
		public static void main(String[] args) {
			
			
			AbstractClassImplementation dbobj = new AbstractClassImplementation();
			dbobj.EMI();
			dbobj.RemainingBalance(11000.00);
			
		
	}

}
