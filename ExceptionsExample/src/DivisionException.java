import java.util.Scanner;

public class DivisionException {
	private int a,b,c;
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a/b;
		System.out.println("Division is : "+c);
		System.out.print("More code comes here .. ");
	}

	
}
