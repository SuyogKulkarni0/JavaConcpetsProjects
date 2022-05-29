

//setPriority is a Method of Thread class that is used to set the priority to thread as 
//minimum maximum and default on the scale of 1 to 10 where 1 being least and 10 being max 
//and 5 as default medium priority
// Still this is just a tact to set but it depends on JVM which thread to execute first
public class ThreadPriority extends Thread{

	public static void main(String[] args) {
		ThreadPriority thread2 = new ThreadPriority();
		thread2.setPriority(MIN_PRIORITY);
		thread2.setName("Thread2");
		thread2.start();
		ThreadPriority thread1 = new ThreadPriority();
		thread1.setPriority(MAX_PRIORITY);
		thread1.setName("Thread1");
		thread1.start();
		
	}
	@Override
	public void run()
	{
		System.out.println("Name of Thread under Execution : "+Thread.currentThread().getName());
	}

}
