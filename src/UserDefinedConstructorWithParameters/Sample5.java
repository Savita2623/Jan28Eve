package UserDefinedConstructorWithParameters;

public class Sample5 {

	//Eample3: User Defined Constructor with Parameter
	
	//declaration
	
	int num1;      //5
	int num2;      //6
	
	//Step2:Initialization
	//User defined constructor with 2 int(int, int) parameter
	//use1: to initialize global variable
	//use2: copy all the members of class into object
	
	Sample5(int a, int b)        //10,     20      //declaration
	{
		num1=a;        //5      //assign local variable info into global variable
		
		num2=b;        //6
	}
	
	//step3:  usage
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mul()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		Sample5 s5=new Sample5(10, 20);      // initialization of local variables
		
		s5.add();       //30
		s5.mul();       //200
		
		System.out.println("---------------");
		
	    Sample5 s6=new Sample5(5,6);
	    s6.add();      //11
	    s6.mul();      //30
	    
	    System.out.println("----------------");
	    
	    Sample6 s7=new Sample6(8, 6);
	    s7.sub();
	    
	    System.out.println("------------------");
	    
	    Sample6 s8=new Sample6(80, 60);
	    s8.sub();    //20
	}
}
