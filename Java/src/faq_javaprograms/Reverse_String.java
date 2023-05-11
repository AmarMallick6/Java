package faq_javaprograms;

public class Reverse_String {

	public static void main(String[] args) {
		String s="ABCDEF";
		String revs="";
  //Using concatenation operator....................(1)
	/*	for(int i=s.length()-1;i>=0;i--)
		{
			revs=revs+s.charAt(i);
		}
        System.out.println("Reverse String is : "+ revs);*/
        
   //Using char Array Method.........................(2)
        char[] c=s.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
        	revs=revs+c[i];
        }
        System.out.println("Reverse String is : "+ revs); 
        
    //Using String Buffer class...................(3) 
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
	}

}
