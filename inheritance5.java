class A
{
	private int x=10;
	private void f1()
	{
	   System.out.println("f1 method ");
	}
}
class B  extends A
{
    int y=20;
     void f2()
     {
     	   //f1(); error  private data not acess in child class
     	   //System.out.pritln(x); error
        System.out.println("f2 method ");
     }
	
}

class Test
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    ob.f2();
	    
	}
}