package Test;

public class Throw {
	public static void Validate(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		Validate(14);
		System.out.println("Remaining code");
		
		// TODO Auto-generated method stub

	}

}
