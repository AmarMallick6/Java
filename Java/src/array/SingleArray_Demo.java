package array;

public class SingleArray_Demo {

	public static void main(String[] args) {
		int [] x= new int[4];  //Declarying Array
		 x[0]=15;              //Adding Value in Array
		 x[1]=10;
		 x[2]=25;
		 x[3]=50;
		 int y = x.length;    // count the size of Array
		 System.out.println(y);  
		 
		 for(int z:x)        //print alldata present in array using enhance for loop
		 {
			System.out.println(z); 
		 }
	//Modify Existing value in Array..........
		x[1] =30;
		x[3]=99;
		System.out.println("New Value after update "+x[1]); 
		System.out.println("New Value after update "+x[3]);  
		for(int i=0;i<x.length;i++)  //print alldata present in array using for loop
		{
			System.out.println(x[i]);
		}
	}

}
