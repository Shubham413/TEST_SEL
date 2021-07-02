package Assignment4_06Jun;

public class StaticTest {
	
	/*
	 * static { String CollegeName = "MIT"; }
	 */

	int StudentID;
	String StudentName; 
	static String CollegeName = "MIT"; //static variable
	String CourseName;
	
	public StaticTest(int StudentID, String StudentName,  String CourseName  ) {
		//Constructor
		this.StudentID = StudentID;
		this.StudentName = StudentName;
		this.CourseName  = CourseName;
		}
	
	public void ShowStudentData() {
		System.out.println( "Student ID : "+ StudentID + "\t Student Name : "+ StudentName + "\t College Name: "+CollegeName + "\t CourseName : " + CourseName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		StaticTest st = new StaticTest( 1 , "Student1" , "BBA");
		StaticTest st1 = new StaticTest( 2 , "Student2" , "MBA");
		StaticTest st2 = new StaticTest( 3 , "Student3" , "BE");
		StaticTest st3 = new StaticTest( 4 , "Student4" , "MCA");
		
		st.ShowStudentData();
		st1.ShowStudentData();
		st2.ShowStudentData();
		st3.ShowStudentData();
		
	}

}
