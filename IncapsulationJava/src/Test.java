
public class Test {

	public static void main(String[] args) {
		DemoClass c =new DemoClass();
		c.setdetails();
		int empid =Integer.parseInt(c.getId());
		System.out.println("Name : "+c.getName());
		System.out.println("Emp Id : "+empid);
		System.out.println("CreditCard Details : "+c.getCreditCard());
		System.out.println(((Object)empid).getClass().getSimpleName());
	}

}
