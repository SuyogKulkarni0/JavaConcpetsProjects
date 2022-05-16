
public class Test {

	public static void main(String[] args) {
		AppleLaptop a = new MacBook();
		a.start();
		a.shutdown();
		AppleLaptop ab = new MacBookAir();
		ab.start();
		ab.shutdown();
	}

}
