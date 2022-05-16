import java.util.Scanner;

public class DemoClass {
	private String id;
	private String name;
	private String creditCard;
	// Keeping the Data member Private so that no other class can access it directly
	
	public void setdetails()
	{
		Scanner sc = new Scanner(System.in);
		id = sc.nextLine();
		name = sc.nextLine();
		creditCard = sc.nextLine();
	}
	//Setting the Private members with Public methods 
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getCreditCard()
	{
		return creditCard;
	}
	
}
