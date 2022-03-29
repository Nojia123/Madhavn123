package y_Arrays;

public class Pune {

	public static void main(String[] args) {
		
		int a [] = {10,20,30,40,50}; // this declaration is without new keyword
		int [] b = {60,70,8,80,90};  //
		
		int c [] = new int [4] ; // declaration with new keyword and size
		int [] d = new int [5];
		
		c[1] = 11 ;
		c[2] = 12;
		c[3] = 13;
		d[0] = 14;
		d[2] = 15;
		d[4] = 16;
		
		System.out.println(a[0]);
		System.out.println(c[0]);
		System.out.println(b[3]);
		System.out.println(d[4]);
		
		int size = a.length;
		System.out.println(size);
		
		//printing values of array-------------------------
		
		for (int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}		
		System.out.println(" ");
		
	
	// reversing values of array
		for (int j= size-1; j>=0; j--)
		{
			System.out.print(a[j]+ " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
