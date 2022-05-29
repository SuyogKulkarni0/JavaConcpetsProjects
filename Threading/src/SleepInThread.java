
public class SleepInThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		for(int j=0;j<100;j++)
		{
			System.out.print("j: "+j+"\t");
			Thread.sleep(100);
		}
		
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.print("i :"+i+"\t");
			try {
			Thread.sleep(100);
			}catch(InterruptedException e)
			{
				System.out.println("Child Thread Exciting");
			}
		}
		
	}
	

}
