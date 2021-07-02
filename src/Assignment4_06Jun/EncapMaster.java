package Assignment4_06Jun;



public class EncapMaster {

	
		private String AccountNumber = "058D07213";
		private double BankBalance = 55000;
		private String Name = "Swiss Bank";
		private String Address = "Switzerland";
		private int Phone = 2553371;
		
		public Object[] getDetails()
			{
				
				return new Object[] { AccountNumber, this.BankBalance, Name, Address, Phone };	
			}

		public void setDetails(double Balance) 
			{
				this.BankBalance = BankBalance + Balance;
				
			}

		
		}



