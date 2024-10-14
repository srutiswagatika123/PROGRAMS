class A
{
   A(int x)
   {
   	System.out.println("A class para  Constructor "+x);
   }
    A()
    {
    	System.out.println("A class zero argument constructor ");
    }
}
class B extends A
{
    B(int x,int y)
    {
    	super(x);
    	System.out.println("child  Constructor "+y);
    }
    B()
    {
    	 //super() by default
    	System.out.println("B class zero argument constructor ");
    }
}
class Test
{
	public static void main(String arg[])
	{
	   
	   B ob=new B(); 
	   B obj=new B(10,20);
	}
}