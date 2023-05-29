package inheritance;

public class HirarchicalInheritance 
{
   public static void main(String[] args) 
   {
	
	   System.out.println("-----Features Of HSon1-----");
	   
	   HSon1 s1 = new HSon1();
	   s1.bike();
	   s1.car();
	   s1.money();
	   s1.home();
	   
       System.out.println("-----Features Of HSon2-----");
	   
	   HSon2 s2 = new HSon2();
	   s2.mobile();
	   s2.car();
	   s2.money();
	   s2.home();
	   
      System.out.println("-----Features Of HSon3-----");
	   
	   HSon3 s3 = new HSon3();
	   s3.laptop();
	   s3.car();
	   s3.money();
	   s3.home();
	   
	   
}
}
