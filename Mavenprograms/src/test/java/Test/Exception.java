package Test;

public class Exception {
	

	public static void main(String[] args) {
		try
		{
			int d= 20/0;
		}
		catch(NullPointerException a)
		{
			System.out.println(a);
		}
		finally
		
		{
		System.out.println("Final block");	
		}
		
		System.out.println("Remaining code");
	

		
		// TODO Auto-generated method stub

	}

}
