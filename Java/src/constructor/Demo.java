package constructor;

public class Demo {

	public static void main(String[] args) {
	  Demo obj =new Demo();  //Output is Rohit
      Demo obj1= new Demo("name"); //output is Rahul
	}

	public Demo()     //Defualt Constructor Example (after create object of class it automatically Invoked)
	{
		System.out.println("Rohit");
	}
	
	public Demo( String name) //Parameterization Constructor Example
	{
		System.out.println("Rahul");
	}
	
}
