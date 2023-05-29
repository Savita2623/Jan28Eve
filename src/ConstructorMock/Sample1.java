package ConstructorMock;

public class Sample1 {
	
	int num1;
	int num2;
	
	Sample1()
	{
		num1= 10;
		num2= 20;
		
	}
	
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
    	Sample1 s1 = new Sample1();
    	
    	s1.addition();
    	s1.multiplication();
    	
    	System.out.println("------------------");
    	
    	Sample2 s2=new Sample2();
    	
    	s2.sub();
    	
    	
    }
}
