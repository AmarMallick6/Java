package this_keyworddemo;

public class This_Varriable {
	
	   int b;
       int c;
     public  This_Varriable(int b,int c) 
      {
    	 this.b=b;
    	 this.c=c;
      }
     public  void sum() 
     {
    	 int add=b+c;
   	     System.out.println(add);
     }
	
	public static void main(String[] args) {
		
		This_Varriable object=new This_Varriable(25,50);
		object.sum();

	}

}
