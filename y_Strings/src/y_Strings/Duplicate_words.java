package y_Strings;

public class Duplicate_words {
	public static void main(String[] args) {
		
//		String a = "big black bug bit a big black dog on his big black nose";  
	

		
		String a = "big black bug bit a big black dog on his big black nose";
		
		String s [] = a.split(" "); 
		int b = s.length;
		System.out.println(b);
		
		
		for (int i =0; i<b ; i++)
		{
			for(int j=i+1 ; j<b ; j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println(s[j]);
				}
				
			}
		}
		
		
		


		
	
	
		
		
		
	}
}
