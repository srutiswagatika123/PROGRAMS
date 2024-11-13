class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("iamlazy thread");
		}
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			System.out.println("i got interrupted");

		}
	}
}
class ThreadInterruptDemo1
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		System.out.println("end of main thread");
	}
}