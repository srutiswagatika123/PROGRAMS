class A
{
   A(int x)
   {
   	System.out.println("para  Constructor "+x);
   }
  
}
class B extends A
{
    B(int x,int y)
    {
    	
    }
}
class Test
{
	public static void main(String arg[])
	{
	   
	   //B ob=new B(); error becuase B class parameter constructor
	   B obj=new B(10,20);
	}
}