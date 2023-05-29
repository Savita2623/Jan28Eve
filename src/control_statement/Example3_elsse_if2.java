package control_statement;

public class Example3_elsse_if2 {
	public static void main(String[] args)
	{
		int marks =77;
		
		//33>=65
		if(marks>=65) 
		{
			System.out.println("Distingtion");
		}
		
		//33>=60   62<=64
		else if(marks>=60 & marks<=64)   //60 to 64
		{
			System.out.println("1st class");
		}
		
		//33>=50  & 56<=59
		else if(marks>=50 & marks<=59)     //50 to 59
		{
			System.out.println("2nd class");
		}
		
		//33>=35  &  45<=49
		else if(marks>=35  & marks<=49)     //35 to 49
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
	}

}
