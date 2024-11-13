class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("lazy thread");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{}
		}
	}
}
class DaemonThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.setDaemon(true); 
		t.start();
		System.out.println("end of main Thread");
	}
}