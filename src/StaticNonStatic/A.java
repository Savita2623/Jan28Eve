package StaticNonStatic;

public class A {
	

	int a =10;
	static int b = 20;
	
	public static void main(String[] args)
	{
		A  r = new A();
		r.disp();
		A.show();
	}

	static void show()
	{
		System.out.println("show()" +b);
	}
	
	void disp()
	{
		System.out.println("disp()" +a+" "+b);
	}
}
