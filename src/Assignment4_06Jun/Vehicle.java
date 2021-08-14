package Assignment4_06Jun;

//****************************************************************//
//Program written to Illustrate Single inheritance and Super keyword
//****************************************************************//

public abstract class Vehicle {
	String Brand;
	String Model;
	abstract void Model();
	
	void Horn() {
		System.out.println("Vehicle sound is Ti Ti" );
	}

}


class Ford extends Vehicle{
	
	    void Model() {
	       Brand = "FORD";
		   Model = "Mustang GT";
		   System.out.println("Brand is " + Brand + "\nModel is " + Model);
			}
	    
	    void HornSound(){
	    	super.Horn();
	    	Horn();
	    }
	    
	    void Horn(){
	    	
	    	System.out.println("Vehicle sound is Pi Pi" );
	    }
	    
	    
	    public static void main(String[] args) {
	    	Ford obj = new Ford();
	    	obj.Model();
	    	obj.HornSound(); 	
	    	
	    }
}