package Assignment2;

public class DefConstructor {
	
	int num;
    String name;
	
	DefConstructor(){
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		DefConstructor object = new DefConstructor();
		System.out.println(object.name);
		System.out.println(object.num);
		
	
	}

}
