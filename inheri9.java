class A
{
    int x;

}
class B  extends A
{
     int y;
    
}

class Test
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    System.out.println(ob.x);
	    System.out.println(ob.y);
	    
	   
	}
}