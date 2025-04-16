package Test;

public class EFGH {

	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			int c=30/0;
			//System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			
		System.out.println("Exception handled");
		System.out.println(e);
		}
		finally
		{
		System.out.println(	"Final block");
		}
		System.out.println("Remaining code");
		// TODO Auto-generated method stub

	}

}
