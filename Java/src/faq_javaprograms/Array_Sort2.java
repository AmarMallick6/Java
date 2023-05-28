package faq_javaprograms;

import java.util.Arrays;

public class Array_Sort2 {

	public static void main(String[] args) {
		 int[] a = {1,4,9,7,5,3};
		 System.out.println("Before Sorting "+ Arrays.toString(a));
		 int n=a.length;
		 for(int i=0;i<n-1;i++)
		 {
		  for(int j=0;j<n-1;j++)
			 {
				 if(a[j]>a[j+1])
				 {
					 int temp=a[j];
					  a[j]= a[j+1];
					  a[j+1]=temp;
				 }
			 }
		 }
		 System.out.println("Arrays after Sorting "+ Arrays.toString(a));
		 System.out.println(n);
	}

}
