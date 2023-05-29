package UDConstructor;

public class Sample3 {

	// example2: User Defined Constructor
	
	//Step1: Declaration Variable
	
	int num1;    //10
	int num2;    //20
	
	
	//Step 2: variable initialization
	//User defined constructor  --> Provided by user
	//Use1: Initialize global variable
	//use2: Copy/load all the numbers of class into object
	
	Sample3()
	{
		num1= 10;
		num2= 20;
	}
	
	//step3: usage
	
	public void addition()
	{
		System.out.println(num1+num2);
	}
	
	public void multiplication()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		Sample3 s3 = new Sample3();    //user defined constructor call from same class
		
		s3.addition();                 // 30
		s3.multiplication();           //200
		
		System.out.println("------------------------");
		
		Sample4 s4 = new Sample4();  //User defined constructor call from different class
		
		s4.sub();  //20
		
	}
}
