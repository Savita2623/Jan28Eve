package control_statement;

public class Example_Nested_if1 {
	
	public static void main(String[] args)
	{
		int PEM =100;
		int MEM=0;
		
		// 100>=300
		if(PEM >=300)     //Outer if
		{
			System.out.println("Eligibal for mains Exam");
		
		
     		// 700>=800
	    	if(MEM>=800)      //nested r inner if
		    {
			  System.out.println("Got Seected");
		    }
		
		   else
		   {
			 System.out.println("Rejected from mains exam: MEM<800");
		   }
	
		}
	
   	else 
	{
		System.out.println("Not Eligible for mains: PEM < 300");
	}

}
}