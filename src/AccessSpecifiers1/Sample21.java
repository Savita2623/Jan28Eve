package AccessSpecifiers1;

public class Sample21
{
      //example3: protected access specifier
	
	protected int d;
	
	protected Sample21()
	{
		d=40;
	}
	
	protected void printSquareNum()
	{
		System.out.println(d*d);
	}
	
	public static void main(String[] args) {
		
		Sample21 s21=new Sample21();
		s21.printSquareNum();
		System.out.println(s21.d);
	}
}
