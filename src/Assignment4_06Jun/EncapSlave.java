package Assignment4_06Jun;

public class EncapSlave {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object[] person = getDetails();
		
		EncapMaster obj = new EncapMaster();
		//System.out.println(obj.BankBalance);
		
		Object[] Arr = new Object[5];
		Arr = obj.getDetails();
		System.out.println("Account details before deposit\n");
       // System.out.println(Arr);
        for(Object temp: Arr) {
        	System.out.println(temp);
        }
        
       double Balance = 10000;
        obj.setDetails(Balance);
        System.out.println("\nAccount details After deposit\n");
        //Bank_Encapsulation obj1 = new Bank_Encapsulation();
        Object[] Arr1 = new Object[5];
        
        Arr1 = obj.getDetails();
        
         for(Object temp1: Arr1) {
         	System.out.println(temp1);
         }
        }
}
