package faq_javaprograms;

import java.util.Arrays;

public class Array_Sort1 {

	public static void main(String[] args) {
		 int[] a = {1,4,6,7,8,0,2,3,9};
		 System.out.println("Before Sorting "+ Arrays.toString(a));
	//	 Arrays.sort(a);  //(Method-1)
		 Arrays.parallelSort(a);     //(Method-2)
		 System.out.println("After Sorting "+ Arrays.toString(a));
		 

	}

}
