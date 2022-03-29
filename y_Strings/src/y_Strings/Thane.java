package y_Strings;

public class Thane {

public static void main(String[] args) {
	String a = "rameshwar kashi kedarnath";
	String b = "Madhav went to school and enter school and leave school";
	
	
	System.out.println(a.substring(2));
	System.out.println(a.substring(1,4)); // in between 1 to 4 i.e. it takes in between characters
	System.out.println(b.substring(5, 20));
	
	
	String r = b.indent(5);
	System.out.println(r);
	
	System.out.println(b.indexOf('a'));
	System.out.println(b.lastIndexOf('v'));
	System.out.println(b.lastIndexOf('a'));
	
	System.out.println(b.indexOf("school"));
	//--------------------------------------------------------
	
	String c = "public class private class default class protected class ";	
	
	System.out.println(c.indexOf("class"));
	
	System.out.println(c.replace("a","ABC"));
	System.out.println(c.replace("class", "BATCH"));
	
	String [] s = c.split(" ");
	
	for (int i = 0; i< s.length; i++)
	{
		System.out.println(s[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
