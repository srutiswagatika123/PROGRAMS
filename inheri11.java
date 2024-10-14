class A
{
   private int x;
   A()
   {
   	x=10;
   }
   void show()
   {
   	System.out.println(x);
   }

}
class B  extends A
{
    private int y;
    B()
    {
    	y=20;
    }
    void disp()
    {
    	System.out.println(y);
    }
    
}

class Test
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    ob.show();
	    ob.disp();
	    
	   
	}
}