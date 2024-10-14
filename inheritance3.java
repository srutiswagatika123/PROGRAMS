class A
{
	int x=10;
	void f1()
	{
	   System.out.println("f1 method ");
	}
}
class B  extends A
{
    int y=20;
     void f2()
     {
        System.out.println("f2 method ");
     }
	
}

class Test
{
	public static void main(String arg[])
	{
	    A ob=new A();
	    ob.f1();
	   // ob.f2(); error
	    System.out.println(ob.x);
	    //System.out.println(ob.y); error
	}
}