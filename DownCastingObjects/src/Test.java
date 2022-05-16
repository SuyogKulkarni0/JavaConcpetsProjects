
public class Test {

	public static void main(String[] args) {
		DownCastParent c = new DownCastChild();
		c.start();
		DownCastChild d = (DownCastChild)c;
		d.Disp();
	}

}
