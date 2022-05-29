
public class ThreadExecutionTime extends Thread{

	public static void main(String[] args) throws InterruptedException{
		long start = System.currentTimeMillis();
		ThreadExecutionTime t = new ThreadExecutionTime();
		t.start();
		for(int i=0;i<100;i++)
		{
			System.out.print("j :"+i+"\t");
			Thread.sleep(100);
		}
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken both the threads to execute was together "+(end-start)/1000+" seconds");
	}
	@Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.print("i: "+i+"\t");
			try {
			Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Interruption has been caught !!");
			}
		}
		
	}

}
