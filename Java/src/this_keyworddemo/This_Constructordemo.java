package this_keyworddemo;

public class This_Constructordemo {

	public  This_Constructordemo()
	 {
		this("Ashok");
		System.out.println("Exam Result : Pass");
	 }
	
	public  This_Constructordemo(String name)
	 {
		this(90);
		System.out.println("Name is: "+name);
	 }
	
	public  This_Constructordemo(int mark)
	 {
		this("English",50);
		System.out.println("Mark is  :"+mark);
	 }
	
	public  This_Constructordemo(String subject,int mark)
	 {
		System.out.println("Subject is :"+ subject+"   "+" Mark is  :"+mark);
	 }
	public static void main(String[] args) {
		
		This_Constructordemo object=new This_Constructordemo();
		

	}

}
