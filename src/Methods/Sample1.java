package Methods;

public class Sample1 {
	
	//1. Static regular method call from same class --> methodname()
	//main method()
	
	public static void main(String[] args)   //predfined method
	{
		System.out.println("Hi");
		
		m1();    //methodname();
		m2();
		
		
		System.out.println("Hello");
	}
	
	// Static --> Regular Method
	
	public static void m1()  // user defined method(methodname = m1)
	{
		System.out.println("Running Regular method:m1");
	}
	
	// Static --> regular method
	
	public static void m2()
	{
		System.out.println("Running regular method: m2");
	}
}
