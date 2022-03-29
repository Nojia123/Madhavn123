package y_Strings;

public class String_Methods {

public static void main(String[] args) {
	
	String a = "Velocity";
	String b = "Velocity";
	
	String c = new String ("Velocity");
	String d = new String ("Velocity");
	
	boolean result = a.equals("velocity");  //F
	System.out.println(result);
	
	System.out.println(b.equals(a));//t  // this methods will compare the content not addresses
	System.out.println(b.equals(c));//t  //return type of the mtd is boolean and it supports the String type of 
                                         //arguments as well as objects    
	
	System.out.println(a.equalsIgnoreCase("velocity")); //t //
	
    System.out.println(a.toUpperCase());  //return type is String
	System.out.println(a.toLowerCase());
	
    boolean result1= a.equalsIgnoreCase(b);
	System.out.println(result1);
	
	String m = a.toLowerCase();
	System.out.println(m);
	//-----------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
