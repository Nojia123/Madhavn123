package javaProject;

public class Demo1 {
	int a;
	int b;
	int c;
	int d;	
	// without parameter
	public Demo1() {

	a=10;
	b=20;	
	}	
	//With parameter
	public Demo1(int g, int h) {
	c=30;
	d=15;	
	}	
	public void addition() {
		System.out.println("addition: "  + (a+b));
	}	
	public void Multiplication() {
		
		System.out.println("Multiplication: " + (c*d));
	}
	
	public static void main(String[] args) {		
		Demo1 d = new Demo1();
		d.addition();
		
		Demo1 e = new Demo1(12,13);
		e.Multiplication();
	}
	
}
