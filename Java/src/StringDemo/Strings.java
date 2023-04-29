package StringDemo;

public class Strings {

	public static void main(java.lang.String[] args) {
	String name ="Hello World ";
	
	int l=name.length();      // count the size of String
	System.out.println(l);   
    System.out.println(name.toLowerCase());  // convert to lowercase
    System.out.println(name.charAt(0));      // print index character
    System.out.println(name.charAt(1)); 
    System.out.println(name.charAt(3));
    System.out.println(name.charAt(5));
    System.out.println(name.charAt(8));
    System.out.println(name.charAt(10));
    
    String x="  Hello   World    ";
    String y="Welcome Amar";
    String z= "welcome amar";
    System.out.println(z.toUpperCase());  // convert to uppercase letter
    System.out.println(x.trim());  //Trim both side Space
    String  word= name.concat(y);  //Adding to String using concat method
    System.out.println(word);
    
    boolean result=x.contains("Hello"); //using contains method
    System.out.println(result);
    System.out.println(y.equalsIgnoreCase(z));  //Equalignorecase Method
    System.out.println(y.equals(z));        //Equals  Method
    
    
	}

}
