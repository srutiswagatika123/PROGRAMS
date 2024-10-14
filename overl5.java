abstract class A
{
	abstract void disp();  //abstarct method 
	int a;
	static int b;
	A()
	{
		System.out.println("AC");
	}
	static
	{
		System.out.println("static block A");
	}

	{
		System.out.println("non static block A");
	}
    void look()
    {
    	System.out.println("look concreate method ");
    }
}
 class B extends A 
{

	   B()
	   {
	   	 System.out.println("BC");
	   }
       void disp()
       {
       	System.out.println("disp method ");
       }
}
class Test
{
	public static void main(String arg[])
	{
	   A ob=new B(); //casting
	   ob.disp();
	   ob.look();
	}
}