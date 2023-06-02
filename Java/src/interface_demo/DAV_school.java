package interface_demo;

public class DAV_school implements School {

	public static void main(String[] args) {
		DAV_school dv=new DAV_school();
		dv.sitAvailable();
		dv.courseName();

	}
	public void courseName() 
	{
		System.out.println("Arts,Science");
	}
	public void sitAvailable()
	{
		System.out.println(50);
	}
	
}
