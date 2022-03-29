package y_Strings;

public class Pune {

public static void main(String[] args) {
	
	
	String a = "Velocity";    // this type of declaration doesn't create another address 
	String b = "Velocity";   //for the same value (content)
	
	String c= new String("Velocity");  // this will create a new addresss everytime as we r using new keyword
	String d= new String("Velocity");

	// compares the addresses of the Strings
	System.out.println(a==b);  //T
	System.out.println(a==c); //F
	System.out.println(a==d);//f
	
	System.out.println(c==d); //F ---As it is creating new address everytime
	System.out.println(c==a);//F
	System.out.println(c==b);//F
	//---------------------------------------------------------------------------------------
	
	
	String p = "Velocity";
	String q = "velocity";
	System.out.println(p==q); //f because it is case sensitive and it will create another address
	//-----------------------------------------------------------------------------------------------
	
	String s = "Velocity";
	String r = "Velocity";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
