abstract class A
{
	abstract void disp();

}
 class B extends A 
{
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
	}
}