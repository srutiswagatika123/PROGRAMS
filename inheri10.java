class A
{
   A()
   {
   	System.out.println("A zero argument Constructor ");
   }
  
}
class B extends A
{
    B()
    {

    	 System.out.println("B zero argument Constructor ");  
    // super(); error  call to super must be first statement in constructor
         
    }
}
class Test
{
	public static void main(String arg[])
	{
	   
	   B ob=new B();
	}
}