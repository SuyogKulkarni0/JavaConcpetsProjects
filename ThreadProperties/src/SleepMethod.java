
public class SleepMethod extends Thread{
	public static void main(String[] args) throws InterruptedException{
		SleepMethod s = new SleepMethod();
		s.start();
		for(int i=0;i<100;i++)
		{
			System.out.print("j: "+i+"\t");
			Thread.sleep(100);
		}
		
	}
	@Override
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.print("i :"+i+"\t");
			try {
			Thread.sleep(100); // sleep is a Static method of Thread class that makes Thread do nothing for Argumented Mili seconds
			}catch(InterruptedException e)
			{
				System.out.print("THe Exception has been raised !!");
			}
		}
		
	}
}
