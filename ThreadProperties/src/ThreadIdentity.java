
public class ThreadIdentity extends Thread{

	public static void main(String[] args) {
		ThreadIdentity th = new ThreadIdentity();
		th.start();
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
	public void run()
	{
		Thread.currentThread().setName("Suyog's Thread");
		System.out.println("Name of the Thread :" + Thread.currentThread().getName());
	}

}
