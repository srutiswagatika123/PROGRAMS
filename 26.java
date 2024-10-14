class Test
{
	
	Test()
	{
         System.out.println("dc");
	}
	Test(int x)
	{
		System.out.println("pc");
	}
	void show(int a)
	{
		System.out.println("show "+a);
	}
	void show(int a,int b)
	{	
		System.out.println("show "+a+" "+b);

	}
	void disp()
	{
          System.out.println("disp method ");
	}
	public static void main(String arg[])
	{
          Test t=new Test();
          Test t1=new Test(10);
          t.show(5);
          t.show(30,40);
          t.disp();
	}
}