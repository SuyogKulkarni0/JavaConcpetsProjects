
public class ThreadByInterface implements Runnable{
	@Override
	public void run()
	{
		System.out.println("Thread is created !!");
	}
	public static void main(String[] args) {
		ThreadByInterface tbi = new ThreadByInterface();
		Thread t = new Thread(tbi);
		t.start();
	}

}
