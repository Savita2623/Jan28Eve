package Methods;

public class NSsample4 {
	
	//3. non-static regular method call from same class
	
	//main method
	
	public static void main(String[] args)
	{
		System.out.println("Hi");
		
		//classname objectname =new classname();
		
		NSsample4 s4 =new NSsample4();
		
		// step1 : create an object /instance of class 
		
		s4.m5();
		
		//step2: method call -> objectname.methodname();
		
		s4.m6();
		s4.m6();
	}
	 
	//non static --> Regular method
	public void m5()
	{
		System.out.println("Running non static regular method m5 from same class");
	}
	
	
	//non static --> Regular method
	public void m6()
	{
		System.out.println(" Running non static regular method m6 from same class");
	}
	
	

}
