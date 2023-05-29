package mock;

public class Palidrome {
	
	public static void main(String[] args)
	{
		String str= "MADAM";
		String reverse="";
		
		for(int i=0; i<=str.length()-1; i++)
		{
			reverse= reverse + str.charAt(i);			
			
			System.out.println(reverse);
			
		}
		
		
	}

}
