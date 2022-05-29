
public class SingleThreaded {

	public static void main(String[] args) {
		SingleThreaded st = new SingleThreaded();
		st.printNumber();
		System.out.println();
		for(int j=0;j<200;j++)
		{
			System.out.print("j :"+j+"\t");
		}
	}
	public void printNumber()
	{
		for(int i=0;i<200;i++)
		{
			System.out.print("i : "+ i+"\t");
		}
	}
}
