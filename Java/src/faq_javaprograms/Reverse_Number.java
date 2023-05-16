package faq_javaprograms;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Number :");
		int num=sc.nextInt();
  //Using Algorithm method............................................
	/*	int rev=0;
		while(num!=0)
		{
			rev= rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse Number: "+ rev);*/
		
	//Using Stringbuffer class....................................
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer reverse=  sb.reverse();
		System.out.println("Reverse value :"+ reverse);
		
	//Using Stringbuilder class....................................	
		StringBuilder sbl =new StringBuilder();
		sbl.append(num);
		StringBuilder r=sbl.reverse();
		System.out.println("R value = "+r);
		
		
	}

}
