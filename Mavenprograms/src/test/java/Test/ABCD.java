package Test;

public class ABCD {
	public static void main(String[] args) {
		try
		{
			int d= 20/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Remaining code");
	


}
}