package NSMethods;

public class Sample7 {
	
	// method without / zero parameter
	
	public static void main(String[] args)
	{
		//1: Static regular method call from same class --> methodname();

	
		m1();
		
		//2: static regular method call from diff class--> diffclassname.methodname()
		 
		 Sample8.m2();
		 
		 //3: non-static regular method call from same class
		 
		 Sample7 s7= new Sample7();
		 
		 //step1: create an object same class
		 
		 s7.m3();
		 //step2: method call --> objectname.methodname()
		 
		 //4: non-static regular method call from diff class
		 
		 Sample8 s8 = new Sample8();
		 
		 //step1: crete an object off diff class
		 
		 s8.m4();
		 // step2: method call --> diffclassobject.methodName();
		 
		 Sample6 s6=new Sample6();
		 s6.m7();
		 
		 s6.m8();
		 
	}
	
	// method without parameter
	
	public static void m1()
	{
		System.out.println("Running static regular method m1: from same class");
	}
	
	// method without parameter
	
	public void m3()
	{
		System.out.println("running non-static regular method m3: from same class");
	}

}
