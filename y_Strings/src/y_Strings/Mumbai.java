package y_Strings;

public class Mumbai {

public static void main(String[] args) {
	
	String a = "Velocity ";
	String b = "Velocity";
	
	String c = new String ("Yogeshwar");
	String d = new String ("Ram");
	
	int r = a.length();       // return type is integer
    System.out.println(r);    // 
	
    System.out.println(b.length());
	
    char r1 = a.charAt(4);   // return type is char
	System.out.println(r1);
	System.out.println(c.charAt(0));
	
	System.out.println(a.concat(d));
	System.out.println(a.concat("Sham"));
	
	System.out.println(a + "Hare");
	
	System.out.println("Pune "+ b);
	
	//----------------------------------------------------
	
	
	System.out.println(b);
	
	for (int i = (b.length()-1) ; i>=0; i-- )
	{
		System.out.print(b.charAt(i));
	}
	System.out.println("");
	//---------------------------------------------
	//To reverse the String
	String t = "";        //create a empty sample space
	System.out.println(c); // print value
	
	for (int j =( c.length()-1); j>=0; j-- )  //write a loop in opposite order
	{
		t= t+ c.charAt(j);   // t sobat ch concat kelay 
	}
	c=t;                    // t chi value c la assign keli
	System.out.println(c);   //aani mg c chi value print keli ji ki reverse zaleli asel
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
