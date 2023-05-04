package faq_javaprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swap "+"Value of a="+a +" & Value of b="+b);
		
	//Method(1)- Use 3rd Variable .........
  /*  	int temp=a;
		a=b;
        b=temp;
        System.out.println("After swap "+"Value of a="+a+" & Value of b="+b);  */
      //Method(2)-  use + & -  Operator ( Not Using 3rd Variable ).........   
  /*    a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap "+"Value of a="+a+" & Value of b="+b);  */
		
	 //Method(3)-  use * & /  Operator ( Not Using 3rd Variable )...
	/*	a=a*b;
		b=a/b;
		a=a/b;
	    System.out.println("After swap "+"Value of a="+a+" & Value of b="+b);    */
	//Method(4)-  use Single Statement ...	
		b= a+b -(a=b);
		System.out.println("After swap "+"Value of a="+a+" & Value of b="+b);
		
	}

}
