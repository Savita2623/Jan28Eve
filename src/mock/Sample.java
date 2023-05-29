package mock;

public class Sample {
	
	private int a;    // private accessspecifer
	
	int num=10;
	
	Sample()
	{
		a=10;
		
	}
   
	 public void m1()
	 {
		 System.out.println(a);
	 }
	 
	 public static void main(String[] args) 
	 {
	      Sample s = new Sample();
	      s.m1();
	}
}
