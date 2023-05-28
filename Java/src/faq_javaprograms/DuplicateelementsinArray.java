package faq_javaprograms;



public class DuplicateelementsinArray {

	public static void main(String[] args) {
		int[]num = {1,2,2,1,3,7,4,5,5,3};
		int l=num.length;
		boolean ele=false;
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[i]);
					ele=true;
				}
			}
		}	
					
		if(ele==false)
		{System.out.println("NO Duplicate Element Available");}
       
	}

}
