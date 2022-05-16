
public class Test {
	static {
		
	}
	public static void main(String args[])
	{
		EventInterface e = new EventCreation();
		System.out.println(e.create(110, "Suyog", "Marriage").getId());
	}
}

