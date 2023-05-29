package AccessSpecifiers1;

public class Sample1 {
	
	//Example1: of private access specifires
	
	private int a;
	
	private Sample1()
	{
		a = 1;
	}
	
	private void printSquareOfNumber()
	{
		System.out.println(a*a);
	}
	
	public static void main(String[] args) 
	{
		Sample1 s1= new Sample1();
		System.out.println(s1.a);
		s1.printSquareOfNumber();
	}
}
