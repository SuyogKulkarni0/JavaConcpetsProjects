// Join Method help when Multiple Threads are working together but One 
//thread need other to stop until its execution is done
import java.util.Scanner;
public class JoinMethod extends Thread{
	static int sum=0,a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		JoinMethod j = new JoinMethod();	
		j.start();
		try{
			j.join(); // if You won't use this Join method then
			//Execution of Line Sysout after catch might happen when Sum was 
			//10 only for a = 5 numbers so Main thread should stop 
			//until Run() Function that is THTread-0 Executes its job  
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception nwas raised !!");
		}
		System.out.println("Sum from 1 till "+JoinMethod.a+" is "+JoinMethod.sum);
	}
	@Override
	public void run()
	{	
		for(int i=1;i<=JoinMethod.a;i++)
		{
			JoinMethod.sum +=i;
		}
	}

}
