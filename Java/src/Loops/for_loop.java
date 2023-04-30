package Loops;

public class for_loop {

	public static void main(String[] args) {
	//Example of For Loops...........................................
		int [] no= {15,23,27,19,12};
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		  //Reverse data using for loops..........
		for(int i=4;i<no.length-1;i--)
		{
			System.out.println(no[i]);
		}
		
		
		
	//Enhance For-Loop(For Each Loop)......................................	
		String []name= {"Amar","Amit","Ajay","Ashok","Alok"};
	    for(String var:name)	
	    {
		  System.out.println(var);
	    }
		
		
		
	}

}
