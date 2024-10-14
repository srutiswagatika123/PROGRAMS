class A
{
	public void show()
	{
	   System.out.println("p show ");
	}
	void disp()
	{
         System.out.println("disp method ");
	}
}
class B extends A
{
	public void show()
	{
	   System.out.println("c show ");
	}
}
class Test
{
	public static void main(String arg[])
	{
	  A ob=new B();
	  ob.show();
	}
}