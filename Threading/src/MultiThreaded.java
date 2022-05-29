import java.lang.*;
public class MultiThreaded extends Thread{
	//Multi-threading is achieved through 
	//extending Thread Class or Implementing Runnable Interface

	public static void main(String[] args) {
		MultiThreaded mt = new MultiThreaded();
		mt.start();
	    // This will create a seperate thread space and will create a new thread
		//mt.run();
		//This will not create a separate thread space and will run as regular function call
		System.out.println();
		for(int i=0;i<100;i++)
		{
			System.out.print("i :"+i+"\t");
		}
	}
	public void run() // Overriding the run() from Thread class
	{
		for(int j=0;j<100;j++)
		{
			System.out.print("j :"+j+"\t");
		}
	}

}
